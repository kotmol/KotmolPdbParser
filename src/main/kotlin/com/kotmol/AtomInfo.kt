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


package com.kotmol

class AtomInfo {
    /*
     * for the mega-annoying hex literal problem (*SPORADIC* toInt() below), see:
     * https://stackoverflow.com/questions/33023949/0xff0000ff-an-integer-literal-does-not-conform-to-the-expected-type-kotlin-int
     * and https://youtrack.jetbrains.com/issue/KT-4749
     */
    data class AtomInfo(
            val atomNumber: Int,
            val atomChemicalSymbol: String,
            val atomElementName: String,
            val atomRed: Short,
            val atomGreen: Short,
            val atomBlue: Short
    )

    val atomInfoList = listOf(

            AtomInfo(
                    atomNumber = 1,
                    atomChemicalSymbol = "H",
                    atomElementName = "hydrogen",
                    atomRed = 255,
                    atomGreen = 255,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 2,
                    atomChemicalSymbol = "He",
                    atomElementName = "helium",
                    atomRed = 217,
                    atomGreen = 255,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 3,
                    atomChemicalSymbol = "Li",
                    atomElementName = "lithium",
                    atomRed = 178,
                    atomGreen = 33,
                    atomBlue = 33
            ),
            AtomInfo(
                    atomNumber = 4,
                    atomChemicalSymbol = "Be",
                    atomElementName = "beryllium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 5,
                    atomChemicalSymbol = "B",
                    atomElementName = "boron",
                    atomRed = 0,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 6,
                    atomChemicalSymbol = "C",
                    atomElementName = "carbon",
                    atomRed = 227,
                    atomGreen = 195,
                    atomBlue = 152
            ),
            AtomInfo(
                    atomNumber = 7,
                    atomChemicalSymbol = "N",
                    atomElementName = "nitrogen",
                    atomRed = 135,
                    atomGreen = 206,
                    atomBlue = 230
            ),
            AtomInfo(
                    atomNumber = 8,
                    atomChemicalSymbol = "O",
                    atomElementName = "oxygen",
                    atomRed = 255,
                    atomGreen = 0,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 9,
                    atomChemicalSymbol = "F",
                    atomElementName = "fluorine",
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 10,
                    atomChemicalSymbol = "NE",
                    atomElementName = "neon",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 11,
                    atomChemicalSymbol = "NA",
                    atomElementName = "sodium",
                    atomRed = 0,
                    atomGreen = 0,
                    atomBlue = 255
            ),
            AtomInfo(
                    atomNumber = 12,
                    atomChemicalSymbol = "MG",
                    atomElementName = "magnesium",
                    atomRed = 34,
                    atomGreen = 139,
                    atomBlue = 34
            ),
            AtomInfo(
                    atomNumber = 13,
                    atomChemicalSymbol = "AL",
                    atomElementName = "aluminium",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 14,
                    atomChemicalSymbol = "SI",
                    atomElementName = "silicon",
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 15,
                    atomChemicalSymbol = "P",
                    atomElementName = "phosphorus",
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 16,
                    atomChemicalSymbol = "S",
                    atomElementName = "sulfur",
                    atomRed = 255,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 17,
                    atomChemicalSymbol = "CL",
                    atomElementName = "chlorine",
                    atomRed = 0,
                    atomGreen = 255,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 18,
                    atomChemicalSymbol = "AR",
                    atomElementName = "argon",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 19,
                    atomChemicalSymbol = "K",
                    atomElementName = "potassium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 20,
                    atomChemicalSymbol = "CA",
                    atomElementName = "calcium",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 21,
                    atomChemicalSymbol = "SC",
                    atomElementName = "scandium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 22,
                    atomChemicalSymbol = "TI",
                    atomElementName = "titanium",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 23,
                    atomChemicalSymbol = "V",
                    atomElementName = "vanadium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 24,
                    atomChemicalSymbol = "CR",
                    atomElementName = "chromium",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 25,
                    atomChemicalSymbol = "MN",
                    atomElementName = "manganese",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 26,
                    atomChemicalSymbol = "FE",
                    atomElementName = "iron",
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 27,
                    atomChemicalSymbol = "Co",
                    atomElementName = "cobalt",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 28,
                    atomChemicalSymbol = "NI",
                    atomElementName = "nickel",
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 29,
                    atomChemicalSymbol = "CU",
                    atomElementName = "copper",
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 30,
                    atomChemicalSymbol = "ZN",
                    atomElementName = "zinc",
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 31,
                    atomChemicalSymbol = "GA",
                    atomElementName = "gallium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 32,
                    atomChemicalSymbol = "GE",
                    atomElementName = "germanium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 33,
                    atomChemicalSymbol = "AS",
                    atomElementName = "arsenic",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 34,
                    atomChemicalSymbol = "SE",
                    atomElementName = "selenium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 35,
                    atomChemicalSymbol = "BR",
                    atomElementName = "bromine",
                    atomRed = 128,
                    atomGreen = 40,
                    atomBlue = 40
            ),
            AtomInfo(
                    atomNumber = 36,
                    atomChemicalSymbol = "KR",
                    atomElementName = "krypton",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 37,
                    atomChemicalSymbol = "RB",
                    atomElementName = "rubidium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 38,
                    atomChemicalSymbol = "SR",
                    atomElementName = "strontium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 39,
                    atomChemicalSymbol = "Y",
                    atomElementName = "yttrium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 40,
                    atomChemicalSymbol = "ZR",
                    atomElementName = "zirconium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 41,
                    atomChemicalSymbol = "NB",
                    atomElementName = "niobium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 42,
                    atomChemicalSymbol = "MO",
                    atomElementName = "molybdenum",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 43,
                    atomChemicalSymbol = "TC",
                    atomElementName = "technetium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 44,
                    atomChemicalSymbol = "RU",
                    atomElementName = "ruthenium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 45,
                    atomChemicalSymbol = "RH",
                    atomElementName = "rhodium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 46,
                    atomChemicalSymbol = "PD",
                    atomElementName = "palladium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 47,
                    atomChemicalSymbol = "AG",
                    atomElementName = "silver",
                    atomRed = 105,
                    atomGreen = 105,
                    atomBlue = 105
            ),
            AtomInfo(
                    atomNumber = 48,
                    atomChemicalSymbol = "CD",
                    atomElementName = "cadmium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 49,
                    atomChemicalSymbol = "IN",
                    atomElementName = "indium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 50,
                    atomChemicalSymbol = "SN",
                    atomElementName = "tin",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 51,
                    atomChemicalSymbol = "SB",
                    atomElementName = "antimony",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 52,
                    atomChemicalSymbol = "TE",
                    atomElementName = "tellurium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 53,
                    atomChemicalSymbol = "I",
                    atomElementName = "iodine",
                    atomRed = 160,
                    atomGreen = 32,
                    atomBlue = 240
            ),
            AtomInfo(
                    atomNumber = 54,
                    atomChemicalSymbol = "XE",
                    atomElementName = "xenon",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 55,
                    atomChemicalSymbol = "CS",
                    atomElementName = "caesium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 56,
                    atomChemicalSymbol = "BA",
                    atomElementName = "barium",
                    atomRed = 255,
                    atomGreen = 170,
                    atomBlue = 0
            ),
            AtomInfo(
                    atomNumber = 57,
                    atomChemicalSymbol = "LA",
                    atomElementName = "lanthanum",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 58,
                    atomChemicalSymbol = "CE",
                    atomElementName = "cerium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 59,
                    atomChemicalSymbol = "PR",
                    atomElementName = "praseodymium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 60,
                    atomChemicalSymbol = "ND",
                    atomElementName = "neodymium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 61,
                    atomChemicalSymbol = "PM",
                    atomElementName = "promethium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 62,
                    atomChemicalSymbol = "SM",
                    atomElementName = "samarium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 63,
                    atomChemicalSymbol = "EU",
                    atomElementName = "europium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 64,
                    atomChemicalSymbol = "GD",
                    atomElementName = "gadolinium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 65,
                    atomChemicalSymbol = "TB",
                    atomElementName = "terbium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 66,
                    atomChemicalSymbol = "DY",
                    atomElementName = "dysprosium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 67,
                    atomChemicalSymbol = "HO",
                    atomElementName = "holmium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 68,
                    atomChemicalSymbol = "ER",
                    atomElementName = "erbium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 69,
                    atomChemicalSymbol = "TM",
                    atomElementName = "thulium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 70,
                    atomChemicalSymbol = "YB",
                    atomElementName = "ytterbium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 71,
                    atomChemicalSymbol = "LU",
                    atomElementName = "lutetium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 72,
                    atomChemicalSymbol = "HF",
                    atomElementName = "hafnium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 73,
                    atomChemicalSymbol = "TA",
                    atomElementName = "tantalum",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 74,
                    atomChemicalSymbol = "W",
                    atomElementName = "tungsten",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 75,
                    atomChemicalSymbol = "RE",
                    atomElementName = "rhenium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 76,
                    atomChemicalSymbol = "OS",
                    atomElementName = "osmium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 77,
                    atomChemicalSymbol = "IR",
                    atomElementName = "iridium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 78,
                    atomChemicalSymbol = "PT",
                    atomElementName = "platinum",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 79,
                    atomChemicalSymbol = "AU",
                    atomElementName = "gold",
                    atomRed = 218,
                    atomGreen = 165,
                    atomBlue = 32
            ),
            AtomInfo(
                    atomNumber = 80,
                    atomChemicalSymbol = "HG",
                    atomElementName = "mercury",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 81,
                    atomChemicalSymbol = "TL",
                    atomElementName = "thallium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 82,
                    atomChemicalSymbol = "PB",
                    atomElementName = "lead",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 83,
                    atomChemicalSymbol = "BI",
                    atomElementName = "bismuth",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 84,
                    atomChemicalSymbol = "PO",
                    atomElementName = "polonium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 85,
                    atomChemicalSymbol = "AT",
                    atomElementName = "astatine",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 86,
                    atomChemicalSymbol = "RN",
                    atomElementName = "radon",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 87,
                    atomChemicalSymbol = "FR",
                    atomElementName = "francium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 88,
                    atomChemicalSymbol = "RA",
                    atomElementName = "radium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 89,
                    atomChemicalSymbol = "AC",
                    atomElementName = "actinium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 90,
                    atomChemicalSymbol = "TH",
                    atomElementName = "thorium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 91,
                    atomChemicalSymbol = "PA",
                    atomElementName = "protactinium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 92,
                    atomChemicalSymbol = "U",
                    atomElementName = "uranium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 93,
                    atomChemicalSymbol = "NP",
                    atomElementName = "neptunium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 94,
                    atomChemicalSymbol = "PU",
                    atomElementName = "plutonium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 95,
                    atomChemicalSymbol = "AM",
                    atomElementName = "americium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 96,
                    atomChemicalSymbol = "CM",
                    atomElementName = "curium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 97,
                    atomChemicalSymbol = "BK",
                    atomElementName = "berkelium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 98,
                    atomChemicalSymbol = "CF",
                    atomElementName = "californium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 99,
                    atomChemicalSymbol = "ES",
                    atomElementName = "einsteinium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 100,
                    atomChemicalSymbol = "FM",
                    atomElementName = "fermium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 101,
                    atomChemicalSymbol = "MD",
                    atomElementName = "mendelevium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 102,
                    atomChemicalSymbol = "NO",
                    atomElementName = "nobelium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 103,
                    atomChemicalSymbol = "LR",
                    atomElementName = "lawrencium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 104,
                    atomChemicalSymbol = "RF",
                    atomElementName = "rutherfordium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 105,
                    atomChemicalSymbol = "DB",
                    atomElementName = "dubnium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 106,
                    atomChemicalSymbol = "SG",
                    atomElementName = "seaborgium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 107,
                    atomChemicalSymbol = "BH",
                    atomElementName = "bohrium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 108,
                    atomChemicalSymbol = "HS",
                    atomElementName = "hassium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 109,
                    atomChemicalSymbol = "MT",
                    atomElementName = "meitnerium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 110,
                    atomChemicalSymbol = "DS",
                    atomElementName = "darmstadtium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 111,
                    atomChemicalSymbol = "RG",
                    atomElementName = "roentgenium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 112,
                    atomChemicalSymbol = "CN",
                    atomElementName = "copernicium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 113,
                    atomChemicalSymbol = "Uut",
                    atomElementName = "ununtrium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 114,
                    atomChemicalSymbol = "Fl",
                    atomElementName = "flerovium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 115,
                    atomChemicalSymbol = "Uup",
                    atomElementName = "ununpentium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 116,
                    atomChemicalSymbol = "Lv",
                    atomElementName = "livermorium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 117,
                    atomChemicalSymbol = "Uus",
                    atomElementName = "ununseptium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            ),
            AtomInfo(
                    atomNumber = 118,
                    atomChemicalSymbol = "Uuo",
                    atomElementName = "ununoctium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            )
    )
}

