package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler


enum class Color (
    val foreGroundAnsiCode: String,
    val backGroundAnsiCode: String
) {
    black(foreGroundAnsiCode = "30", backGroundAnsiCode = "40"),
    red(foreGroundAnsiCode = "31", backGroundAnsiCode = "41"),
    green(foreGroundAnsiCode = "32", backGroundAnsiCode = "42"),
    yellow(foreGroundAnsiCode = "33", backGroundAnsiCode = "43"),
    blue(foreGroundAnsiCode = "34", backGroundAnsiCode = "44"),
    magneta(foreGroundAnsiCode = "35", backGroundAnsiCode = "45"),
    cyan(foreGroundAnsiCode = "36", backGroundAnsiCode = "46"),
    white(foreGroundAnsiCode = "37", backGroundAnsiCode = "47"),
    default(foreGroundAnsiCode = "39", backGroundAnsiCode = "49"),
    reset(foreGroundAnsiCode = "0", backGroundAnsiCode = "0"); // this resets all color and text effects


    operator fun invoke(text: String):String {
        return IoHandler.prepareStyledString(text, this, Color.default, FontStyle.default)
    }
}