package com.kotmol.pdbParser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

/**
 * Test processing of atom x/y/x coordinates
 *
 */
internal class AtomCoordTest03 {

    lateinit var str00 : ByteArrayInputStream
    val mol = Molecule()
    val parse = ParserPdbFile(mol)

    @org.junit.jupiter.api.BeforeEach
    fun setUp() { // from 1bna.pdb
        val anAtomZero = """
ATOM      1  O5'  DC A   1      10.000  00.000  00.000  1.00 64.35           O  
ATOM      2  C5'  DC A   1      00.000  10.000  00.000  1.00 44.69           C  
ATOM      3  C4'  DC A   1      00.000  00.000  10.000  1.00 31.28           C 
        """.trimIndent()

        str00 = anAtomZero.byteInputStream()
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
        str00.close()
    }

    @Test
    @DisplayName( "test with a 10, 10, 10 max coordinate atom")
    fun testWithZeroCoordinateAtom() {

        var messages : MutableList<String> = mutableListOf()

        ParserPdbFile
                .Builder(mol)
                .loadPdbFromStream(str00)
                .parse()

        assertEquals(3, mol.maxAtomNumber)

        val atoms = mol.atomNumberToAtomInfoHash
        assertEquals(3, atoms.size)

        val maxCoord = mol.maxCoordinate
        assertEquals(maxCoord, 10.0)
    }
}