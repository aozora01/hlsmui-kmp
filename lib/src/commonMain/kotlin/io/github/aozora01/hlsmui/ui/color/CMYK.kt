package io.github.aozora01.hlsmui.ui.color

import androidx.compose.ui.graphics.Color

internal data class CMYK(
    val Black:HColor,
    val Yellow:HColor,
    val Magenta:HColor,
    val Cyan:HColor
)
//) {
//
//}

internal  val CMYKColors: CMYK = CMYK(
    Black = HColor("Black", Color.Black),
    Yellow = HColor("Yellow", Color.Yellow),
    Magenta = HColor("Magenta", Color.Magenta) ,
    Cyan = HColor("Cyan", Color.Cyan)
)