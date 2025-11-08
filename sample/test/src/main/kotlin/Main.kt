package io.github.isiosis.example

import io.github.isiosis.stilum.*

fun main() {
    Stilum.println("this is red", Colors.RED)
    Stilum.println("this is blue", Colors.BLUE)
    Stilum.println("this is green", Colors.GREEN)
    Stilum.println("this should be white")

    val terminal = Stilum(Colors.RED)

    terminal.println("What color should this be now")
    terminal.println("This should now be ${Colors.RED.name}")
    Stilum.println("this should be back to white")
    terminal.println("and this should be blue", Colors.BLUE)
}