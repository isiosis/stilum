package io.github.isiosis.stilum

class Stilum (
     val color: Colors? = null
) {
    companion object {
        fun println(message: String) {
            printWithStandardLibrary(message)
        }

        fun println (message: String, color: Colors) {
            printWithStandardLibrary(prepareStyledString(message, color))
        }

        private fun prepareStyledString(message: String, color: Colors): String{
            return "${color.ansiCode}${message}${Colors.DEFAULT.ansiCode}"
        }

        private fun printWithStandardLibrary(message: String) {
            kotlin.io.println(message)
        }
    }

    fun println(message: String) {
        if (color !== null) {
            println(message, color)
        } else {
            printWithStandardLibrary(prepareStyledString(message, Colors.DEFAULT))
        }
    }

    fun println (message: String, color: Colors) {
        printWithStandardLibrary(prepareStyledString(message, color))
    }
}
