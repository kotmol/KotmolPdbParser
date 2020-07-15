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

package com.kotmol.pdbParser
class AtomInfo {
    /*
     * for the mega-annoying hex literal problem (*SPORADIC* toInt() below), see:
     * https://stackoverflow.com/questions/33023949/0xff0000ff-an-integer-literal-does-not-conform-to-the-expected-type-kotlin-int
     * and https://youtrack.jetbrains.com/issue/KT-4749
     * Solved by adding the color as a triple of shorts.
     */
    data class AtomInfo(
            val atomNumber: Int,
            val atomChemicalSymbol: String,
            val atomElementName: String,
            var atomRadius: Int = 0,
            val atomRed: Short,
            val atomGreen: Short,
            val atomBlue: Short
    )
    val atomInfoList = listOf(
            AtomInfo(
                    atomNumber = 1,
                    atomChemicalSymbol = "H",
                    atomElementName = "hydrogen",
                    atomRadius = 120,
                    atomRed = 255,
                    atomGreen = 255,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 2,
                    atomChemicalSymbol = "HE",
                    atomElementName = "helium",
                    atomRadius = 140,
                    atomRed = 217,
                    atomGreen = 255,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 3,
                    atomChemicalSymbol = "LI",
                    atomElementName = "lithium",
                    atomRadius = 182,
                    atomRed = 178,
                    atomGreen = 33,
                    atomBlue = 33
            ),
            AtomInfo(
                    atomNumber = 4,
                    atomChemicalSymbol = "BE",
                    atomElementName = "beryllium",
                    atomRadius = 153,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 5,
                    atomChemicalSymbol = "B",
                    atomElementName = "boron",
                    atomRadius = 192,
                    atomRed = 0,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 6,
                    atomChemicalSymbol = "C",
                    atomElementName = "carbon",
                    atomRadius = 170,
                    atomRed = 227,
                    atomGreen = 195,
                    atomBlue = 152
            ),
            AtomInfo(
                    atomNumber = 7,
                    atomChemicalSymbol = "N",
                    atomElementName = "nitrogen",
                    atomRadius = 155,
                    atomRed = 135,
                    atomGreen = 206,
                    atomBlue = 230
            ),
            AtomInfo(
                    atomNumber = 8,
                    atomChemicalSymbol = "O",
                    atomElementName = "oxygen",
                    atomRadius = 152,
                    atomRed = 255,
                    atomGreen = 0,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 9,
                    atomChemicalSymbol = "F",
                    atomElementName = "fluorine",
                    atomRadius = 147,
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 10,
                    atomChemicalSymbol = "NE",
                    atomElementName = "neon",
                    atomRadius = 154,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 11,
                    atomChemicalSymbol = "NA",
                    atomElementName = "sodium",
                    atomRadius = 227,
                    atomRed = 0,
                    atomGreen = 0,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 12,
                    atomChemicalSymbol = "MG",
                    atomElementName = "magnesium",
                    atomRadius = 173,
                    atomRed = 34,
                    atomGreen = 139,
                    atomBlue = 34
            ),
            AtomInfo(
                    atomNumber = 13,
                    atomChemicalSymbol = "AL",
                    atomElementName = "aluminium",
                    atomRadius = 184,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 14,
                    atomChemicalSymbol = "SI",
                    atomElementName = "silicon",
                    atomRadius = 210,
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 15,
                    atomChemicalSymbol = "P",
                    atomElementName = "phosphorus",
                    atomRadius = 180,
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 16,
                    atomChemicalSymbol = "S",
                    atomElementName = "sulfur",
                    atomRadius = 180,
                    atomRed = 255,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 17,
                    atomChemicalSymbol = "CL",
                    atomElementName = "chlorine",
                    atomRadius = 175,
                    atomRed = 0,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 18,
                    atomChemicalSymbol = "AR",
                    atomElementName = "argon",
                    atomRadius = 188,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 19,
                    atomChemicalSymbol = "K",
                    atomElementName = "potassium",
                    atomRadius = 275,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 20,
                    atomChemicalSymbol = "CA",
                    atomElementName = "calcium",
                    atomRadius = 231,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 21,
                    atomChemicalSymbol = "SC",
                    atomElementName = "scandium",
                    atomRadius = 211,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 22,
                    atomChemicalSymbol = "TI",
                    atomElementName = "titanium",
                    atomRadius = 0,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 23,
                    atomChemicalSymbol = "V",
                    atomElementName = "vanadium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 24,
                    atomChemicalSymbol = "CR",
                    atomElementName = "chromium",
                    atomRadius = 0,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 25,
                    atomChemicalSymbol = "MN",
                    atomElementName = "manganese",
                    atomRadius = 0,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 26,
                    atomChemicalSymbol = "FE",
                    atomElementName = "iron",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 27,
                    atomChemicalSymbol = "Co",
                    atomElementName = "cobalt",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 28,
                    atomChemicalSymbol = "NI",
                    atomElementName = "nickel",
                    atomRadius = 163,
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 29,
                    atomChemicalSymbol = "CU",
                    atomElementName = "copper",
                    atomRadius = 140,
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 30,
                    atomChemicalSymbol = "ZN",
                    atomElementName = "zinc",
                    atomRadius = 139,
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 31,
                    atomChemicalSymbol = "GA",
                    atomElementName = "gallium",
                    atomRadius = 187,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 32,
                    atomChemicalSymbol = "GE",
                    atomElementName = "germanium",
                    atomRadius = 211,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 33,
                    atomChemicalSymbol = "AS",
                    atomElementName = "arsenic",
                    atomRadius = 185,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 34,
                    atomChemicalSymbol = "SE",
                    atomElementName = "selenium",
                    atomRadius = 190,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 35,
                    atomChemicalSymbol = "BR",
                    atomElementName = "bromine",
                    atomRadius = 185,
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 36,
                    atomChemicalSymbol = "KR",
                    atomElementName = "krypton",
                    atomRadius = 202,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 37,
                    atomChemicalSymbol = "RB",
                    atomElementName = "rubidium",
                    atomRadius = 303,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 38,
                    atomChemicalSymbol = "SR",
                    atomElementName = "strontium",
                    atomRadius = 249,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 39,
                    atomChemicalSymbol = "Y",
                    atomElementName = "yttrium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 40,
                    atomChemicalSymbol = "ZR",
                    atomElementName = "zirconium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 41,
                    atomChemicalSymbol = "NB",
                    atomElementName = "niobium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 42,
                    atomChemicalSymbol = "MO",
                    atomElementName = "molybdenum",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 43,
                    atomChemicalSymbol = "TC",
                    atomElementName = "technetium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 44,
                    atomChemicalSymbol = "RU",
                    atomElementName = "ruthenium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 45,
                    atomChemicalSymbol = "RH",
                    atomElementName = "rhodium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 46,
                    atomChemicalSymbol = "PD",
                    atomElementName = "palladium",
                    atomRadius = 163,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 47,
                    atomChemicalSymbol = "AG",
                    atomElementName = "silver",
                    atomRadius = 172,
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 48,
                    atomChemicalSymbol = "CD",
                    atomElementName = "cadmium",
                    atomRadius = 158,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 49,
                    atomChemicalSymbol = "IN",
                    atomElementName = "indium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 50,
                    atomChemicalSymbol = "SN",
                    atomElementName = "tin",
                    atomRadius = 217,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 51,
                    atomChemicalSymbol = "SB",
                    atomElementName = "antimony",
                    atomRadius = 206,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 52,
                    atomChemicalSymbol = "TE",
                    atomElementName = "tellurium",
                    atomRadius = 206,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 53,
                    atomChemicalSymbol = "I",
                    atomElementName = "iodine",
                    atomRadius = 198,
                    atomRed = 160,
                    atomGreen = 32,
                    atomBlue = 240
            ),
            AtomInfo(
                    atomNumber = 54,
                    atomChemicalSymbol = "XE",
                    atomElementName = "xenon",
                    atomRadius = 216,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 55,
                    atomChemicalSymbol = "CS",
                    atomElementName = "caesium",
                    atomRadius = 343,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 56,
                    atomChemicalSymbol = "BA",
                    atomElementName = "barium",
                    atomRadius = 268,
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 57,
                    atomChemicalSymbol = "LA",
                    atomElementName = "lanthanum",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 58,
                    atomChemicalSymbol = "CE",
                    atomElementName = "cerium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 59,
                    atomChemicalSymbol = "PR",
                    atomElementName = "praseodymium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 60,
                    atomChemicalSymbol = "ND",
                    atomElementName = "neodymium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 61,
                    atomChemicalSymbol = "PM",
                    atomElementName = "promethium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 62,
                    atomChemicalSymbol = "SM",
                    atomElementName = "samarium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 63,
                    atomChemicalSymbol = "EU",
                    atomElementName = "europium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 64,
                    atomChemicalSymbol = "GD",
                    atomElementName = "gadolinium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 65,
                    atomChemicalSymbol = "TB",
                    atomElementName = "terbium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 66,
                    atomChemicalSymbol = "DY",
                    atomElementName = "dysprosium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 67,
                    atomChemicalSymbol = "HO",
                    atomElementName = "holmium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 68,
                    atomChemicalSymbol = "ER",
                    atomElementName = "erbium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 69,
                    atomChemicalSymbol = "TM",
                    atomElementName = "thulium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 70,
                    atomChemicalSymbol = "YB",
                    atomElementName = "ytterbium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 71,
                    atomChemicalSymbol = "LU",
                    atomElementName = "lutetium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 72,
                    atomChemicalSymbol = "HF",
                    atomElementName = "hafnium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 73,
                    atomChemicalSymbol = "TA",
                    atomElementName = "tantalum",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 74,
                    atomChemicalSymbol = "W",
                    atomElementName = "tungsten",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 75,
                    atomChemicalSymbol = "RE",
                    atomElementName = "rhenium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 76,
                    atomChemicalSymbol = "OS",
                    atomElementName = "osmium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 77,
                    atomChemicalSymbol = "IR",
                    atomElementName = "iridium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 78,
                    atomChemicalSymbol = "PT",
                    atomElementName = "platinum",
                    atomRadius = 175,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 79,
                    atomChemicalSymbol = "AU",
                    atomElementName = "gold",
                    atomRadius = 166,
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 80,
                    atomChemicalSymbol = "HG",
                    atomElementName = "mercury",
                    atomRadius = 155,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 81,
                    atomChemicalSymbol = "TL",
                    atomElementName = "thallium",
                    atomRadius = 0,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 82,
                    atomChemicalSymbol = "PB",
                    atomElementName = "lead",
                    atomRadius = 202,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 83,
                    atomChemicalSymbol = "BI",
                    atomElementName = "bismuth",
                    atomRadius = 207,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 84,
                    atomChemicalSymbol = "PO",
                    atomElementName = "polonium",
                    atomRadius = 197,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 85,
                    atomChemicalSymbol = "AT",
                    atomElementName = "astatine",
                    atomRadius = 202,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 86,
                    atomChemicalSymbol = "RN",
                    atomElementName = "radon",
                    atomRadius = 220,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 87,
                    atomChemicalSymbol = "FR",
                    atomElementName = "francium",
                    atomRadius = 348,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 88,
                    atomChemicalSymbol = "RA",
                    atomElementName = "radium",
                    atomRadius = 283,
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            )

    )
    val eleHash = hashMapOf(
            "H" to 120,
            "HE" to 140,
            "LI" to 182,
            "BE" to 153,
            "B" to 192,
            "C" to 170,
            "N" to 155,
            "O" to 152,
            "F" to 147,
            "NE" to 154,
            "NA" to 227,
            "MG" to 173,
            "AL" to 184,
            "SI" to 210,
            "P" to 180,
            "S" to 180,
            "CL" to 175,
            "AR" to 188,
            "K" to 275,
            "CA" to 231,
            "SC" to 211,
            "NI" to 163,
            "CU" to 140,
            "ZN" to 139,
            "GA" to 187,
            "GE" to 211,
            "AS" to 185,
            "SE" to 190,
            "BR" to 185,
            "KR" to 202,
            "RB" to 303,
            "SR" to 249,
            "PD" to 163,
            "AG" to 172,
            "CD" to 158,
            "LN" to 193,
            "SN" to 217,
            "SB" to 206,
            "TE" to 206,
            "I" to 198,
            "XE" to 216,
            "CS" to 343,
            "BA" to 268,
            "PT" to 175,
            "AU" to 166,
            "HG" to 155,
            "PB" to 202,
            "BI" to 207,
            "PO" to 197,
            "AT" to 202,
            "RN" to 220,
            "FR" to 348,
            "RA" to 283
    )

}
