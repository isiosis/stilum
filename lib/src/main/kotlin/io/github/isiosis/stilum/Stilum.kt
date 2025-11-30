package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler

class Stilum {
    var textStyle: TextStyle

    constructor(foregroundColor: Color = Color.default, backgroundColor: Color = Color.default, fontStyle: FontStyle = FontStyle.default) {
        this.textStyle = TextStyle(foregroundColor, backgroundColor, fontStyle)
    }

    companion object {
        fun println (message: String, foregroundColor: Color = Color.default, backgroundColor: Color = Color.default, fontStyle: FontStyle = FontStyle.default) {
            IoHandler.printWithStandardLibrary(IoHandler.prepareStyledString(message, TextStyle(foregroundColor, backgroundColor, fontStyle)))
        }
    }

    fun println(message: String, foregroundColor: Color = this.textStyle.foregroundColor, backgroundColor: Color = this.textStyle.backgroundColor,  fontStyle: FontStyle = this.textStyle.fontStyle) {
        Companion.println(message, foregroundColor, backgroundColor, fontStyle)
    }
}
