package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler

class Stilum (
    val fontStyle: FontStyle = FontStyle.default,
    val foregroundColor: Color = Color.default,
    val backgroundColor: Color = Color.default
) {
    companion object {
        fun println (message: String, foregroundColor: Color = Color.default, backgroundColor: Color = Color.default, fontStyle: FontStyle = FontStyle.default) {
            IoHandler.printWithStandardLibrary(IoHandler.prepareStyledString(message, foregroundColor, backgroundColor, fontStyle))
        }
    }

    fun println(message: String, foregroundColor: Color = this.foregroundColor, backgroundColor: Color = this.backgroundColor,  fontStyle: FontStyle = this.fontStyle) {
        Companion.println(message, foregroundColor, backgroundColor, fontStyle)
    }
}
