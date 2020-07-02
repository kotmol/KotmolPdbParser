/*
 *
 *  Copyright (C) 2016-2020 James Andreas
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

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class KotmolAtomInfoTest {

    @Test
    @DisplayName("touch test the atomInfo setup")
    fun touchTestOfAtomInfo() {
        val info = AtomInfo().atomInfoList

        assertEquals("hydrogen", info[1 - 1].atomElementName)
        assertEquals("H", info[1 - 1].atomChemicalSymbol)
        assertEquals(120, info[1 - 1].atomRadius)

        assertEquals("carbon", info[6 - 1].atomElementName)
        assertEquals("C", info[6 - 1].atomChemicalSymbol)
        assertEquals(170, info[6 - 1].atomRadius)

        assertEquals("radium", info[88 - 1].atomElementName)
        assertEquals("RA", info[88 - 1].atomChemicalSymbol)
        assertEquals(283, info[88 - 1].atomRadius)

    }

    @Test
    @DisplayName("scan eleHash hash set for nulls and bad behavior")
    fun scanHashSetForNulls() {
        val hashSet = AtomInfo().eleHash

        for (item in hashSet) {
            val foo = item.key
            val yup = hashSet.containsKey(foo)
            assertTrue(yup)
            val molNum = item.value
            assertNotNull(molNum)
            assertNotEquals(0, molNum)
        }
    }

    /*@Test  // was used to insert atomRadius into table
    @DisplayName("hacking")
    fun hacking() {
        var update = AtomInfo()
        val info = AtomInfo().atomInfoList
        val eleHash = AtomInfo().eleHash
       //println(info)

        for (item in eleHash) {
            for (info2 in info) {
                if (info2.atomChemicalSymbol == item.key) {
                    //println(item.value)
                    info2.atomRadius = item.value
                }
            }
        }

        for (info2 in info) {
            println("AtomInfo(")
            println("atomNumber = ${info2.atomNumber},")
            println("atomChemicalSymbol = \"${info2.atomChemicalSymbol}\",")
            println("atomElementName = \"${info2.atomElementName}\",")
            println("atomRadius = ${info2.atomRadius},")
            println("atomRed = ${info2.atomRed},")
            println("atomGreen = ${info2.atomGreen},")
            println("atomBlue= ${info2.atomBlue}")
            println("),")
        }
    }*/
}

/*
AtomInfo(
                    atomNumber = 88,
                    atomChemicalSymbol = "RA",
                    atomElementName = "radium",
                    atomRed = 255,
                    atomGreen = 20,
                    atomBlue = 147
            )
 */