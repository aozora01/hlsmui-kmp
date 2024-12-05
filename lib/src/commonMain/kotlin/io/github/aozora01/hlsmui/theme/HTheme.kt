package io.github.aozora01.hlsmui.theme

import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.shape.HShapes
import io.github.aozora01.hlsmui.typography.HTypography
import kotlin.random.Random

class HTheme(
    val name: String,
    val colorScheme: HColorScheme,
    val typography: HTypography,
    val shapes : HShapes
){
   companion object{
       val Default = HTheme(
           name = "Default",
           colorScheme = HColorScheme.Default,
           typography = HTypography.Default,
           shapes = HShapes.Default
       )
   }
}