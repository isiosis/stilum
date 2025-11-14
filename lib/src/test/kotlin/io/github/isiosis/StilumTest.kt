package io.github.isiosis

import io.github.isiosis.stilum.Colors
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.ioHandler.IoHandler
import io.github.isiosis.stilum.Stilum
import io.mockk.every
import io.mockk.mockkObject
import io.mockk.verify
import kotlin.test.Test

class StilumTest {

    @Test
    fun `Stilum uses class color`() {
        mockkObject(IoHandler)
        every { IoHandler.prepareStyledString(any(), any(), any()) }  returns "styled"

        val terminal = Stilum(Colors.RED)
        terminal.println("message")
        verify { IoHandler.prepareStyledString("message", Colors.RED, FontStyle.DEFAULT) }
    }
}
