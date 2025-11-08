package io.github.isiosis.stilum

import io.github.isiosis.stilum.IoHandler.IoHandler.Companion.prepareStyledString
import io.github.isiosis.stilum.IoHandler.IoHandler.Companion.printWithStandardLibrary

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
