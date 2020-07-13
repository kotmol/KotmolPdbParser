/*
 * Copyright (C) 2016-2020 James Andreas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

@file:Suppress("unused", "unused_variable", "unused_parameter")

package com.kotmol.pdbParser

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Double.max
import java.lang.Double.min
import java.lang.Math.sqrt


/**
 * @author Jim Andreas
 * @email jim@kotmol.com
 * @link <a href='http://jcouture.net/cisc190/A19002.php'>Program Specification</a>
 * @link <br><a href='>https://github.com/kotmol/KotmolPdbParser</a>
 *
 */

// TODO: parse old version of Hydrogen atoms (e.g. 1HD)
// TODO: parse HETATM - convert "CO" in 1mat to single letter code (at atom 1967)

class ParserPdbFile internal constructor(
        builder: Builder
) {

    constructor() : this(Builder())

    class Builder constructor() {

        private lateinit var mol: Molecule
        private val bondinfo = BondInfo()
        private var maxX = 0.toDouble()
        private var maxY = 0.toDouble()
        private var maxZ = 0.toDouble()
        private var minX = 1e6
        private var minY = 1e6
        private var minZ = 1e6
        private lateinit var messageStrings: MutableList<String>

        fun setMessageStrings(messagesIn: MutableList<String>) = apply {
            messageStrings = messagesIn
        }

        fun loadPdbFromStream(inputStream: InputStream, molecule: Molecule) = apply {

            if (!this::messageStrings.isInitialized) {
                messageStrings = mutableListOf("")
            }
            mol = molecule
//        resetMoleculeMaxMin()
//        mol.clearLists()
            messageStrings.add("Hello from loadPdbFromStream")
            loadPdbFromInputStream(inputStream)
            /*
             * Todo: ?? addHelixSecondaryInformation - update for HELIX records
             */
            centerMolecule()
            mapBonds()
            buildPdbChainLists()
            addHelixSecondaryInformation()
            addSheetSecondaryInformation()
            connectResidues()
        }

        private fun loadPdbFromInputStream(inputStream: InputStream?) {
            val reader: BufferedReader
            var line: String?

            var skipToEnd = false
            try {
                requireNotNull(inputStream)
                reader = BufferedReader(InputStreamReader(inputStream))

                line = reader.readLine()
                while (line != null) {
                    if (line.length < 6) {
                        line = reader.readLine()
                        continue
                    }
                    if (line.substring(0, 6) == "CONECT") {
                        parseConect(line)
                    } else if (skipToEnd) { // hit an ENDMDL, skipping to CONECTs
                        line = reader.readLine()
                        continue
                    } else if (line.substring(0, 4) == "ATOM") {
                        parseAtom(line, PdbAtom.IS_ATOM)
                    } else if (line.substring(0, 6) == "HETATM") {
                        parseAtom(line, PdbAtom.IS_HETATM)
                    } else if (line.substring(0, 3) == "TER") {
                        parseTerRecord(line)
                    } else if (line.substring(0, 5) == "HELIX") {
                        parseHelix(line)
                    } else if (line.substring(0, 5) == "SHEET") {
                        parseBetaSheet(line)
                    } else if (line.substring(0, 6) == "ENDMDL") {  // only do the 1st model
                        skipToEnd = true
                    }
                    line = reader.readLine()
                }

                reader.close()
                inputStream.close()
            } catch (e: IOException) {
                messageStrings.add("IO error reading the stream")
                return
            }


        }

        /*
         * walk the list of atoms.
         *    For each residue, attempt to connect the standard atoms in the polymeric chain.
         *    Check the atom to atom spacing for error correction
         */
        private fun connectResidues() {
            // val resname_to_bonds = mBondTemplate.residueToBondHash

            var totalDistance = 0f
            var count = 0
//        val last_residue_name: String? = null
            var anAtom: PdbAtom?
            var lastAtom: PdbAtom? = null
            var lastResidueSequenceNumber = 0
            for (i in 0 until mol.numList.size) {
                anAtom = mol.atoms[mol.numList[i]]
                if (anAtom == null) {
                    messageStrings.add(String.format("connectResidues: error - got null for %s", mol.numList[i]))
                    continue
                }
                // rely on CONECT records for HETATM
                if (anAtom.atomType == PdbAtom.IS_HETATM) {
                    continue
                }
                if (anAtom.atomName == "O3'" || anAtom.atomName == "C") {
                    lastResidueSequenceNumber = anAtom.residueSeqNumber
                    lastAtom = anAtom
                } else if (anAtom.atomName == "P" || anAtom.atomName == "N") {
                    if (anAtom.residueSeqNumber == lastResidueSequenceNumber + 1 && lastAtom != null) {
                        // connect the atoms
                        val dist = anAtom.atomPosition.distanceTo(lastAtom.atomPosition)
                        if (dist < 2.0) {
                            totalDistance += dist.toFloat()
                            count++
                            addBond(anAtom, lastAtom)
                        } else {
                            val prettyPrint = String.format("%6.2f", totalDistance / count.toDouble())
                            messageStrings.add(String.format(
                                    "connectResidues: excessive bond dist = %s from atom %s to %s",
                                    prettyPrint,
                                    lastAtom.atomNumber,
                                    anAtom.atomNumber))
                        }
                        lastAtom = null
                    }
                }
            }

            /*if (count > 0) {
                val prettyPrint = String.format("%6.2f", totalDistance / count.toDouble())
                //Timber.i("connectResidues: ave connection distance = $prettyPrint")
            }*/

        }

        /**
         * mapBonds
         * Look for the initial atom in a residue.  Then call matchBonds
         * to iterate over the residue to map all the bonds within the residue
         *
         * Added "residue_insertion_code" to handle "duplicated" residue numbers
         * from the insertion of residues.
         */
        private fun mapBonds() {
            val resnameToBonds = bondinfo.kotmolBondLookup

            var residueName: String
            var anAtom: PdbAtom?
            var residueSequenceNumber: Int
            var residueInsertionCode: Char

            var i = 0
            while (i < mol.numList.size) {
                anAtom = mol.atoms[mol.numList[i]]
                if (anAtom == null) {
                    messageStrings.add(String.format(
                            "mapBonds: error - got null for %s", mol.numList[i]))
                    i++
                    continue
                }
                if (anAtom.atomType == PdbAtom.IS_HETATM) {
                    i++
                    continue
                }
                residueSequenceNumber = anAtom.residueSeqNumber
                residueInsertionCode = anAtom.residueInsertionCode
                residueName = anAtom.residueName.toLowerCase()

                if (!resnameToBonds.containsKey(residueName)) {
                    messageStrings.add(String.format(
                            "matchBonds: no matching info for residue %s at atom %d",
                            residueName,
                            anAtom.atomNumber))
                    i++
                    continue
                }
                val bondMap = resnameToBonds[residueName]
                if (bondMap == null) {
                    messageStrings.add(String.format(
                            "matchBonds: got null bond info for residue %s at atom %d",
                            residueName,
                            anAtom.atomNumber))
                    i++
                    continue
                }
                matchBonds(i, residueSequenceNumber, residueInsertionCode, bondMap)
                i++
                while (i < mol.numList.size) {
                    anAtom = mol.atoms[mol.numList[i]]
                    if (anAtom == null) {
                        messageStrings.add(String.format(
                                "mapBonds: error - got null for %d",
                                mol.numList[i]))
                        i++
                        continue
                    }
                    if (anAtom.residueSeqNumber != residueSequenceNumber
                            || anAtom.residueInsertionCode != residueInsertionCode) {
                        break
                    }
                    i++
                }
                if (i == mol.atoms.size) {
                    break
                } else
                    i--
                i++
            }
        }

        /**
         * matchBonds
         * for an initial atom - walk the residue to match each atom in the residue with a bonding
         * atom in the residue.   Basically build the bond table for the residue.
         * @param atomIndex   initial atom in the residue
         * @param residueSequenceNumber    which residue in the PDB file
         * @param residueInsertionCode     PDB code for inserted residues
         * @param bondListOriginal         the bond list for the residue
         */
        // TODO: rework to search the array instead of look up values in the map
        private fun matchBonds(
                atomIndex: Int,
                residueSequenceNumber: Int,
                residueInsertionCode: Char,
                bondListOriginal: List<BondInfo.KotmolBondRecord>) {

            // for each atom, pull a bond for the atom if any (might not be in list)
            // then search for the bonding atom in the residue.   It should be there.

            var currentAtom: PdbAtom?
            var loopAtom: PdbAtom?
            val bondList = ArrayList(bondListOriginal.map { it.copy() })

            // val ca_atom = false

            /*
             * interate through the atoms in the residue.   quit if there is an inserted
             *    residue (residue insertion code changes).
             * for each atom, search the residue for a bond match based on the bond table
             */
            var i = atomIndex
            while (true) {

                if (i == mol.numList.size) {
                    break
                }
                currentAtom = mol.atoms[mol.numList[i]]

                if (currentAtom == null) {
                    messageStrings.add(String.format(
                            "matchBonds: error - got null for %d", mol.numList[i]))
                    i++
                    continue
                }

                if (currentAtom.residueSeqNumber != residueSequenceNumber || currentAtom.residueInsertionCode != residueInsertionCode) {
                    break
                }

                /*
                 * scan the bondList for the currentAtom.   If there is a bond pair
                 * that hasn't already been added to the bond list, then add it
                 */

                val bondAtomName = findNextBond(currentAtom.atomName, bondList)
                if (bondAtomName != "") {
                    /*
                     * OK bondAtomName has the name of a atom in this residue type to which
                     * currentAtom is bonded.   Now to find that atom in the atomList
                     * for this residue
                     */
                    var j = atomIndex
                    while (true) {
                        if (i == j) { // skip a match to self
                            j++
                            continue
                        }
                        if (j == mol.numList.size) {
                            break
                        }
                        loopAtom = mol.atoms[mol.numList[j]]
                        if (loopAtom == null) {
                            messageStrings.add(String.format(
                                    "matchBonds: error - got null for %s", mol.numList[j]))
                            j++
                            continue
                        }
                        if (loopAtom.residueSeqNumber != residueSequenceNumber
                                || loopAtom.residueInsertionCode != residueInsertionCode) {
                            break
                        }
                        if (loopAtom.atomName == bondAtomName) {
                            addBond(currentAtom, loopAtom)
                            break
                        }
                        j++
                    }
                }
                if (currentAtom.atomBondCount == 0) {
                    mol.unbondedAtomCount++
                    messageStrings.add(String.format(
                            "matchBonds: pdbName: %s no CHARMM entry for atom %d in residue %s atomType %s",
                            mol.name, currentAtom.atomNumber, currentAtom.residueName, currentAtom.atomName ))
//                Timber.e("matchBonds file: " + mMol.name + " no CHARMM entry for atom " + currentAtom.atomNumber +
//                        " residue " + currentAtom.residueName + " type " + currentAtom.atomName)
                }
                i++
            }
        }

        /**
         * findNextBond
         * scan the copy of the Bond Records and return an unused bond partner if one exists.
         * to the bond table
         * @param atomName atom to match in the list
         * @param bondList - list of atom to atom bonds for the current residue
         */
        private fun findNextBond(atomName: String, bondList: ArrayList<BondInfo.KotmolBondRecord>): String {
            for (bond in bondList) {
                if (bond.bondRecordCreated) {
                    continue
                }
                if (atomName == bond.atom_1) {
                    bond.bondRecordCreated = true
                    return (bond.atom_2)
                }
                if (atomName == bond.atom_2) {
                    bond.bondRecordCreated = true
                    return (bond.atom_1)
                }
            }
            // no bond
            return ("")
        }


        /**
         * addBond
         * check for a pre-existing bond, and if none, add a bond from atom1 to atom2
         * to the bond table
         * @param atom1 from atom
         * @param atom2 to atom
         */
        private fun addBond(atom1: PdbAtom, atom2: PdbAtom) {
            if (atom1.atomBondCount > 0) {
                if (atom2.atomBondCount > 0) {
                    if (doesDuplicateBondExist(atom2, atom1)) {
                        return
                    }
                }
            }
            val bond = Bond(atom1.atomNumber, atom2.atomNumber)
            mol.bondList.add(bond)
            atom1.atomBondCount = atom1.atomBondCount + 1
            atom2.atomBondCount = atom2.atomBondCount + 1
        }

        /*
         * Walk the PDB Atom list and assemble lists of the chains
         */
        private fun buildPdbChainLists() {

            var anAtom: PdbAtom?

            var chainList: MutableList<ChainRenderingDescriptor> = ArrayList()
            var chain = ChainRenderingDescriptor()

            // set base chain_id to the chain_id of the first atom
            anAtom = mol.atoms[mol.numList[0]]
            if (anAtom == null) {
                messageStrings.add("buildPdbChainLists: error - first atom is null!")
                return
            }
            var currentChainIdChar = anAtom.chainId
            var residueSequenceNumber = anAtom.residueSeqNumber

            for (i in 0 until mol.numList.size) {
                anAtom = mol.atoms[mol.numList[i]]
                if (anAtom == null) {
                    messageStrings.add(String.format(
                            "buildPdbChainLists: error - got null for %d", mol.numList[i]))
                    continue
                }


                /*
                 * if this is a new residue sequence,
                 * then add the previous residue info to the list
                 */
                if (residueSequenceNumber != anAtom.residueSeqNumber) {
                    residueSequenceNumber = anAtom.residueSeqNumber
                    if (chain.backboneAtom != null) {
                        chainList.add(chain)
                        if (chain.guideAtom == null) {
                            messageStrings.add(String.format(
                                    "buildPdbChainLists: guide atom is null at atom %d", anAtom.atomNumber))
                            chain.guideAtom = chain.backboneAtom // HACK
                        }
                        chain = ChainRenderingDescriptor()
                    }
                }

                /*
                 * if this is a new chain, then add the old list to the
                 * molecule list of lists.
                 */
                if (currentChainIdChar != anAtom.chainId) {
                    currentChainIdChar = anAtom.chainId
                    if (chainList.size > 2) {
                        mol.listofChainDescriptorLists.add(chainList)
                        mol.ribbonNodeCount = mol.ribbonNodeCount + chainList.size
                        chainList = ArrayList()
                    } else {
                        chainList.clear()
                    }
                }

                // skip water for now
                if (anAtom.residueName == "HOH") {
                    continue
                }

                // don't build chains of HETATMs, rely on CONECT records for bonds
                if (anAtom.atomType == PdbAtom.IS_HETATM) {
                    continue
                }

                // basic linear chain of amino acid residues (polypeptide)
                when (anAtom.atomName) {
                    "CA" -> chain.backboneAtom = anAtom
                    "O" -> chain.guideAtom = anAtom
                    "N" -> chain.startAtom = anAtom
                    "C" -> chain.endAtom = anAtom
                }

                // strand of nucleic acid
                when (anAtom.atomName) {
                    "C5'" -> {
                        chain.backboneAtom = anAtom
                        chain.secondary_type = ChainRenderingDescriptor.NUCLEIC
                    }
                    "C1'" -> chain.guideAtom = anAtom
                    "O5'" -> chain.startAtom = anAtom
                    "O3'" -> chain.endAtom = anAtom
                    "C3'" -> chain.nucleicEndAtom = anAtom
                }

                // extract the guide atoms for rendering the nucleic ladder
                if (anAtom.residueName == "DC" || anAtom.residueName == "DT"
                        || anAtom.residueName == "C" || anAtom.residueName == "T"
                        || anAtom.residueName == "U") {
                    chain.nucleicType = ChainRenderingDescriptor.PURINE
                    when (anAtom.atomName) {
                        "N1" -> {
                            chain.nucleicCornerAtom = anAtom
                            anAtom.atomType = PdbAtom.IS_NUCLEIC
                        }
                        "C2" -> chain.nucleicGuideAtom = anAtom
                        "C6" -> chain.nucleicPlanarAtom = anAtom
                    }
                } else if (anAtom.residueName == "DA" || anAtom.residueName == "DG"
                        || anAtom.residueName == "A" || anAtom.residueName == "G"
                        // 2n0l  see: en.wikipedia.org/wiki/8-Oxoguanine
                        || anAtom.residueName == "8OG") {
                    chain.nucleicType = ChainRenderingDescriptor.PYRIMIDINE
                    when (anAtom.atomName) {
                        "N9" -> {
                            chain.nucleicCornerAtom = anAtom
                            anAtom.atomType = PdbAtom.IS_NUCLEIC
                        }
                        "C4" -> chain.nucleicGuideAtom = anAtom
                        "N7" -> chain.nucleicPlanarAtom = anAtom
                    }
                }

                // mark which atoms should be displayed for ribbon mode
                if (anAtom.atomName == "C1'"
                        || anAtom.atomName == "C2'"
                        || anAtom.atomName == "C3'"
                        || anAtom.atomName == "C4'"
                        || anAtom.atomName == "O4'") {
                    anAtom.atomType = PdbAtom.IS_NUCLEIC
                }/* || an_atom.atom_name.equals("N1") */
            }
            /*
             * finish up
             */
            if (chainList.size > 2) {
                if (chain.backboneAtom != null) {
                    chainList.add(chain)
                }
                mol.listofChainDescriptorLists.add(chainList)
                mol.ribbonNodeCount = mol.ribbonNodeCount + chainList.size
            } else {
                chainList.clear()
            }
        }

        /*
         * walk the list of helix records -
         *    search for the records in the ChainRenderingDescriptor list.
         *    update the secondary type for helix records.
         *    this will make it pretty easy to switch modes later when
         *       rendering the ribbon.
         */
        private fun addHelixSecondaryInformation() {
            var i: Int
            var j = 0

            val alphaHelixList = mol.helixList
            if (alphaHelixList.size == 0) {
                return
            }

            var initialResidueNumber: Int
            var initialChainIdChar: Char
            var terminalResidueNumber: Int
            var terminalChainIdChar: Char
            var list: List<*>? = null

            for (list_count in alphaHelixList.indices) {
                val pdbHelix = alphaHelixList[list_count]

                initialResidueNumber = pdbHelix.initialResidueNumber
                initialChainIdChar = pdbHelix.initialChainIdChar
                terminalResidueNumber = pdbHelix.terminalResidueNumber
                terminalChainIdChar = pdbHelix.terminalChainIdChar

                val listOfLists = mol.listofChainDescriptorLists
                var found = false
                i = 0
                while (i < listOfLists.size) {
                    list = listOfLists[i]
                    j = 0
                    while (j < list.size) {
                        val item = list[j] as ChainRenderingDescriptor
                        if (item.backboneAtom!!.chainId == initialChainIdChar && item.backboneAtom!!.residueSeqNumber == initialResidueNumber) {
                            item.secondary_type = ChainRenderingDescriptor.ALPHA_HELIX
                            found = true
                            break
                        }
                        j++
                    }
                    if (found) {
                        break
                    }
                    i++
                }
                if (!found) {
                    messageStrings.add(String.format(
                            "HELIX residue not found - number %d chain char %c",
                            initialResidueNumber, initialChainIdChar))
//                Timber.e(mPdbFileName +
//                        ": HELIX residue not found - number " + initialResidueNumber +
//                        " chain char: " + initialChainIdChar)
                    continue
                }
                /*
                 * Walk the "list" of
                 * ChainRenderingDescriptors and mark the records as HELIX.
                 * At the last record flip the boolean to flag it.
                 */
                var nextItem: ChainRenderingDescriptor? = null
                while (j < list!!.size - 1) {
                    nextItem = list[j + 1] as ChainRenderingDescriptor
                    nextItem.secondary_type = ChainRenderingDescriptor.ALPHA_HELIX
                    if (nextItem.backboneAtom!!.chainId == terminalChainIdChar && nextItem.backboneAtom!!.residueSeqNumber == terminalResidueNumber) {
                        nextItem.endOfSecondaryStructure = true
                        break
                    }
                    j++
                }
                /*
                 * shouldn't happen but error check to make sure we found the terminating residue
                 */
                if (nextItem != null && !nextItem.endOfSecondaryStructure) {

                    messageStrings.add(String.format(
                            "terminating HELIX residue not found- number %d chain char %c",
                            terminalResidueNumber,
                            terminalChainIdChar))
//                Timber.e(mPdbFileName +
//                        ": terminating HELIX residue not found- number " + terminalResidueNumber +
//                        " chain char: " + terminalChainIdChar)
                    nextItem.endOfSecondaryStructure = true
                }
            }
        }


        /*
         * walk the list of helix records -
         *    search for the records in the ChainRenderingDescriptor list.
         *    update the secondary type for helix records.
         *    this will make it pretty easy to switch modes later when
         *       rendering the ribbon.
        */
        private fun addSheetSecondaryInformation() {
            var i: Int
            var j: Int

            val betaSheetList = mol.pdbSheetList
            if (betaSheetList.size == 0) {
                return
            }

            var initialResidueNumber: Int
            var initialChainIdChar: Char
            var terminalResidueNumber: Int
            var terminalChainIdChar: Char
            var list: List<*>? = null

            for (list_count in betaSheetList.indices) {
                val pdbSheet = betaSheetList[list_count]

                initialResidueNumber = pdbSheet.initialResidueNumber
                initialChainIdChar = pdbSheet.initialChainIdChar
                terminalResidueNumber = pdbSheet.terminalResidueNumber
                terminalChainIdChar = pdbSheet.terminalChainIdChar

                val listOfLists = mol.listofChainDescriptorLists
                var found = false
                i = 0
                while (i < listOfLists.size) {
                    list = listOfLists[i]
                    j = 0
                    while (j < list.size) {
                        val item = list[j] as ChainRenderingDescriptor
                        if (item.backboneAtom!!.chainId == initialChainIdChar && item.backboneAtom!!.residueSeqNumber == initialResidueNumber) {
                            item.secondary_type = ChainRenderingDescriptor.BETA_SHEET
                            found = true
                            break
                        }
                        j++
                    }
                    if (found) {
                        break
                    }
                    i++
                }
                if (!found) {
                    messageStrings.add(String.format(
                            "SHEET residue not found - number %d chain char: %c",
                            initialResidueNumber, initialChainIdChar))
//                Timber.e("%s: SHEET residue not found - number %d chain char: %c",
//                        mPdbFileName, initialResidueNumber, initialChainIdChar)
                    continue
                }
                /*
                 * Walk the "list" of
                 * ChainRenderingDescriptors and mark the records as BETA_SHEET.
                 * At the last record flip the boolean to flag it.
                 */
                var nextItem: ChainRenderingDescriptor? = null
                j = 0
                while (j < list!!.size - 1) {
                    nextItem = list[j + 1] as ChainRenderingDescriptor
                    nextItem.secondary_type = ChainRenderingDescriptor.BETA_SHEET
                    if (nextItem.backboneAtom!!.chainId == terminalChainIdChar && nextItem.backboneAtom!!.residueSeqNumber == terminalResidueNumber) {
                        nextItem.endOfSecondaryStructure = true
                        break
                    }
                    j++
                }
                /*
                 * shouldn't happen but error check to make sure we found the terminating residue
                 */
                if (nextItem != null && !nextItem.endOfSecondaryStructure) {
                    messageStrings.add(String.format(
                            "SHEET terminating residue not found - number %d chain char: %c",
                            initialResidueNumber, initialChainIdChar))
//                Timber.e("%s: SHEET residue not found - number %d chain char: %c",
//                        mPdbFileName, initialResidueNumber, initialChainIdChar)
                    nextItem.endOfSecondaryStructure = true
                }
            }
        }


        /*
         * scan the atom list looking for the C3-prime atom
         *   with the same chain_id.   Use this atom for
         *   the spline anchor.  Helper for formHelices().
         */

        private fun findSplineAnchor(
                sequence_id: Char,
                chain_id: Int,
                helix_list: MutableList<Helix>): Boolean {

            var anAtom: PdbAtom?

            for (i in 0 until mol.numList.size) {
                anAtom = mol.atoms[mol.numList[i]]
                if (anAtom == null) {
                    messageStrings.add(String.format(
                            "findSplineAnchor: error - got null for %d", mol.numList[i]))
                    continue
                }
                if (anAtom.chainId == sequence_id) {
                    if (anAtom.atomName != "C3'") {
                        continue
                    }
                    if (anAtom.chainId.toInt() != chain_id) {
                        continue
                    }
                    val helix = Helix()
                    helix.chain_id = sequence_id
                    helix.atom = anAtom
                    helix_list.add(helix)
                    return true
                }
            }
            return false
        }

        /*
         * adjust the XYZ of each atom
         * to move the entire molecule to the center of the viewport
         */
        private fun centerMolecule() {

            val maxX = maxX
            val maxY = maxY
            val maxZ = maxZ

            val minX = minX
            val minY = minY
            val minZ = minZ

            val centerX = (maxX - minX) / 2f + minX
            val centerY = (maxY - minY) / 2f + minY
            val centerZ = (maxZ - minZ) / 2f + minZ

            var anAtom: PdbAtom?
            for (i in 0 until mol.numList.size) {
                anAtom = mol.atoms[mol.numList[i]]
                if (anAtom == null) {
                    messageStrings.add(String.format(
                            "centerMolecules: error - got null for %d", mol.numList[i]))
                    continue
                }
                anAtom.atomPosition.x = anAtom.atomPosition.x - centerX
                anAtom.atomPosition.y = anAtom.atomPosition.y - centerY
                anAtom.atomPosition.z = anAtom.atomPosition.z - centerZ
            }

            val dcOffsetX = maxX - minX
            val dcOffsetY = maxY - minY
            val dcOffsetZ = maxZ - minZ

            mol.dcOffset = kotlin.math.sqrt(dcOffsetX * dcOffsetX + dcOffsetY * dcOffsetY + dcOffsetZ + dcOffsetZ)
        }

        /*
         * ParseAtom
         *   Assumptions:
         */
        private fun parseAtom(lineIn: String, atom_type_flag: Int) {
            var line = lineIn

            val vx: Double
            val vy: Double
            val vz: Double
            val atom = PdbAtom()
            try {

                // TODO: figure out why the reader sometimes reads short of full line (line 233 in 1ana.pdb)
                if (line.length < 78) {
                    line = "$line                                                                          "
                }
                atom.atomType = atom_type_flag

                atom.atomNumber = parseInteger(line.substring(7 - 1, 11).trim { it <= ' ' })
                atom.atomName = line.substring(13 - 1, 16).trim { it <= ' ' }
                atom.residueName = line.substring(18 - 1, 20).trim { it <= ' ' }
                atom.chainId = line[22 - 1]
                atom.elementSymbol = line.substring(77 - 1, 78).trim { it <= ' ' }

                /*
                 * skip hydrogens for now
                 * TODO: handle hydros
                 */
                if (atom.elementSymbol == "H") {
                    return
                }
                atom.residueSeqNumber = parseInteger(line.substring(23 - 1, 26).trim { it <= ' ' })
                atom.residueInsertionCode = line[27 - 1]
                vx = parseDouble(line.substring(31 - 1, 38).trim { it <= ' ' })
                vy = parseDouble(line.substring(39 - 1, 46).trim { it <= ' ' })
                vz = parseDouble(line.substring(47 - 1, 54).trim { it <= ' ' })

                // don't include HETATM in max / min calculation
                if (atom_type_flag == PdbAtom.IS_ATOM) {
                    maxX = max(maxX, vx)
                    maxY = max(maxY, vy)
                    maxZ = max(maxZ, vz)

                    minX = min(minX, vx)
                    minY = min(minY, vy)
                    minZ = min(minZ, vz)
                }

                atom.atomPosition = KotmolVector3(vx, vy, vz)

                // Decision: throw out OXT, O5T, and O3T atoms - no bond info - see README.md

                if (atom.atomName == "OXT" || atom.atomName == "O5T" || atom.atomName == "O3T") {
                    messageStrings.add(String.format(
                            "parseAtom: pdbName: %s atom is one of OXT, O5T, O3T, skipping", mol.name))
//                Timber.d("%s: atom is one of OXT, O5T, O3T, skipping", mMol.name)
                    return
                }

                /*
                 * check for "Alternate location indicator" at position 17
                 *    if present it is typically "A or B or ..."
                 * take only the A case (see README.md)
                 */
                if (line[17 - 1] != ' ') {
                    if (line[17 - 1] != 'A') {
                        messageStrings.add(String.format(
                                "parseAtom: pdbName: %s: Alternate location indicator is %c, skippping",
                                mol.name, line[17 - 1]))
//                    Timber.e("%s: Alternate location indicator is %c, skippping",
//                            mMol.name, line[17 - 1])
                        return
                    }
                }

                // mMol.mAtoms.add(atom);
                mol.atoms[atom.atomNumber] = atom
                mol.numList.add(atom.atomNumber)
                mol.maxAtomNumber = if (mol.maxAtomNumber < atom.atomNumber)
                    atom.atomNumber
                else
                    mol.maxAtomNumber

            } catch (e: Exception) {
                messageStrings.add(String.format(
                        "parseAtom exception on line %s", line))
//            Timber.e("parseAtom exception on line %s", line)
            }

        }

        /*
         * ParseBetaSheet
         *   Assumptions:
         */
        private fun parseBetaSheet(lineIn: String) {
            var line = lineIn
            val betaSheet = PdbBetaSheet()

            // pad out - in case of short "sheeting" (LOL)
            line = "$line                                                   "

            betaSheet.strandNumber = parseInteger(line.substring(8 - 1, 10).trim { it <= ' ' })
            betaSheet.numStrandsInSheet = parseInteger(line.substring(15 - 1, 16).trim { it <= ' ' })
            betaSheet.initialResidueNumber = parseInteger(line.substring(23 - 1, 26).trim { it <= ' ' })
            betaSheet.terminalResidueNumber = parseInteger(line.substring(34 - 1, 37).trim { it <= ' ' })
            betaSheet.parallelSenseCode = parseInteger(line.substring(39 - 1, 40).trim { it <= ' ' })
            betaSheet.registrationCurrentSeqNumber = parseInteger(line.substring(51 - 1, 54).trim { it <= ' ' })
            betaSheet.registrationPreviousSeqNumber = parseInteger(line.substring(66 - 1, 69).trim { it <= ' ' })

            betaSheet.sheetIdentification = line.substring(12 - 1, 14).trim { it <= ' ' }
            betaSheet.initialResidueName = line.substring(18 - 1, 20).trim { it <= ' ' }
            betaSheet.terminalResidueName = line.substring(29 - 1, 31).trim { it <= ' ' }
            betaSheet.registrationCurrentAtomName = line.substring(42 - 1, 45).trim { it <= ' ' }
            betaSheet.registrationCurrentResidueName = line.substring(46 - 1, 48).trim { it <= ' ' }
            betaSheet.registrationPreviousAtomName = line.substring(57 - 1, 60).trim { it <= ' ' }
            betaSheet.registrationPreviousResidueName = line.substring(61 - 1, 63).trim { it <= ' ' }

            betaSheet.initialChainIdChar = line[22 - 1]
            betaSheet.initialInsertionCodeChar = line[27 - 1]
            betaSheet.terminalChainIdChar = line[33 - 1]
            betaSheet.terminalInsertionCodeChar = line[38 - 1]
            betaSheet.registrationCurrentChainChar = line[50 - 1]
            betaSheet.registrationCurrentInsertionCodeChar = line[55 - 1]
            betaSheet.registrationPreviousChainChar = line[65 - 1]
            betaSheet.registrationPreviousInsertionCodeChar = line[70 - 1]

            mol.pdbSheetList.add(betaSheet)
        }

        /*
         * this is inserted to keep the mapping of atom_umber to array entry working
         */
        @Suppress("UseExpressionBody")
        private fun parseTerRecord(line: String) {
            // do nothing for now...
        }

        /*
        * ParseHelix
        *   Assumptions:
        */
        private fun parseHelix(line: String) {

            val helix = PdbHelix()

            helix.serialNumber = parseInteger(line.substring(8 - 1, 10).trim { it <= ' ' })
            helix.helixId = line.substring(12 - 1, 14).trim { it <= ' ' }

            helix.initialResidueName = line.substring(16 - 1, 18).trim { it <= ' ' }
            helix.initialChainIdChar = line[20 - 1]
            helix.initialResidueNumber = parseInteger(line.substring(22 - 1, 25).trim { it <= ' ' })
            helix.initialInsertionCode = line[26 - 1]

            helix.terminalResidueName = line.substring(28 - 1, 30).trim { it <= ' ' }
            helix.terminalChainIdChar = line[32 - 1]
            helix.terminalResidueNumber = parseInteger(line.substring(34 - 1, 37).trim { it <= ' ' })
            helix.terminalInsertionCode = line[38 - 1]

            helix.helixClass = parseInteger(line.substring(39 - 1, 40).trim { it <= ' ' })
            helix.helixComment = line.substring(41 - 1, 70).trim { it <= ' ' }

            helix.helixLength = parseInteger(line.substring(72 - 1, 76).trim { it <= ' ' })

            mol.helixList.add(helix)
        }

        /*
         * CONECT records
         */
        private fun parseConect(line: String) {
            val maxAtomNumber = mol.maxAtomNumber + 1
            var connectedAtomId: Int
            var idSubstring: String


            val baseAtomId: Int
            try {
                baseAtomId = parseInteger(line.substring(7 - 1, 11).trim { it <= ' ' })

                if (baseAtomId == 0) return
                if (baseAtomId >= maxAtomNumber) return

                connectedAtomId = parseInteger(line.substring(12 - 1, 16).trim { it <= ' ' })
                if (connectedAtomId == 0) return
                if (connectedAtomId < maxAtomNumber) {
                    validateBond(baseAtomId, connectedAtomId)
                }

                if (line.length < 21) return
                idSubstring = line.substring(17 - 1, 21).trim { it <= ' ' }
                if (idSubstring.isEmpty()) return
                connectedAtomId = parseInteger(idSubstring)
                if (connectedAtomId == 0) return
                if (connectedAtomId < maxAtomNumber) {
                    validateBond(baseAtomId, connectedAtomId)
                }

                if (line.length < 26) return
                idSubstring = line.substring(22 - 1, 26).trim { it <= ' ' }
                if (idSubstring.isEmpty()) return
                connectedAtomId = parseInteger(idSubstring)
                if (connectedAtomId == 0) return
                if (connectedAtomId < maxAtomNumber) {
                    validateBond(baseAtomId, connectedAtomId)
                }

                if (line.length < 31) return
                idSubstring = line.substring(27 - 1, 31).trim { it <= ' ' }
                if (idSubstring.isEmpty()) return
                connectedAtomId = parseInteger(idSubstring)
                if (connectedAtomId == 0) return
                if (connectedAtomId < maxAtomNumber) {
                    validateBond(baseAtomId, connectedAtomId)
                }

            } catch (e: Exception) {
                messageStrings.add(String.format("parse error on line: %s", line))
//            Timber.e("parse error on line: %s", line)
            }

        }

        /**
         * doesDuplicateBondExist
         * check for an existing bond between
         * @param atom1
         * @param atom2
         * @return   true if there is an bond between already in the bond list
         */
        private fun doesDuplicateBondExist(atom1: PdbAtom, atom2: PdbAtom): Boolean {

            val fromAtomNumber = atom1.atomNumber
            val toAtomNumber = atom2.atomNumber
            var atom1Number: Int
            var atom2Number: Int

            for (i in 0 until mol.bondList.size) {
                atom1Number = mol.bondList[i].atomNumber1
                atom2Number = mol.bondList[i].atomNumber2

                if (fromAtomNumber == atom1Number
                        && toAtomNumber == atom2Number) {
                    return true
                }
                if (fromAtomNumber == atom2Number
                        && toAtomNumber == atom1Number) {
                    return true
                }
            }
            return false
        }

        private fun validateBond(atom1: Int, atom2: Int) {

            val a1 = mol.atoms[atom1]
            val a2 = mol.atoms[atom2]

            /*
             * TODO: handle hydrogens.   For now skip over null pointers from missing hydros
             */
            if (a1 == null || a2 == null) {
                // Timber.e("null ptr : atom1: " + atom1 + " atom2: " + atom2);
                return
            }
            val p1 = a1.atomPosition
            val p2 = a2.atomPosition

            val distanceSquared = (p1.x - p2.x) * (p1.x - p2.x) +
                    (p1.y - p2.y) * (p1.y - p2.y) +
                    (p1.z - p2.z) * (p1.z - p2.z)

            if (distanceSquared > 20.0) {
                val prettyPrint = String.format("%6.2f", sqrt(distanceSquared))
                messageStrings.add(String.format(
                        "Bad CONECT between %d and %d distance is %d",
                        atom1, atom2, prettyPrint))
//            Timber.e("Bad CONECT between " + atom1
//                    + " and " + atom2 + " distance is "
//                    + prettyPrint)
                return
            }
            addBond(a1, a2)
        }

        private fun parseDouble(s: String): Double {
            return try {
                s.toDouble()
            } catch (e: RuntimeException) {
                0.toDouble()
            }

        }

        private fun parseInteger(s: String): Int {
            if (s.isEmpty()) {
                return -1
            }
            return try {
                Integer.parseInt(s)
            } catch (e: RuntimeException) {
//            Timber.e("Bad Integer : $s")
                0
            }

        }

        // clean out old data, reset state
        private fun resetMoleculeMaxMin() {
            maxX = 0.toDouble()
            maxY = 0.toDouble()
            maxZ = 0.toDouble()
            minX = 1e6
            minY = 1e6
            minZ = 1e6
        }
    }
}