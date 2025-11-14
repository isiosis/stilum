package io.github.isiosis

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.ioHandler.*
import kotlin.test.Test

class IoHandlerTest {

    @Test
    fun `should prepare styled string with the default color`() {
        val color = Color.DEFAULT
        val fontStyle = FontStyle.DEFAULT
        val message = "message"
        val outputString = IoHandler.prepareStyledString(message, color, color, fontStyle)
        assert(outputString.equals("$ESC${fontStyle.ansiCode};${color.foreGroundAnsiCode};${color.backGroundAnsiCode}m$message${ESC}0m"))
    }
}