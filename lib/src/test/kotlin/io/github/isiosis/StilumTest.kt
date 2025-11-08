package io.github.isiosis

import io.github.isiosis.stilum.Stilum
import kotlin.test.Test

class StilumTest {

    @Test
    fun `should prepare styled string`() {
    }

    @Test fun printlnReturnsExactTest() {
        val terminal = Stilum()
        val output = terminal.println("This is a message")
        println("The test output is: ${output}")
    }


    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Stilum()
    }
}
