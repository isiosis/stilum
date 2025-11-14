package io.github.isiosis.stilum


enum class Color (
    val foreGroundAnsiCode: String,
    val backGroundAnsiCode: String
) {
    BLACK(foreGroundAnsiCode = "30", backGroundAnsiCode = "40"),
    RED(foreGroundAnsiCode = "31", backGroundAnsiCode = "41"),
    GREEN(foreGroundAnsiCode = "32", backGroundAnsiCode = "42"),
    YELLOW(foreGroundAnsiCode = "33", backGroundAnsiCode = "43"),
    BLUE(foreGroundAnsiCode = "34", backGroundAnsiCode = "44"),
    MAGNETA(foreGroundAnsiCode = "35", backGroundAnsiCode = "45"),
    CYAN(foreGroundAnsiCode = "36", backGroundAnsiCode = "46"),
    WHITE(foreGroundAnsiCode = "37", backGroundAnsiCode = "47"),
    DEFAULT(foreGroundAnsiCode = "39", backGroundAnsiCode = "49"),
    RESET(foreGroundAnsiCode = "0", backGroundAnsiCode = "0") // this resets all color and text effects

}