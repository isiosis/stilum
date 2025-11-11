package io.github.isiosis.stilum.ioHandler

import io.github.isiosis.stilum.Colors

class IoHandler {
    companion object {
        @JvmStatic
        fun prepareStyledString(message: String, color: Colors): String {
            return "${color.ansiCode}${message}${Colors.DEFAULT.ansiCode}"
        }

        @JvmStatic
        fun printWithStandardLibrary(message: String) {
            println(message)
        }
    }
}