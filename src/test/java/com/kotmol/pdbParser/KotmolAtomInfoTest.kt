@file:Suppress(
        "unused",
        "unused_variable",
        "unused_parameter",
        "deprecation",
        "UNUSED_ANONYMOUS_PARAMETER",
        "UNUSED_EXPRESSION",
        "MemberVisibilityCanBePrivate",
        "FunctionWithLambdaExpressionBody",
        "UnusedMainParameter", "JoinDeclarationAndAssignment",
        "CanBePrimaryConstructorProperty", "RemoveEmptyClassBody",
        "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "UNUSED_VALUE",
        "ConstantConditionIf", "ReplaceSingleLineLet",
        "ReplaceJavaStaticMethodWithKotlinAnalog",
        "NestedLambdaShadowedImplicitParameter"
)
package com.kotmol.pdbParser

import com.kotmol.AtomInfo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

internal class KotmolAtomInfoTest {
    /*
     * for every bond list, scan the list and verify that all bond pairs have at least one
     * match of an atom to another atom.   That is to say - in the directed graph
     * that is described by the bond pairs - there is no orphaned pair orbiting alone.
     */
    @Test
    @DisplayName("touch test the atomInfo setup")
    fun touchTestOfAtomInfo() {
        val info = AtomInfo().atomInfoList

        assertEquals("hydrogen", info[1-1].atomElementName )
        assertEquals("H", info[1-1].atomChemicalSymbol)

        assertEquals("carbon", info[6-1].atomElementName )
        assertEquals("C", info[6-1].atomChemicalSymbol)

        assertEquals("ununoctium", info[118-1].atomElementName )
        assertEquals("Uuo", info[118-1].atomChemicalSymbol)

    }
}
