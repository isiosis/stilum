package io.github.isiosis

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.ESC
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.TextStyle
import io.github.isiosis.stilum.ioHandler.*
import kotlin.test.Test

class IoHandlerTest {

    @Test
    fun `should prepare styled string with the default color`() {
        val color = Color.default
        val fontStyle = FontStyle.default
        val message = "message"
        val outputString = IoHandler.prepareStyledString(message, TextStyle(color, color, fontStyle))
        assert(outputString.equals("$ESC${fontStyle.ansiCode};${color.foregroundAnsiCode};${color.backgroundAnsiCode}m$message${ESC}0m"))
    }
}