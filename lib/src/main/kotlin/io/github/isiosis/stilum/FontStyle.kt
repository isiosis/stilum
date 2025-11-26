package io.github.isiosis.stilum

import io.github.isiosis.stilum.ioHandler.IoHandler
import io.github.isiosis.stilum.Color

enum class FontStyle (
    val ansiCode: String
) {
    bold(ansiCode = "1"),
    italic(ansiCode = "3"),
    underline(ansiCode = "4"),
    strikethrough(ansiCode = "9"),
    default(ansiCode = "39"),
    reset(ansiCode = "0"); // this resets all color and text effects

    operator fun invoke(text: String) : String = IoHandler.prepareStyledString(text, Color.default, Color.default, this)

}