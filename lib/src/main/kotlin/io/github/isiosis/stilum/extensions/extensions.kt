package io.github.isiosis.stilum.extensions

import io.github.isiosis.stilum.Color.*
import io.github.isiosis.stilum.FontStyle.*

fun String.black() : String = black(this)
fun String.red() : String = red(this)
fun String.green() : String = green(this)
fun String.yellow() : String = yellow(this)
fun String.blue() : String = blue(this)
fun String.magneta() : String = magneta(this)
fun String.cyan() : String = cyan(this)
fun String.white() : String = white(this)

fun String.bold() : String = bold(this)
fun String.italic() : String = italic(this)
fun String.underline() : String = underline(this)
fun String.strikethrough() : String = strikethrough(this)