/*
 *  Copyright (C) 2020 James Andreas
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */

@file:Suppress(
        "unused",
        "unused_variable",
        "unused_parameter",
        "deprecation",
        "UNUSED_ANONYMOUS_PARAMETER",
        "UNUSED_EXPRESSION",
        "MemberVisibilityCanBePrivate",
        "FunctionWithLambdaExpressionBody",
        "UnusedMainParameter",
        "JoinDeclarationAndAssignment",
        "CanBePrimaryConstructorProperty",
        "RemoveEmptyClassBody",
        "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE",
        "UNUSED_VALUE",
        "ConstantConditionIf",
        "ReplaceSingleLineLet",
        "ReplaceJavaStaticMethodWithKotlinAnalog",
        "NestedLambdaShadowedImplicitParameter"
)

package com.kotmol.pdbParser

/**
 * bond information
 *   as extracted from the database at:
 *   @link: https://www.ebi.ac.uk/pdbe/api/pdb/compound/bonds/
 */

/**
 *  NOTES:
 *  from the 1992 PDB file format specification:
 *
 * PROTEIN DATA BANK
 * ATOMIC COORDINATE AND BIBLIOGRAPHIC ENTRY FORMAT DESCRIPTION
 * February 1992
 *
 *  Atom names employed for polynucleotides generally follow the precedents set for mononucleotides.
 * The following points are worthy of note.
 * (i) The prime character (') commonly used to denote atoms of the ribose originally was
 * avoided because of non-uniformity of its external representation. An asterisk (*)
 * therefore was used in its place, in entries released through January 1992.
 * (ii) Of the four characters reserved for atom names the leftmost two are reserved for the
 * chemical symbol (right justified) and the remaining two denote the atom's position.
 * (iii) Atoms exocyclic to the ring systems have the same position identifier as the atom
 * to which they are bonded except if this would result in identical atom names. In this
 * case an alphabetic character is used to avoid ambiguity.
 * (iv) The ring-oxygen atom of the ribose is denoted O4 rather than O1.
 * (v) The extra oxygen atom at the free 5' phosphate terminus is designated OXT. This
 * atom will be placed first in the coordinate set.
 */

class BondInfo {
    data class KotmolBondRecord(
            val atom_1: String, val atom_2: String, val bond_order: Float, val bond_type: String, val aromatic: Boolean = false, val length: Double, var bondRecordCreated: Boolean = false
    )


    val ala = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.505),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB1", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.468),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.968
            )
    )
    val arg = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.224),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.36),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.518),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.536),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.096),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.537),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.097),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.098),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD3", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "NE", bond_order = 1f, bond_type = "sing", length = 1.444),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.527),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.097),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.097),
            KotmolBondRecord(atom_1 = "CZ", atom_2 = "NH1", bond_order = 1f, bond_type = "sing", length = 1.391),
            KotmolBondRecord(atom_1 = "CZ", atom_2 = "NH2", bond_order = 2f, bond_type = "doub", length = 1.391),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.462),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 0.997),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 0.996),
            KotmolBondRecord(atom_1 = "NE", atom_2 = "CZ", bond_order = 1f, bond_type = "sing", length = 1.406),
            KotmolBondRecord(atom_1 = "NE", atom_2 = "HE", bond_order = 1f, bond_type = "sing", length = 1.027),
            KotmolBondRecord(atom_1 = "NH1", atom_2 = "HH11", bond_order = 1f, bond_type = "sing", length = 1.018),
            KotmolBondRecord(atom_1 = "NH1", atom_2 = "HH12", bond_order = 1f, bond_type = "sing", length = 1.016),
            KotmolBondRecord(atom_1 = "NH2", atom_2 = "HH21", bond_order = 1f, bond_type = "sing", length = 1.017),
            KotmolBondRecord(atom_1 = "NH2", atom_2 = "HH22", bond_order = 1f, bond_type = "sing", length = 1.017),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.981
            )
    )
    val asn = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.531),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "ND2", bond_order = 1f, bond_type = "sing", length = 1.348),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "OD1", bond_order = 2f, bond_type = "doub", length = 1.213),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.468),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "ND2", atom_2 = "HD21", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "ND2", atom_2 = "HD22", bond_order = 1f, bond_type = "sing", length = 0.97),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val asp = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.209),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.508),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "OD1", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "OD2", bond_order = 1f, bond_type = "sing", length = 1.341),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "OD2", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 0.966),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val asx = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB1", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "XD1", bond_order = 2f, bond_type = "doub", length = 1.642),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "XD2", bond_order = 1f, bond_type = "sing", length = 1.642),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.008),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val cys = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.528),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "SG", bond_order = 1f, bond_type = "sing", length = 1.814),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.01),
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "SG", atom_2 = "HG", bond_order = 1f, bond_type = "sing", length = 1.344
            )
    )
    val gln = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.528),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "NE2", bond_order = 1f, bond_type = "sing", length = 1.347),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "OE1", bond_order = 2f, bond_type = "doub", length = 1.212),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "NE2", atom_2 = "HE21", bond_order = 1f, bond_type = "sing", length = 0.969),
            KotmolBondRecord(atom_1 = "NE2", atom_2 = "HE22", bond_order = 1f, bond_type = "sing", length = 0.97),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val glu = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.508),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.531),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "OE1", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "OE2", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.508),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "OE2", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 0.966),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val glx = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.531),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB1", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "XE1", bond_order = 2f, bond_type = "doub", length = 1.642),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "XE2", bond_order = 1f, bond_type = "sing", length = 1.642),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG1", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "HXT", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009
            )
    )
    val gly = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.47),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val his = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.227),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.355),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.522),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.534),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.096),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.51),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.099),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.098),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.072),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "NE2", bond_order = 1.5f, bond_type = "sing", length = 1.374, aromatic = true),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "HE1", bond_order = 1f, bond_type = "sing", length = 1.078),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "NE2", bond_order = 1.5f, bond_type = "sing", length = 1.337, aromatic = true),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD2", bond_order = 1.5f, bond_type = "doub", length = 1.338, aromatic = true),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "ND1", bond_order = 1.5f, bond_type = "sing", length = 1.351, aromatic = true),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.441),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.006),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.007),
            KotmolBondRecord(atom_1 = "ND1", atom_2 = "CE1", bond_order = 1.5f, bond_type = "doub", length = 1.337, aromatic = true),
            KotmolBondRecord(atom_1 = "ND1", atom_2 = "HD1", bond_order = 1f, bond_type = "sing", length = 1.016),
            KotmolBondRecord(atom_1 = "NE2", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 1.016),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.98
            )
    )
    val ile = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG1", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG2", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD11", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD12", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD13", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "CD1", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "HG12", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "HG13", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG21", bond_order = 1f, bond_type = "sing", length = 1.088),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG22", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG23", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.007),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.008),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )

    val leu = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD11", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD12", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD13", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD21", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD22", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD23", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD1", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD2", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.008),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.966
            )
    )
    val lys = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.531),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "CE", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "HE3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "NZ", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.531),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "NZ", atom_2 = "HZ1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "NZ", atom_2 = "HZ2", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "NZ", atom_2 = "HZ3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val met = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.343),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.528),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "HE1", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CE", atom_2 = "HE3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "SD", bond_order = 1f, bond_type = "sing", length = 1.814),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.01),
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "SD", atom_2 = "CE", bond_order = 1f, bond_type = "sing", length = 1.814
            )
    )
    val phe = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.341),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.505),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "CE1", bond_order = 1.5f, bond_type = "sing", length = 1.382, aromatic = true),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD1", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "CE2", bond_order = 1.5f, bond_type = "doub", length = 1.382, aromatic = true),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "CZ", bond_order = 1.5f, bond_type = "doub", length = 1.381, aromatic = true),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "HE1", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CE2", atom_2 = "CZ", bond_order = 1.5f, bond_type = "sing", length = 1.382, aromatic = true),
            KotmolBondRecord(atom_1 = "CE2", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 1.081),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD1", bond_order = 1.5f, bond_type = "doub", length = 1.382, aromatic = true),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD2", bond_order = 1.5f, bond_type = "sing", length = 1.383, aromatic = true),
            KotmolBondRecord(atom_1 = "CZ", atom_2 = "HZ", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.008),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val pro = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.508),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.543),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.543),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CD", atom_2 = "HD3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.544),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "HG3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.486),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CD", bond_order = 1f, bond_type = "sing", length = 1.487),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.966
            )
    )
    val ser = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "OG", bond_order = 1f, bond_type = "sing", length = 1.428),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "OG", atom_2 = "HG", bond_order = 1f, bond_type = "sing", length = 0.967),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val thr = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG2", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "OG1", bond_order = 1f, bond_type = "sing", length = 1.428),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG21", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG22", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG23", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.007),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "OG1", atom_2 = "HG1", bond_order = 1f, bond_type = "sing", length = 0.967),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val trp = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD1", bond_order = 1f, bond_type = "sing", length = 1.079),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "NE1", bond_order = 1.5f, bond_type = "sing", length = 1.369, aromatic = true),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "CE2", bond_order = 1.5f, bond_type = "doub", length = 1.407, aromatic = true),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "CE3", bond_order = 1.5f, bond_type = "sing", length = 1.396, aromatic = true),
            KotmolBondRecord(atom_1 = "CE2", atom_2 = "CZ2", bond_order = 1.5f, bond_type = "sing", length = 1.391, aromatic = true),
            KotmolBondRecord(atom_1 = "CE3", atom_2 = "CZ3", bond_order = 1.5f, bond_type = "doub", length = 1.366, aromatic = true),
            KotmolBondRecord(atom_1 = "CE3", atom_2 = "HE3", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD1", bond_order = 1.5f, bond_type = "doub", length = 1.343, aromatic = true),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD2", bond_order = 1.5f, bond_type = "sing", length = 1.464, aromatic = true),
            KotmolBondRecord(atom_1 = "CH2", atom_2 = "HH2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CZ2", atom_2 = "CH2", bond_order = 1.5f, bond_type = "doub", length = 1.377, aromatic = true),
            KotmolBondRecord(atom_1 = "CZ2", atom_2 = "HZ2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CZ3", atom_2 = "CH2", bond_order = 1.5f, bond_type = "sing", length = 1.388, aromatic = true),
            KotmolBondRecord(atom_1 = "CZ3", atom_2 = "HZ3", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.01),
            KotmolBondRecord(atom_1 = "NE1", atom_2 = "CE2", bond_order = 1.5f, bond_type = "sing", length = 1.377, aromatic = true),
            KotmolBondRecord(atom_1 = "NE1", atom_2 = "HE1", bond_order = 1f, bond_type = "sing", length = 0.969),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )
    val tyr = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.207),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.507),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB2", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB3", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "CE1", bond_order = 1.5f, bond_type = "sing", length = 1.381, aromatic = true),
            KotmolBondRecord(atom_1 = "CD1", atom_2 = "HD1", bond_order = 1f, bond_type = "sing", length = 1.079),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "CE2", bond_order = 1.5f, bond_type = "doub", length = 1.381, aromatic = true),
            KotmolBondRecord(atom_1 = "CD2", atom_2 = "HD2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "CZ", bond_order = 1.5f, bond_type = "doub", length = 1.387, aromatic = true),
            KotmolBondRecord(atom_1 = "CE1", atom_2 = "HE1", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CE2", atom_2 = "CZ", bond_order = 1.5f, bond_type = "sing", length = 1.388, aromatic = true),
            KotmolBondRecord(atom_1 = "CE2", atom_2 = "HE2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD1", bond_order = 1.5f, bond_type = "doub", length = 1.382, aromatic = true),
            KotmolBondRecord(atom_1 = "CG", atom_2 = "CD2", bond_order = 1.5f, bond_type = "sing", length = 1.383, aromatic = true),
            KotmolBondRecord(atom_1 = "CZ", atom_2 = "OH", bond_order = 1f, bond_type = "sing", length = 1.358),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "OH", atom_2 = "HH", bond_order = 1f, bond_type = "sing", length = 0.966),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.968
            )
    )
    val valine = listOf(
            KotmolBondRecord(atom_1 = "C", atom_2 = "O", bond_order = 2f, bond_type = "doub", length = 1.208),
            KotmolBondRecord(atom_1 = "C", atom_2 = "OXT", bond_order = 1f, bond_type = "sing", length = 1.342),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "C", bond_order = 1f, bond_type = "sing", length = 1.506),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "CB", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CA", atom_2 = "HA", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG1", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "CG2", bond_order = 1f, bond_type = "sing", length = 1.529),
            KotmolBondRecord(atom_1 = "CB", atom_2 = "HB", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "HG11", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "HG12", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG1", atom_2 = "HG13", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG21", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG22", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "CG2", atom_2 = "HG23", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N", atom_2 = "CA", bond_order = 1f, bond_type = "sing", length = 1.469),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H", bond_order = 1f, bond_type = "sing", length = 1.008),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.009),
            // add H1 and H3 bonds to N
            KotmolBondRecord(atom_1 = "N", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 1.009),
            KotmolBondRecord(atom_1 = "N", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.009),
            // end change
            KotmolBondRecord(atom_1 = "OXT", atom_2 = "HXT", bond_order = 1f, bond_type = "sing", length = 0.967
            )
    )

    val da = listOf(
            /*
             *   !!!
             * These two records were added to capture the bond between the
             * C2' then O2' and HO2'
             * this was borrowed from another bond between an OXT and HXT
             * SEE: 1A1T.pdb
             */
            KotmolBondRecord(atom_1 = "O2'", atom_2 = "HO2'", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "O2'", bond_order = 1f, bond_type = "sing", length = 1.43),
            /*
             *  End of added record
             */

            KotmolBondRecord(atom_1 = "C1'", atom_2 = "H1'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "N9", bond_order = 1f, bond_type = "sing", length = 1.466),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "H2", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N3", bond_order = 1.5f, bond_type = "doub", length = 1.316, aromatic = true),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.541),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2'", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2''", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "C2'", bond_order = 1f, bond_type = "sing", length = 1.547),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "H3'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "O3'", bond_order = 1f, bond_type = "sing", length = 1.429),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "C3'", bond_order = 1f, bond_type = "sing", length = 1.549),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "H4'", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "O4'", bond_order = 1f, bond_type = "sing", length = 1.446),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C4", bond_order = 1.5f, bond_type = "doub", length = 1.405, aromatic = true),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C6", bond_order = 1.5f, bond_type = "sing", length = 1.405, aromatic = true),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "C4'", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5''", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "N1", bond_order = 1.5f, bond_type = "doub", length = 1.329, aromatic = true),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "N6", bond_order = 1f, bond_type = "sing", length = 1.384),
            KotmolBondRecord(atom_1 = "C8", atom_2 = "H8", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "C8", atom_2 = "N7", bond_order = 1.5f, bond_type = "doub", length = 1.301, aromatic = true),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C2", bond_order = 1.5f, bond_type = "sing", length = 1.319, aromatic = true),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "C4", bond_order = 1.5f, bond_type = "sing", length = 1.329, aromatic = true),
            KotmolBondRecord(atom_1 = "N6", atom_2 = "H61", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "N6", atom_2 = "H62", bond_order = 1f, bond_type = "sing", length = 0.971),
            KotmolBondRecord(atom_1 = "N7", atom_2 = "C5", bond_order = 1.5f, bond_type = "sing", length = 1.355, aromatic = true),
            KotmolBondRecord(atom_1 = "N9", atom_2 = "C4", bond_order = 1.5f, bond_type = "sing", length = 1.372, aromatic = true),
            KotmolBondRecord(atom_1 = "N9", atom_2 = "C8", bond_order = 1.5f, bond_type = "sing", length = 1.362, aromatic = true),
            KotmolBondRecord(atom_1 = "O3'", atom_2 = "HO3'", bond_order = 1f, bond_type = "sing", length = 0.966),
            KotmolBondRecord(atom_1 = "O4'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.436),
            KotmolBondRecord(atom_1 = "O5'", atom_2 = "C5'", bond_order = 1f, bond_type = "sing", length = 1.428),
            KotmolBondRecord(atom_1 = "OP2", atom_2 = "HOP2", bond_order = 1f, bond_type = "sing", length = 0.966),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "HOP3", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "P", bond_order = 1f, bond_type = "sing", length = 1.61),
            KotmolBondRecord(atom_1 = "P", atom_2 = "O5'", bond_order = 1f, bond_type = "sing", length = 1.609),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP1", bond_order = 2f, bond_type = "doub", length = 1.48),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP2", bond_order = 1f, bond_type = "sing", length = 1.61
            )
    )
    val dc = listOf(
            /*
             *   !!!
             * These two records were added to capture the bond between the
             * C2' then O2' and HO2'
             * this was borrowed from another bond between an OXT and HXT
             * SEE: 1A1T.pdb
             */
            KotmolBondRecord(atom_1 = "O2'", atom_2 = "HO2'", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "O2'", bond_order = 1f, bond_type = "sing", length = 1.43),
            /*
             *  End of added record
             */
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "H1'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "N1", bond_order = 1f, bond_type = "sing", length = 1.465),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N3", bond_order = 1f, bond_type = "sing", length = 1.332),
             /*  BUG should be O2
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2'", bond_order = 2f, bond_type = "doub", length = 1.22),
              */
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2", bond_order = 2f, bond_type = "doub", length = 1.22),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.541),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2'", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2''", bond_order = 1f, bond_type = "sing", length = 1.091),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "C2'", bond_order = 1f, bond_type = "sing", length = 1.547),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "H3'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "O3'", bond_order = 1f, bond_type = "sing", length = 1.429),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "C5", bond_order = 1f, bond_type = "sing", length = 1.41),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "N4", bond_order = 1f, bond_type = "sing", length = 1.376),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "C3'", bond_order = 1f, bond_type = "sing", length = 1.549),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "H4'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "O4'", bond_order = 1f, bond_type = "sing", length = 1.445),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C6", bond_order = 2f, bond_type = "doub", length = 1.353),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "H5", bond_order = 1f, bond_type = "sing", length = 1.081),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "C4'", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5''", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "H6", bond_order = 1f, bond_type = "sing", length = 1.08),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C2", bond_order = 1f, bond_type = "sing", length = 1.344),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C6", bond_order = 1f, bond_type = "sing", length = 1.362),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "C4", bond_order = 2f, bond_type = "doub", length = 1.326),
            KotmolBondRecord(atom_1 = "N4", atom_2 = "H41", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "N4", atom_2 = "H42", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "O3'", atom_2 = "HO3'", bond_order = 1f, bond_type = "sing", length = 0.968),
            KotmolBondRecord(atom_1 = "O4'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.437),
            KotmolBondRecord(atom_1 = "O5'", atom_2 = "C5'", bond_order = 1f, bond_type = "sing", length = 1.428),
            KotmolBondRecord(atom_1 = "OP2", atom_2 = "HOP2", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "HOP3", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "P", bond_order = 1f, bond_type = "sing", length = 1.61),
            KotmolBondRecord(atom_1 = "P", atom_2 = "O5'", bond_order = 1f, bond_type = "sing", length = 1.611),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP1", bond_order = 2f, bond_type = "doub", length = 1.48),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP2", bond_order = 1f, bond_type = "sing", length = 1.609
            )
    )
    val dg = listOf(
            /*
             *   !!!
             * These two records were added to capture the bond between the
             * C2' then O2' and HO2'
             * this was borrowed from another bond between an OXT and HXT
             * SEE: 1A1T.pdb
             */
            KotmolBondRecord(atom_1 = "O2'", atom_2 = "HO2'", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "O2'", bond_order = 1f, bond_type = "sing", length = 1.43),
            /*
             *  End of added record
             */
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "H1'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "N9", bond_order = 1f, bond_type = "sing", length = 1.464),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N2", bond_order = 1f, bond_type = "sing", length = 1.372),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N3", bond_order = 2f, bond_type = "doub", length = 1.314),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.54),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2''", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "C2'", bond_order = 1f, bond_type = "sing", length = 1.547),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "H3'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "O3'", bond_order = 1f, bond_type = "sing", length = 1.43),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "C3'", bond_order = 1f, bond_type = "sing", length = 1.55),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "H4'", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "O4'", bond_order = 1f, bond_type = "sing", length = 1.446),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C4", bond_order = 1.5f, bond_type = "doub", length = 1.4, aromatic = true),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C6", bond_order = 1f, bond_type = "sing", length = 1.415),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "C4'", bond_order = 1f, bond_type = "sing", length = 1.53),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5'", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5''", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "N1", bond_order = 1f, bond_type = "sing", length = 1.351),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "O6", bond_order = 2f, bond_type = "doub", length = 1.219),
            KotmolBondRecord(atom_1 = "C8", atom_2 = "H8", bond_order = 1f, bond_type = "sing", length = 1.081),
            KotmolBondRecord(atom_1 = "C8", atom_2 = "N7", bond_order = 1.5f, bond_type = "doub", length = 1.302, aromatic = true),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C2", bond_order = 1f, bond_type = "sing", length = 1.362),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "H1", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "N2", atom_2 = "H21", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "N2", atom_2 = "H22", bond_order = 1f, bond_type = "sing", length = 0.97),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "C4", bond_order = 1f, bond_type = "sing", length = 1.338),
            KotmolBondRecord(atom_1 = "N7", atom_2 = "C5", bond_order = 1.5f, bond_type = "sing", length = 1.355, aromatic = true),
            KotmolBondRecord(atom_1 = "N9", atom_2 = "C4", bond_order = 1.5f, bond_type = "sing", length = 1.368, aromatic = true),
            KotmolBondRecord(atom_1 = "N9", atom_2 = "C8", bond_order = 1.5f, bond_type = "sing", length = 1.364, aromatic = true),
            KotmolBondRecord(atom_1 = "O3'", atom_2 = "HO3'", bond_order = 1f, bond_type = "sing", length = 0.966),
            KotmolBondRecord(atom_1 = "O4'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.437),
            KotmolBondRecord(atom_1 = "O5'", atom_2 = "C5'", bond_order = 1f, bond_type = "sing", length = 1.428),
            KotmolBondRecord(atom_1 = "OP2", atom_2 = "HOP2", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "HOP3", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "P", bond_order = 1f, bond_type = "sing", length = 1.611),
            KotmolBondRecord(atom_1 = "P", atom_2 = "O5'", bond_order = 1f, bond_type = "sing", length = 1.61),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP1", bond_order = 2f, bond_type = "doub", length = 1.479),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP2", bond_order = 1f, bond_type = "sing", length = 1.608
            )
    )
    val dt = listOf(
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "H1'", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "N1", bond_order = 1f, bond_type = "sing", length = 1.434),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N3", bond_order = 1f, bond_type = "sing", length = 1.399),
            /* BUG should be O2
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2'", bond_order = 2f, bond_type = "doub", length = 1.232),
            */
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2", bond_order = 2f, bond_type = "doub", length = 1.232),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.52),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2'", bond_order = 1f, bond_type = "sing", length = 1.097),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2''", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "C2'", bond_order = 1f, bond_type = "sing", length = 1.511),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "H3'", bond_order = 1f, bond_type = "sing", length = 1.094),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "O3'", bond_order = 1f, bond_type = "sing", length = 1.426),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "C5", bond_order = 1f, bond_type = "sing", length = 1.487),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "O4", bond_order = 2f, bond_type = "doub", length = 1.228),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "C3'", bond_order = 1f, bond_type = "sing", length = 1.522),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "H4'", bond_order = 1f, bond_type = "sing", length = 1.094),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "O4'", bond_order = 1f, bond_type = "sing", length = 1.441),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C6", bond_order = 2f, bond_type = "doub", length = 1.339),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C7", bond_order = 1f, bond_type = "sing", length = 1.495),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "C4'", bond_order = 1f, bond_type = "sing", length = 1.523),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5'", bond_order = 1f, bond_type = "sing", length = 1.092),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5''", bond_order = 1f, bond_type = "sing", length = 1.093),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "H6", bond_order = 1f, bond_type = "sing", length = 1.086),
            KotmolBondRecord(atom_1 = "C7", atom_2 = "H71", bond_order = 1f, bond_type = "sing", length = 1.089),
            KotmolBondRecord(atom_1 = "C7", atom_2 = "H72", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "C7", atom_2 = "H73", bond_order = 1f, bond_type = "sing", length = 1.09),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C2", bond_order = 1f, bond_type = "sing", length = 1.411),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C6", bond_order = 1f, bond_type = "sing", length = 1.389),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "C4", bond_order = 1f, bond_type = "sing", length = 1.387),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.016),
            KotmolBondRecord(atom_1 = "O3'", atom_2 = "HO3'", bond_order = 1f, bond_type = "sing", length = 0.973),
            KotmolBondRecord(atom_1 = "O4'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.434),
            KotmolBondRecord(atom_1 = "O5'", atom_2 = "C5'", bond_order = 1f, bond_type = "sing", length = 1.418),
            KotmolBondRecord(atom_1 = "OP2", atom_2 = "HOP2", bond_order = 1f, bond_type = "sing", length = 0.981),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "HOP3", bond_order = 1f, bond_type = "sing", length = 0.981),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "P", bond_order = 1f, bond_type = "sing", length = 1.618),
            KotmolBondRecord(atom_1 = "P", atom_2 = "O5'", bond_order = 1f, bond_type = "sing", length = 1.619),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP1", bond_order = 2f, bond_type = "doub", length = 1.501),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP2", bond_order = 1f, bond_type = "sing", length = 1.616
            )
    )
    val du = listOf(
            /*
             *   !!!
             * These two records were added to capture the bond between the
             * C2' then O2' and HO2'
             * this was borrowed from another bond between an OXT and HXT
             * SEE: 1A1T.pdb
             */
            KotmolBondRecord(atom_1 = "O2'", atom_2 = "HO2'", bond_order = 1f, bond_type = "sing", length = 0.967),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "O2'", bond_order = 1f, bond_type = "sing", length = 1.43),
            /*
             *  End of added record
             */


            KotmolBondRecord(atom_1 = "C1'", atom_2 = "H1'", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "C1'", atom_2 = "N1", bond_order = 1f, bond_type = "sing", length = 1.434),
            KotmolBondRecord(atom_1 = "C2", atom_2 = "N3", bond_order = 1f, bond_type = "sing", length = 1.402),
            /* BUG should be O2
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2'", bond_order = 2f, bond_type = "doub", length = 1.233),
            */
            KotmolBondRecord(atom_1 = "C2", atom_2 = "O2", bond_order = 2f, bond_type = "doub", length = 1.233),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.52),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2'", bond_order = 1f, bond_type = "sing", length = 1.097),
            KotmolBondRecord(atom_1 = "C2'", atom_2 = "H2''", bond_order = 1f, bond_type = "sing", length = 1.095),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "C2'", bond_order = 1f, bond_type = "sing", length = 1.511),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "H3'", bond_order = 1f, bond_type = "sing", length = 1.094),
            KotmolBondRecord(atom_1 = "C3'", atom_2 = "O3'", bond_order = 1f, bond_type = "sing", length = 1.426),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "C5", bond_order = 1f, bond_type = "sing", length = 1.477),
            KotmolBondRecord(atom_1 = "C4", atom_2 = "O4", bond_order = 2f, bond_type = "doub", length = 1.227),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "C3'", bond_order = 1f, bond_type = "sing", length = 1.522),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "H4'", bond_order = 1f, bond_type = "sing", length = 1.094),
            KotmolBondRecord(atom_1 = "C4'", atom_2 = "O4'", bond_order = 1f, bond_type = "sing", length = 1.441),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "C6", bond_order = 2f, bond_type = "doub", length = 1.336),
            KotmolBondRecord(atom_1 = "C5", atom_2 = "H5", bond_order = 1f, bond_type = "sing", length = 1.083),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "C4'", bond_order = 1f, bond_type = "sing", length = 1.523),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5'", bond_order = 1f, bond_type = "sing", length = 1.092),
            KotmolBondRecord(atom_1 = "C5'", atom_2 = "H5''", bond_order = 1f, bond_type = "sing", length = 1.093),
            KotmolBondRecord(atom_1 = "C6", atom_2 = "H6", bond_order = 1f, bond_type = "sing", length = 1.085),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C2", bond_order = 1f, bond_type = "sing", length = 1.412),
            KotmolBondRecord(atom_1 = "N1", atom_2 = "C6", bond_order = 1f, bond_type = "sing", length = 1.389),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "C4", bond_order = 1f, bond_type = "sing", length = 1.386),
            KotmolBondRecord(atom_1 = "N3", atom_2 = "H3", bond_order = 1f, bond_type = "sing", length = 1.016),
            KotmolBondRecord(atom_1 = "O3'", atom_2 = "HO3'", bond_order = 1f, bond_type = "sing", length = 0.973),
            KotmolBondRecord(atom_1 = "O4'", atom_2 = "C1'", bond_order = 1f, bond_type = "sing", length = 1.434),
            KotmolBondRecord(atom_1 = "O5'", atom_2 = "C5'", bond_order = 1f, bond_type = "sing", length = 1.418),
            KotmolBondRecord(atom_1 = "OP2", atom_2 = "HOP2", bond_order = 1f, bond_type = "sing", length = 0.981),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "HOP3", bond_order = 1f, bond_type = "sing", length = 0.981),
            KotmolBondRecord(atom_1 = "OP3", atom_2 = "P", bond_order = 1f, bond_type = "sing", length = 1.618),
            KotmolBondRecord(atom_1 = "P", atom_2 = "O5'", bond_order = 1f, bond_type = "sing", length = 1.619),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP1", bond_order = 2f, bond_type = "doub", length = 1.501),
            KotmolBondRecord(atom_1 = "P", atom_2 = "OP2", bond_order = 1f, bond_type = "sing", length = 1.616
            )
    )


    val kotmolBondLookup = hashMapOf(
            "ala" to ala, "arg" to arg, "asn" to asn, "asp" to asp, "asx" to asx, "cys" to cys, "glu" to glu, "gln" to gln, "glx" to glx, "gly" to gly, "his" to his, "ile" to ile, "leu" to leu, "lys" to lys, "met" to met, "phe" to phe, "pro" to pro, "ser" to ser, "thr" to thr, "trp" to trp, "tyr" to tyr, "val" to valine, // nucleic acid bonds
            "da" to da, "dc" to dc, "dg" to dg, "dt" to dt, "du" to du, "a" to da, "c" to dc, "g" to dg, "t" to dt, "u" to du
    )

}
