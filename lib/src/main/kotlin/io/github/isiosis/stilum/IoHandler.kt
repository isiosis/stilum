package io.github.isiosis.stilum.IoHandler

import io.github.isiosis.stilum.Colors

class IoHandler {
    companion object {
        fun prepareStyledString(message: String, color: Colors): String {
            return "${color.ansiCode}${message}${Colors.DEFAULT.ansiCode}"
        }

        fun printWithStandardLibrary(message: String) {
            kotlin.io.println(message)
        }
    }
}