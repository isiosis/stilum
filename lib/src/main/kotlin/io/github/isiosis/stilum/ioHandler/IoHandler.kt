package io.github.isiosis.stilum.ioHandler

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.FontStyle

const val ESC = "\u001b["

object IoHandler {
    fun prepareStyledString(message: String, foreGroundColor: Color, backGroundColor: Color, style: FontStyle): String {
        val styledString = "$ESC${style.ansiCode};${foreGroundColor.foreGroundAnsiCode};${backGroundColor.backGroundAnsiCode}m$message${ESC}0m"
        return styledString
    }

    fun printWithStandardLibrary(message: String) {
        kotlin.io.println(message)
    }
}