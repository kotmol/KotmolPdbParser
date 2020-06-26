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

package com.kotmol.pdbParser

class KotmolPdbParserBonds {
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
        "val" to valine
    )

}