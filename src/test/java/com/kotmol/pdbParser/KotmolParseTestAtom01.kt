package com.kotmol.pdbParser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.InputStream

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

internal class KotmolParseTestAtom01 {

    lateinit var str : ByteArrayInputStream
    lateinit var anAtom : String
    @org.junit.jupiter.api.BeforeEach
    fun setUp() { // from 1bna.pdb
        anAtom = """
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
        val line = str.readBytes()
        val str = String(line)

        // println(str)
        assertEquals(anAtom, str)
    }
}