package io.github.isiosis.stilum

enum class FontStyle (
    val ansiCode: String
) {
    BOLD(ansiCode = "1"),
    ITALIC(ansiCode = "3"),
    DEFAULT(ansiCode = "0")
}