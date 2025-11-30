package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler


enum class Color (
    val foregroundAnsiCode: String,
    val backgroundAnsiCode: String
) {
    black(foregroundAnsiCode = "30", backgroundAnsiCode = "40"),
    red(foregroundAnsiCode = "31", backgroundAnsiCode = "41"),
    green(foregroundAnsiCode = "32", backgroundAnsiCode = "42"),
    yellow(foregroundAnsiCode = "33", backgroundAnsiCode = "43"),
    blue(foregroundAnsiCode = "34", backgroundAnsiCode = "44"),
    magneta(foregroundAnsiCode = "35", backgroundAnsiCode = "45"),
    cyan(foregroundAnsiCode = "36", backgroundAnsiCode = "46"),
    white(foregroundAnsiCode = "37", backgroundAnsiCode = "47"),
    default(foregroundAnsiCode = "39", backgroundAnsiCode = "49"),
    reset(foregroundAnsiCode = "0", backgroundAnsiCode = "0"); // this resets all color and text effects

    operator fun invoke(text: String):String = IoHandler.prepareStyledString(text, TextStyle(this))
}