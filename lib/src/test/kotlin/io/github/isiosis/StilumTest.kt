package io.github.isiosis

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.ioHandler.IoHandler
import io.github.isiosis.stilum.Stilum
import io.mockk.every
import io.mockk.mockkObject
import io.mockk.verify
import kotlin.test.Test

class StilumTest {

    @Test
    fun `Stilum uses class color and font style`() {
        mockkObject(IoHandler)

        every { IoHandler.prepareStyledString(any(), any()) }  returns "styled"

        val terminal = Stilum(foregroundColor = Color.red)
        terminal.println("message")
        verify { IoHandler.prepareStyledString(
            "message",
            match { it.foregroundColor == Color.red
                    && it.backgroundColor == Color.default
                    && it.fontStyle == FontStyle.default
                }
            )
        }
    }
}
