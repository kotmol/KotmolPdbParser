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
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */

@file:Suppress(
        "unused", "unused_variable", "unused_parameter", "UNUSED_ANONYMOUS_PARAMETER", "UNUSED_EXPRESSION",
        "UnusedMainParameter",
        "deprecation","MemberVisibilityCanBePrivate",
        "FunctionWithLambdaExpressionBody",
        "JoinDeclarationAndAssignment",
        "CanBePrimaryConstructorProperty", "RemoveEmptyClassBody",
        "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VALUE",
        "ConstantConditionIf", "ReplaceSingleLineLet",
        "ReplaceJavaStaticMethodWithKotlinAnalog",
        "NestedLambdaShadowedImplicitParameter"
)

package com.kotmol.pdbParser

class Molecule {
    var molName: String = ""
    var maxAtomNumber: Int = 0
    val numList: MutableList<Int> = ArrayList()
    val atoms = HashMap<Int, PdbAtom>()
    val ter = HashMap<Int, Boolean>()
    val bondList: MutableList<Bond> = ArrayList()
    val helixList: MutableList<PdbHelix> = ArrayList()
    val pdbSheetList: MutableList<PdbBetaSheet> = ArrayList()
    val listofChainDescriptorLists: MutableList<List<*>> = ArrayList()
    private val listofDnaHelixChainLists: MutableList<List<*>> = ArrayList()
    var ribbonNodeCount = 0
    var unbondedAtomCount = 0
    var hasAlternateLocations = false
    var guideAtomMissing = false

    var dcOffset: Double = 0.toDouble() // calculated in ParserPdbFile

    // TODO: parse multiple MODELs
    /*
     * this is a placeholder for the API to hold an array of additional MODELs
     * as defined in an NMR type PDB file.  If this is implemented, then
     * the additional MODELs would appear here as a list of additional Molecules()
     */
    val modelArray: MutableList<Molecule>? = null
    val modelNumber : Int? = null

    /*
     * list of ribbons to render
     *    pretty simple just yet
     */
    var listofRibbonLists: List<List<*>> = ArrayList()

    fun clearLists() {
        maxAtomNumber = 0
        numList.clear()
        atoms.clear()
        bondList.clear()
        helixList.clear()
        pdbSheetList.clear()
        listofChainDescriptorLists.clear()
        listofDnaHelixChainLists.clear()
        ribbonNodeCount = 0
        modelArray?.clear()
    }

}

enum class BondType {
    BONDTABLE, CONECT
}
class Bond(val atomNumber1: Int, val atomNumber2: Int, var type: BondType = BondType.BONDTABLE)
