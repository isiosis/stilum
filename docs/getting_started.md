## Getting Started

Stilum is a simple terminal output styler for Kotlin. It has a set of predefined text colors and styles that can be used
for any terminal output.

## Installation

The package is distributed through maven central. 
```
dependencies {
    implementation("io.github.isiosis.stilum:stilum:0.1.1")
}
```

## Usage

Sample usages

```
    import io.github.isiosis.stilum.Stilum
    import io.github.isiosis.stilum.Color
    
    fun main() {
        val terminal = Stilum(foregroundColor = Color.red)
        terminal.println("This output should be red")
    }
```

The above usage should output the following

![](/img/red_print.png)

Stilum that can be used as pre styled output element or through it's
companion object, it can be used to style elements on the fly.

#### Usage through an instantiated Stilum Object

To use Stilum through an instantiated object, which contains it's own class styling, simply instantiate a new Stilum
class and pass the desired parameters to the constructor.
<br>

There are three parameters that can be passed, `foregroundColor`, `backgroundColor` and `fontStyle`. Each of those can
be used from the equivalently named classes inside the Stilum package.
<br>

Here's an example usage

`val terminal = Stilum(foregroundColor=Color.red, backgroundColor=Color.blue, fontStyle=FontStyle.bold)`

Then doing

`terminal.println("This message should have a red foreground, blue background and bold font)`
will produce the expected result.

**Note**: the explicit styling set for a specific class will take precedence over any styles that are later applied during printing.
For example, while this is possible

```
val terminal = Stilum(fontStyle=FontStyle.bold)
terminal.println("This message should be italic", fontStyle=FontStyle.italic)

```

The output will still be **bold** since the class style takes precedence over the style applied later.

#### Usage through the static `println` method of Stilum

<br>
This provides a quick setup and way to style outputs without creating a styled class in Stilum. To use the class this way:
```
Stilum.println("This message should be yellow", foregroundColor=Color.yellow)
```
less verbose ways to specify the desired style also exist such as:
```
Stilum.println(bold("this message should be bold")) 
// this can then be combined with further styling
Stilum.println(red(bold("this message should be bold and red")))
```
When nesting styles this way, the outermost styling will take precedence if the applied styles are changing the same attribute.
<br>