
![](https://img.shields.io/github/license/isiosis/stilum)
# stilum

A simple terminal text styler for kotlin applications.

## Installation

The package is distributed through maven central. Simply add it to your dependencies.
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

![](docs/img/red_print.png)

More documentation can be found in the [docs](https://isiosis.github.io/stilum/)
