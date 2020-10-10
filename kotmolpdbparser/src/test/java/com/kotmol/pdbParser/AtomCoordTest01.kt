package com.kotmol.pdbParser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

/**
 * Test processing of atom x/y/x coordinates
 */
internal class AtomCoordTest01 {

    lateinit var str00 : ByteArrayInputStream
    val mol = Molecule()
    val parse = ParserPdbFile(mol)

    @org.junit.jupiter.api.BeforeEach
    fun setUp() { // from 1bna.pdb
        val anAtomZero = """
ATOM      1  O5'  DC A   1      00.000  00.000  00.000  1.00 64.35           O
        """.trimIndent()

        str00 = anAtomZero.byteInputStream()
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
        str00.close()
    }

    @Test
    @DisplayName( "test with a 000 coordinate atom")
    fun testWithZeroCoordinateAtom() {

        var messages : MutableList<String> = mutableListOf()

        ParserPdbFile
                .Builder(mol)
                .loadPdbFromStream(str00)
                .parse()

        assertEquals(1, mol.maxAtomNumber)

        val atoms = mol.atomNumberToAtomInfoHash
        assertEquals(1, atoms.size)

        val firstAtom = atoms[1]
        assertEquals("O5'", firstAtom?.atomName)

        val maxCoord = mol.maxCoordinate
        assertEquals(maxCoord, 0.0)
    }
}