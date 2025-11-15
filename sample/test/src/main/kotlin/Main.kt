package io.github.isiosis.example

import io.github.isiosis.stilum.Stilum
import io.github.isiosis.stilum.Color.*
import io.github.isiosis.stilum.FontStyle.*

fun main() {
    Stilum.println("this is red", red)
    Stilum.println("this is blue", blue)
    Stilum.println("this is green", green)
    Stilum.println("this should be white")

    val terminal = Stilum(foreGroundColor = red)

    terminal.println("What color should this be now")
    terminal.println("This should now be ${red.name}")
    Stilum.println("this should be back to white")
    terminal.println("and this should be blue and italic", blue, fontStyle = italic)
    terminal.println("and this should be green and bold", green, fontStyle = bold)
    terminal.println("now this should be strikethrough", fontStyle = strikethrough)
    terminal.println("and this should be underlined", fontStyle = underline)
    Stilum.println("this is a message with a background color of red and foreground white", foreGroundColor = white, backGroundColor = red)
    Stilum.println(red("will this be red now?"))
    Stilum.println(yellow("will this be yellow?"))
    Stilum.println(bold("this should be bold"))
}