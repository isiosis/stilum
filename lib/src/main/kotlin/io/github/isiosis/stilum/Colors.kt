package io.github.isiosis.stilum

const val escapeCharacter = "\u001b["

enum class Colors (
    val ansiCode: String
) {
    BLACK(ansiCode = "${escapeCharacter}30m"),
    RED(ansiCode = "${escapeCharacter}31m"),
    GREEN(ansiCode = "${escapeCharacter}32m"),
    YELLOW(ansiCode = "${escapeCharacter}33m"),
    BLUE(ansiCode = "${escapeCharacter}34m"),
    MAGNETA(ansiCode = "${escapeCharacter}35m"),
    CYAN(ansiCode = "${escapeCharacter}36m"),
    WHITE(ansiCode = "${escapeCharacter}37m"),
    DEFAULT(ansiCode = "${escapeCharacter}0m")
}