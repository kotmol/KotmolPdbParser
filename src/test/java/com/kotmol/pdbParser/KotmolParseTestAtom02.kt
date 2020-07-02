package com.kotmol.pdbParser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

internal class KotmolParseTestAtom02 {

    lateinit var str : ByteArrayInputStream
    val mol = Molecule()
    val parse = ParserPdbFile(mol)

    @org.junit.jupiter.api.BeforeEach
    fun setUp() { // from 1bna.pdb
        val anAtom = """
            ATOM      1  O5'  DC A   1      18.935  34.195  25.617  1.00 64.35           O 
        """.trimIndent()

        str = anAtom.byteInputStream()
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
        str.close()
    }

    @Test
    @DisplayName( "test an ATOM line")
    fun testThis() {

        parse.loadPdbFromStream(str)

        assertEquals(1, mol.maxAtomNumber)

        val atoms = mol.atoms
        assertEquals(1, atoms.size)

        val firstAtom = atoms[1]
        assertEquals("O5'", firstAtom?.atomName)

        assertEquals(1,1 )
    }
}