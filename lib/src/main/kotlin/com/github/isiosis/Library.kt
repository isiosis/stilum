package com.github.isiosis.stilum

import com.github.isiosis.Colors


class Stilum (
     val color: Colors? = null
) {
    companion object {
        fun println(message: String) {
            kotlin.io.println(message)
        }

        fun println (message: String, color: Colors) {
            kotlin.io.println("${color.ansiCode}$message${Colors.DEFAULT.ansiCode}")
        }
    }

    fun println(message: String) {
        if (color !== null) {
            println(message, color)
        } else {
            kotlin.io.println(message)
        }
    }

    fun println (message: String, color: Colors) {
        kotlin.io.println("${color.ansiCode}$message${Colors.DEFAULT.ansiCode}")
    }
}
