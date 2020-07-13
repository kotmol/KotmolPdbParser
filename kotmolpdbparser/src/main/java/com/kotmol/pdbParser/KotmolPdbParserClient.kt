/*
 *
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
 */

package com.kotmol.pdbParser

import java.io.InputStream

class KotmolPdbParserClient internal constructor(
        builder: Builder
) {

    constructor() : this(Builder())
    
    class Builder constructor() {
//        internal var molecule = Molecule()
        internal var messageStrings : MutableList<String> = mutableListOf()

        internal var stream: InputStream? = null

        /**
         * set the input stream of the PDB file to parse
         */
        fun setStream(inputStream: InputStream?) = apply {
            requireNotNull(inputStream)
            stream = inputStream
        }

        /**
         * begin parsing!!
         */
        fun parse(molecule: Molecule) = apply {
            requireNotNull(stream)

            val parserPdbFile = ParserPdbFile.Builder()
                    .setMessageStrings(messageStrings)
                    .loadPdbFromStream(stream!!, molecule)
        }

        /**
         * begin parsing!!
         */
        fun parse(molecule: Molecule, retainMessages: MutableList<String>) = apply {
            requireNotNull(stream)

            val parserPdbFile = ParserPdbFile.Builder()
                    .setMessageStrings(retainMessages)
                    .loadPdbFromStream(stream!!, molecule)
        }
    }



}

