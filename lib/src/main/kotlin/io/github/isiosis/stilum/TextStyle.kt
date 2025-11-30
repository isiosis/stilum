package io.github.isiosis.stilum

class TextStyle (
    var foregroundColor: Color = Color.default,
    var backgroundColor: Color = Color.default,
    var fontStyle: FontStyle = FontStyle.default
){
    constructor(textStyle: TextStyle):this(textStyle.foregroundColor, textStyle.backgroundColor, textStyle.fontStyle)

    override fun toString(): String {
        return "ForegroundColor: $foregroundColor, BackgroundColor: $backgroundColor, fontStyle: $fontStyle"
    }

    // this is not commutative
    operator fun plus(style2: TextStyle): TextStyle {
        val style = TextStyle(this)
        if (style2.foregroundColor != Color.default) style.foregroundColor = style2.foregroundColor
        if (style2.backgroundColor != Color.default) style.backgroundColor = style2.backgroundColor
        if (style2.fontStyle != FontStyle.default) style.fontStyle = style2.fontStyle

        return style
    }

    fun prepareCondensedStyle(): String {
        var styleCodes = this.fontStyle.ansiCode
        if (this.foregroundColor != Color.default) {
            styleCodes += ";${this.foregroundColor.foregroundAnsiCode}"
        }
        if (this.backgroundColor != Color.default) {
            styleCodes += ";${this.backgroundColor.backgroundAnsiCode}"
        }

        return styleCodes
    }
}