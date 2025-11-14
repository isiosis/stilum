package io.github.isiosis.stilum


enum class Color (
    val ansiCode: String
) {
    BLACK(ansiCode = "30"),
    RED(ansiCode = "31"),
    GREEN(ansiCode = "32"),
    YELLOW(ansiCode = "33"),
    BLUE(ansiCode = "34"),
    MAGNETA(ansiCode = "35"),
    CYAN(ansiCode = "36"),
    WHITE(ansiCode = "37"),
    DEFAULT(ansiCode = "0")
}