package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler

class Stilum (
    val fontStyle: FontStyle = FontStyle.default,
    val foreGroundColor: Color = Color.default,
    val backGroundColor: Color = Color.default
) {
    companion object {
        fun println (message: String, foreGroundColor: Color = Color.default, backGroundColor: Color = Color.default, fontStyle: FontStyle = FontStyle.default) {
            IoHandler.printWithStandardLibrary(IoHandler.prepareStyledString(message, foreGroundColor, backGroundColor, fontStyle))
        }
    }

    fun println(message: String, foreGroundColor: Color = this.foreGroundColor, backGroundColor: Color = this.backGroundColor,  fontStyle: FontStyle = this.fontStyle) {
        Companion.println(message, foreGroundColor, backGroundColor, fontStyle)
    }
}
