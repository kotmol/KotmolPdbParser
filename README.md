KotmolPdbParser
==========
sandbox for gradle based kotlin serialization hacking
<br>status: builds

- ReadWritePDBfile

Read in a PDB file that has been edited into a JSON 
data format.

    { "MOL" : [
    {"A": "C","X": "  7.075","Y": " -41.217","Z": "  35.604"},

Write out the data to a file as a binary file.   Then do a test read
back of the data.

- WriteThenReadFloats

testing writing bytes to a file.

- Module1

added a bit of PDB atom serialization from an edited JSON
file extraction.   