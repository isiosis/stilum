# Stilum
Terminal output styler for Kotlin.

## Getting Started
Stilum is a simple terminal output styler for Kotlin. The package is available @stilum on maven.
It exposes the class Stilum that can be used as pre styled output element or through it's companion object, it can be used to style elements on the fly.
Sample usages

`
import io.github.isiosis.stilum.Stilum
import io.github.isiosis.stilum.Color

fun main() {
    val terminal = Stilum(foregroundColor = Color.red)
    terminal.println("This output should be red")
}
`

The above usage should output the following

/// Image of the output with red


## Usage

To start using Stilum get the package from the maven repository from the group `io.github.isiosis` and package name `Stilum`


## Releases
