package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler

class Stilum (
    val fontStyle: FontStyle = FontStyle.DEFAULT,
    val foreGroundColor: Color = Color.DEFAULT,
    val backGroundColor: Color = Color.DEFAULT
) {
    companion object {
        fun println (message: String, foreGroundColor: Color = Color.DEFAULT, backGroundColor: Color = Color.DEFAULT, fontStyle: FontStyle = FontStyle.DEFAULT) {
            IoHandler.printWithStandardLibrary(IoHandler.prepareStyledString(message, foreGroundColor, backGroundColor, fontStyle))
        }
    }

    fun println(message: String, foreGroundColor: Color = this.foreGroundColor, backGroundColor: Color = this.backGroundColor,  fontStyle: FontStyle = this.fontStyle) {
        Companion.println(message, foreGroundColor, backGroundColor, fontStyle)
    }
}
