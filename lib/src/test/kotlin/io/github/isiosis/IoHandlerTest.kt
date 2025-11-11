package io.github.isiosis

import io.github.isiosis.stilum.Colors
import io.github.isiosis.stilum.ioHandler.IoHandler
import kotlin.test.Test

class IoHandlerTest {

    @Test
    fun `should prepare styled string with the default color`() {
        val color = Colors.DEFAULT
        val outputString = IoHandler.prepareStyledString("message", color)
        assert(outputString.equals("${color.ansiCode}message${Colors.DEFAULT.ansiCode}"))
    }
}