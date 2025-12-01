package io.github.isiosis.example

import io.github.isiosis.stilum.Color
import io.github.isiosis.stilum.Stilum
import io.github.isiosis.stilum.Color.*
import io.github.isiosis.stilum.FontStyle
import io.github.isiosis.stilum.FontStyle.*
import io.github.isiosis.stilum.TextStyle
import io.github.isiosis.stilum.ESC
import io.github.isiosis.stilum.ioHandler.IoHandler

fun main() {
//    Stilum.println("this is red", red)
//    Stilum.println("this is blue", blue)
//    Stilum.println("this is green", green)
//    Stilum.println("this should be white")
//
    val terminal = Stilum(foregroundColor = blue)
//
    terminal.println("What color should this be now")
//    terminal.println("This should now be ${red.name}")
//    Stilum.println("this should be back to white")
    terminal.println("and this should be blue and italic", foregroundColor = green, fontStyle = italic)
    terminal.println("and this should be green and bold", green, fontStyle = bold)
    terminal.println("now this should be strikethrough", fontStyle = strikethrough)
//    terminal.println("and this should be underlined", fontStyle = underline)
//    Stilum.println("this is a message with a background color of red and foreground white", foregroundColor = white, backgroundColor = red)
    Stilum.println(red("will this be red now?"))
    terminal.println(red("what is this going to be")) // is this intended? Class Styles override specifically applied styles
    Stilum.println(italic(yellow("will this be yellow?")))
//    Stilum.println(bold("this should be bold and red"))
//    kotlin.io.println("$ESC${green.foregroundAnsiCode};${italic.ansiCode}mThis should be italic and green${ESC}0m")
//    regexTest()
}

fun regexTest() {
    val inputText = IoHandler.prepareStyledString("message", TextStyle(foregroundColor = red) )
//    val inputText = "$ESC[${Color.red.backgroundAnsiCode};${Color.blue.foregroundAnsiCode};${FontStyle.underline.ansiCode}mMessage${ESC}[0m"
    val regEx = Regex("""$ESC(?:[@-Z\\-_]|\[[0-?]*m)""")
    var style = TextStyle()
    val result = regEx.replace(inputText) { match ->
        if (match.range.last == inputText.lastIndex) return@replace ""
        style = createTextStyle(extractCodes(match.value))
        ""
    }

    println(inputText)
    println("found style: ${style}")
    println("matched regex: " + result)
}

fun extractCodes(matchedString: String) : List<String> {
    val foundCodes = matchedString.split("[")[1].split("m")[0].split(";")
    return foundCodes
}

fun createTextStyle(foundCodes: List<String>) : TextStyle{
    val textStyle = TextStyle()
    println("foundCodes $foundCodes")
    for (code in foundCodes) {
        println("current Code $code")
        for (option in Color.entries) {
            if (code == option.foregroundAnsiCode ) {
                textStyle.foregroundColor = option
            } else if (code == option.backgroundAnsiCode) {
                textStyle.backgroundColor = option
            }
        }

        for (option in FontStyle.entries) {
            println("Current option: $option ${option.ansiCode}")
            if (code == option.ansiCode) {
                println("matched")
                textStyle.fontStyle = option
            }
        }
    }
    println("newly created style $textStyle")
    return textStyle
}