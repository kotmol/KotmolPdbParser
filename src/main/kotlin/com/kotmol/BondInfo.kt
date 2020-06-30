/*
 *
 *  * Copyright (C) 2016-2020 James Andreas
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License
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
        "UnusedMainParameter", "JoinDeclarationAndAssignment",
        "CanBePrimaryConstructorProperty", "RemoveEmptyClassBody",
        "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VALUE",
        "ConstantConditionIf", "ReplaceSingleLineLet",
        "ReplaceJavaStaticMethodWithKotlinAnalog",
        "NestedLambdaShadowedImplicitParameter"
)

package com.kotmol

class BondInfo {
    data class KotmolBondRecord(
            val atom_1: String,
            val atom_2: String,
            val bond_order: Float,
            val bond_type: String,
            val aromatic: Boolean,
            val ideal_length: Double,
            val stereo: Boolean
    )


    val ala = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.505,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.468,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.968,
                    stereo = false
            )
    )
    val arg = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.224,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.36,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.518,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.536,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.096,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.537,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.097,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.098,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "NE",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.444,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.527,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.097,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.097,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ",
                    atom_2 = "NH1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.391,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ",
                    atom_2 = "NH2",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.391,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.462,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.997,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.996,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE",
                    atom_2 = "CZ",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.406,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE",
                    atom_2 = "HE",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.027,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NH1",
                    atom_2 = "HH11",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.018,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NH1",
                    atom_2 = "HH12",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.016,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NH2",
                    atom_2 = "HH21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.017,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NH2",
                    atom_2 = "HH22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.017,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.981,
                    stereo = false
            )
    )
    val asn = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.531,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "ND2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.348,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "OD1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.213,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.468,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "ND2",
                    atom_2 = "HD21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "ND2",
                    atom_2 = "HD22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val asp = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.209,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.508,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "OD1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "OD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.341,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OD2",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val asx = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "XD1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.642,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "XD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.642,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val cys = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.528,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "SG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.814,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.01,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "SG",
                    atom_2 = "HG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.344,
                    stereo = false
            )
    )
    val gln = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.528,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "NE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.347,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "OE1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.212,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE2",
                    atom_2 = "HE21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.969,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE2",
                    atom_2 = "HE22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val glu = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.508,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.531,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "OE1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "OE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.508,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OE2",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val glx = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.531,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "XE1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.642,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "XE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.642,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "HXT",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            )
    )
    val gly = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.47,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val his = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.227,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.355,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.522,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.534,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.096,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.51,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.099,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.098,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.072,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD2",
                    atom_2 = "NE2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.374,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE1",
                    atom_2 = "HE1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.078,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE1",
                    atom_2 = "NE2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.337,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD2",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.338,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "ND1",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.351,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.441,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.006,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.007,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "ND1",
                    atom_2 = "CE1",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.337,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "ND1",
                    atom_2 = "HD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.016,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE2",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.016,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.98,
                    stereo = false
            )
    )
    val ile = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD11",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD12",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD13",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "CD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "HG12",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "HG13",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.088,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG23",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.007,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )

    val leu = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD11",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD12",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD13",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD23",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            )
    )
    val lys = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.531,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "CE",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "HE3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "NZ",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.531,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NZ",
                    atom_2 = "HZ1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NZ",
                    atom_2 = "HZ2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NZ",
                    atom_2 = "HZ3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val met = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.528,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "HE1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE",
                    atom_2 = "HE3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "SD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.814,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.01,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "SD",
                    atom_2 = "CE",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.814,
                    stereo = false
            )
    )
    val phe = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.341,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.505,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD1",
                    atom_2 = "CE1",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.382,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD2",
                    atom_2 = "CE2",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.382,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE1",
                    atom_2 = "CZ",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.381,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE1",
                    atom_2 = "HE1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE2",
                    atom_2 = "CZ",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.382,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE2",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.081,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD1",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.382,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.383,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ",
                    atom_2 = "HZ",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val pro = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.508,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.543,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.543,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD",
                    atom_2 = "HD3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.544,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG",
                    atom_2 = "HG3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.486,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CD",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.487,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            )
    )
    val ser = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "OG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.428,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OG",
                    atom_2 = "HG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val thr = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "OG1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.428,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG23",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.007,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OG1",
                    atom_2 = "HG1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val trp = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.079,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD1",
                    atom_2 = "NE1",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.369,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD2",
                    atom_2 = "CE2",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.407,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD2",
                    atom_2 = "CE3",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.396,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE2",
                    atom_2 = "CZ2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.391,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE3",
                    atom_2 = "CZ3",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.366,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE3",
                    atom_2 = "HE3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD1",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.343,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.464,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CH2",
                    atom_2 = "HH2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CZ2",
                    atom_2 = "CH2",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.377,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ2",
                    atom_2 = "HZ2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CZ3",
                    atom_2 = "CH2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.388,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ3",
                    atom_2 = "HZ3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.01,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "NE1",
                    atom_2 = "CE2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.377,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "NE1",
                    atom_2 = "HE1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.969,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )
    val tyr = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.207,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.507,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD1",
                    atom_2 = "CE1",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.381,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD1",
                    atom_2 = "HD1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.079,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CD2",
                    atom_2 = "CE2",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.381,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CD2",
                    atom_2 = "HD2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE1",
                    atom_2 = "CZ",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.387,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE1",
                    atom_2 = "HE1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CE2",
                    atom_2 = "CZ",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.388,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CE2",
                    atom_2 = "HE2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD1",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.382,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "CG",
                    atom_2 = "CD2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.383,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CZ",
                    atom_2 = "OH",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.358,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OH",
                    atom_2 = "HH",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.968,
                    stereo = false
            )
    )
    val valine = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "O",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.208,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C",
                    atom_2 = "OXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.342,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "C",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.506,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "CB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CA",
                    atom_2 = "HA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "CG2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.529,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CB",
                    atom_2 = "HB",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "HG11",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "HG12",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG1",
                    atom_2 = "HG13",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "CG2",
                    atom_2 = "HG23",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "CA",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.469,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.008,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.009,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OXT",
                    atom_2 = "HXT",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            )
    )

    val da = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "H1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "N9",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.466,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "H2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C2",
                    atom_2 = "N3",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.316,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.541,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "C2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.547,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "H3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "O3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.429,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "C3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.549,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "H4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "O4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.446,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C5",
                    atom_2 = "C4",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.405,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C5",
                    atom_2 = "C6",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.405,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "C4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C6",
                    atom_2 = "N1",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.329,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "N6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.384,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C8",
                    atom_2 = "H8",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C8",
                    atom_2 = "N7",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.301,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N1",
                    atom_2 = "C2",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.319,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N3",
                    atom_2 = "C4",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.329,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N6",
                    atom_2 = "H61",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N6",
                    atom_2 = "H62",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.971,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N7",
                    atom_2 = "C5",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.355,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N9",
                    atom_2 = "C4",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.372,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N9",
                    atom_2 = "C8",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.362,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O3'",
                    atom_2 = "HO3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O4'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.436,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O5'",
                    atom_2 = "C5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.428,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP2",
                    atom_2 = "HOP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "HOP3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "P",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.61,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "O5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.609,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.48,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.61,
                    stereo = false
            )
    )
    val dc = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "H1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "N1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.465,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "N3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.332,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "O2",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.22,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.541,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.091,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "C2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.547,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "H3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "O3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.429,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "C5",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.41,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "N4",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.376,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "C3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.549,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "H4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "O4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.445,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "C6",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.353,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "H5",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.081,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "C4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "H6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.08,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.344,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.362,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "C4",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.326,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N4",
                    atom_2 = "H41",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N4",
                    atom_2 = "H42",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O3'",
                    atom_2 = "HO3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.968,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O4'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.437,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O5'",
                    atom_2 = "C5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.428,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP2",
                    atom_2 = "HOP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "HOP3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "P",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.61,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "O5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.611,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.48,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.609,
                    stereo = false
            )
    )
    val dg = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "H1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "N9",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.464,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "N2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.372,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "N3",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.314,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.54,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "C2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.547,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "H3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "O3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.43,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "C3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.55,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "H4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "O4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.446,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C5",
                    atom_2 = "C4",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.4,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "C6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.415,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "C4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.53,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "N1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.351,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "O6",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.219,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C8",
                    atom_2 = "H8",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.081,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "C8",
                    atom_2 = "N7",
                    bond_order = 1.5f,
                    bond_type = "doub",
                    ideal_length = 1.302,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.362,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "H1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N2",
                    atom_2 = "H21",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N2",
                    atom_2 = "H22",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.97,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "C4",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.338,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N7",
                    atom_2 = "C5",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.355,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N9",
                    atom_2 = "C4",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.368,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = true,
                    atom_1 = "N9",
                    atom_2 = "C8",
                    bond_order = 1.5f,
                    bond_type = "sing",
                    ideal_length = 1.364,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O3'",
                    atom_2 = "HO3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.966,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O4'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.437,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O5'",
                    atom_2 = "C5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.428,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP2",
                    atom_2 = "HOP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "HOP3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.967,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "P",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.611,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "O5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.61,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.479,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.608,
                    stereo = false
            )
    )
    val dt = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "H1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "N1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.434,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "N3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.399,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "O2",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.232,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.52,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.097,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "C2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.511,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "H3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.094,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "O3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.426,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "C5",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.487,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "O4",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.228,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "C3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.522,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "H4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.094,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "O4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.441,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "C6",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.339,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "C7",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.495,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "C4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.523,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.092,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.093,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "H6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.086,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C7",
                    atom_2 = "H71",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.089,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C7",
                    atom_2 = "H72",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C7",
                    atom_2 = "H73",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.09,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.411,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.389,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "C4",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.387,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "H3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.016,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O3'",
                    atom_2 = "HO3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.973,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O4'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.434,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O5'",
                    atom_2 = "C5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.418,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP2",
                    atom_2 = "HOP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.981,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "HOP3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.981,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "P",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.618,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "O5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.619,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.501,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.616,
                    stereo = false
            )
    )
    val du = listOf(
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "H1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C1'",
                    atom_2 = "N1",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.434,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "N3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.402,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2",
                    atom_2 = "O2",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.233,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.52,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.097,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C2'",
                    atom_2 = "H2''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.095,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "C2'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.511,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "H3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.094,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C3'",
                    atom_2 = "O3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.426,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "C5",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.477,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4",
                    atom_2 = "O4",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.227,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "C3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.522,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "H4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.094,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C4'",
                    atom_2 = "O4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.441,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "C6",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.336,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5",
                    atom_2 = "H5",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.083,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "C4'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.523,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.092,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C5'",
                    atom_2 = "H5''",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.093,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "C6",
                    atom_2 = "H6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.085,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.412,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N1",
                    atom_2 = "C6",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.389,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "C4",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.386,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "N3",
                    atom_2 = "H3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.016,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O3'",
                    atom_2 = "HO3'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.973,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O4'",
                    atom_2 = "C1'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.434,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "O5'",
                    atom_2 = "C5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.418,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP2",
                    atom_2 = "HOP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.981,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "HOP3",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 0.981,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "OP3",
                    atom_2 = "P",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.618,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "O5'",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.619,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP1",
                    bond_order = 2f,
                    bond_type = "doub",
                    ideal_length = 1.501,
                    stereo = false
            ),
            KotmolBondRecord(
                    aromatic = false,
                    atom_1 = "P",
                    atom_2 = "OP2",
                    bond_order = 1f,
                    bond_type = "sing",
                    ideal_length = 1.616,
                    stereo = false
            )
    )


    val kotmolBondLookup = hashMapOf(
            "ala" to ala,
            "arg" to arg,
            "asn" to asn,
            "asp" to asp,
            "asx" to asx,
            "cys" to cys,
            "glu" to glu,
            "gln" to gln,
            "glx" to glx,
            "gly" to gly,
            "his" to his,
            "ile" to ile,
            "leu" to leu,
            "lys" to lys,
            "met" to met,
            "phe" to phe,
            "pro" to pro,
            "ser" to ser,
            "thr" to thr,
            "trp" to trp,
            "tyr" to tyr,
            "val" to valine,
            // nucleic acid bonds
            "da" to da,
            "dc" to dc,
            "dg" to dg,
            "dt" to dt,
            "du" to du
    )

}