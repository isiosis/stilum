package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler

class Stilum (
     val color: Color = Color.DEFAULT,
     val fontStyle: FontStyle = FontStyle.DEFAULT
) {
    companion object {
        fun println (message: String, color: Color = Color.DEFAULT, fontStyle: FontStyle = FontStyle.DEFAULT) {
            IoHandler.printWithStandardLibrary(IoHandler.prepareStyledString(message, color, fontStyle))
        }
    }

    fun println(message: String, color: Color = this.color, fontStyle: FontStyle = this.fontStyle) {
        Companion.println(message, color, fontStyle)
    }
}
