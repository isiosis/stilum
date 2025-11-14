package io.github.isiosis.example

import io.github.isiosis.stilum.*

fun main() {
    Stilum.println("this is red", Color.RED)
    Stilum.println("this is blue", Color.BLUE)
    Stilum.println("this is green", Color.GREEN)
    Stilum.println("this should be white")

    val terminal = Stilum(Color.RED)

    terminal.println("What color should this be now")
    terminal.println("This should now be ${Color.RED.name}")
    Stilum.println("this should be back to white")
    terminal.println("and this should be blue and italic", Color.BLUE, FontStyle.ITALIC)
    terminal.println("and this should be green and bold", Color.GREEN, FontStyle.BOLD)
    terminal.println("now this should be strikethrough", fontStyle = FontStyle.STRIKETHROUGH)
    terminal.println("and this should be underlined", fontStyle = FontStyle.UNDERLINE)
}