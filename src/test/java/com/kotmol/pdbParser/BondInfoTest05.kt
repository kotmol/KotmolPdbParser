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

import com.kotmol.BondInfo
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/

// https://stackoverflow.com/a/54938582 - on copying a data class array

internal class BondInfoTest05 {
    /*
     *  verify that that map/copy operation creates a clone of a list/data class
     *    and that there is no reuse of the objects, i.e. pollution of the original
     *    data class array.
     */
    @Test
    @DisplayName("check that original record that was copied has bondRecordCreated still false")
    fun checkForCleanCopyOfBondList() {
        val exampleBondList = BondInfo().ala

        val theCopy = ArrayList(exampleBondList.map { it.copy() })

        exampleBondList[0].bondRecordCreated = true

        val isFlagFalse = theCopy[0].bondRecordCreated

        assertFalse(isFlagFalse)
        assertTrue(exampleBondList[0].bondRecordCreated)
        assertFalse(exampleBondList[0] === theCopy[0])
        assertFalse(exampleBondList[0] == theCopy[0])
        assertTrue(exampleBondList[1] == theCopy[1])
    }


}
