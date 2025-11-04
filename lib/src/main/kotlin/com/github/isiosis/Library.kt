package com.github.isiosis.stilum

import com.github.isiosis.Colors


class Stilum {
    companion object {
        fun println(message: String) {
            kotlin.io.println(message)
        }

        fun println (message: String, color: Colors) {
            kotlin.io.println("${color.ansiCode}$message")
        }
    }
}
