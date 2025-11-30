package io.github.isiosis.stilum.ioHandler

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.TextStyle
import io.github.isiosis.stilum.ESC
import io.github.isiosis.stilum.ESC_RE


object IoHandler {
    fun prepareStyledString(message: String, textStyle: TextStyle): String {
        val extractedMessageAndStyle = extractStylesFromText(message)
        val extractedMessage = extractedMessageAndStyle.component1()
        val oldStyle = extractedMessageAndStyle.component2()

        val newStyle = oldStyle + textStyle

        val styledString = "$ESC[${newStyle.prepareCondensedStyle()}m$extractedMessage${ESC}[0m"
        return styledString
    }

    fun printWithStandardLibrary(message: String) {
        kotlin.io.println(message)
    }

    private fun extractStylesFromText(text: String): Pair<String, TextStyle>{
        val regEx = Regex(ESC_RE)
        var style = TextStyle()
        val extractedMessage = regEx.replace(text) { match ->
            if (match.range.last == text.lastIndex) return@replace ""
            style = createStyleFromCodes(extractCodes(match.value))
            ""
        }
        return Pair(extractedMessage, style)
    }

    private fun extractCodes(matchedString: String) : List<String> {
        val foundCodes = matchedString.split("[")[1].split("m")[0].split(";")
        return foundCodes
    }

    private fun createStyleFromCodes(codes: List<String>): TextStyle{
        val style = TextStyle()
        for (code in codes) {
            for (option in Color.entries) {
                if (code == option.foregroundAnsiCode) {
                    style.foregroundColor = option
                } else if (code == option.backgroundAnsiCode) {
                    style.backgroundColor = option
                }
            }

            for (option in FontStyle.entries) {
                if (code == option.ansiCode) {
                    style.fontStyle = option
                }
            }
        }

        return style
    }
}