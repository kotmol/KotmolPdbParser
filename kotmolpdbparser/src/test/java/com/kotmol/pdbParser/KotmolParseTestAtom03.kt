package com.kotmol.pdbParser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

internal class KotmolParseTestAtom03 {

    lateinit var str : ByteArrayInputStream
    val mol = Molecule()
    val parse = ParserPdbFile()

    @org.junit.jupiter.api.BeforeEach
    fun setUp() { // from 1bna.pdb
        val anAtom = """
ATOM      1  O5'  DC A   1      18.935  34.195  25.617  1.00 64.35           O  
ATOM      2  C5'  DC A   1      19.130  33.921  24.219  1.00 44.69           C  
ATOM      3  C4'  DC A   1      19.961  32.668  24.100  1.00 31.28           C 
        """.trimIndent()

        str = anAtom.byteInputStream()
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
        str.close()
    }

    @Test
    @DisplayName( "test with 3 atoms - should have a bond list of size 2 as a result")
    fun testWithThreeAtoms() {

        var messages : MutableList<String> = mutableListOf()

        parse.loadPdbFromStream(str, mol, messages)

        assertEquals(3, mol.maxAtomNumber)

        val atoms = mol.atoms
        assertEquals(3, atoms.size)

        val firstAtom = atoms[1]
        assertEquals("O5'", firstAtom?.atomName)

        assertEquals(2, mol.bondList.size)
    }
}