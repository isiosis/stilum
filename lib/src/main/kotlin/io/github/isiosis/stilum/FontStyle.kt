package io.github.isiosis.stilum

enum class FontStyle (
    val ansiCode: String
) {
    BOLD(ansiCode = "1"),
    ITALIC(ansiCode = "3"),
    UNDERLINE(ansiCode = "4"),
    STRIKETHROUGH(ansiCode = "9"),
    DEFAULT(ansiCode = "0")
}