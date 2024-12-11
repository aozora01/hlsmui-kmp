package io.github.aozora01.hlsmui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.shape.HShapes
import io.github.aozora01.hlsmui.ui.typography.font.HFont
import io.github.aozora01.hlsmui.ui.typography.font_family.HFontFamily

class HTheme(
    val name: String = "Default",
    val colorScheme: HColorScheme,
    val font: HFont,
    val shapes : HShapes
){
    @Composable
    fun getTypography() :Typography {
        val fontFamily  = when(font){
            HFont.Default -> FontFamily.Default
            HFont.Serif -> FontFamily.Serif
            HFont.SansSerif -> FontFamily.SansSerif
            HFont.Cursive -> FontFamily.Cursive
            HFont.Monospace -> FontFamily.Monospace
            HFont.Quicksand -> HFontFamily.QuickSand()
        }
        return getTypographyByFontFamily(fontFamily)
    }

    @Composable
    private fun getTypographyByFontFamily(fontFamily: FontFamily) :Typography {

        return Typography().run {

            copy(
                displayLarge = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 57.sp,
                    lineHeight = 64.sp,
                    letterSpacing = (-0.25).sp
                ),
                displayMedium = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 45.sp,
                    lineHeight = 52.sp,
                    letterSpacing = 0.sp
                ),
                displaySmall = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 36.sp,
                    lineHeight = 44.sp,
                    letterSpacing = 0.sp
                ),
                headlineLarge = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    lineHeight = 40.sp,
                    letterSpacing = 0.sp
                ),
                headlineMedium = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    lineHeight = 36.sp,
                    letterSpacing = 0.sp
                ),
                headlineSmall = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    letterSpacing = 0.sp
                ),
                titleLarge = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    lineHeight = 28.sp,
                    letterSpacing = 0.sp
                ),
                titleMedium = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    letterSpacing = 0.15.sp
                ),
                titleSmall = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.1.sp
                ),
                bodyLarge = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    letterSpacing = 0.5.sp
                ),
                bodyMedium = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.25.sp
                ),
                bodySmall = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.4.sp
                ),
                labelLarge = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.1.sp
                ),
                labelMedium = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp
                ),
                labelSmall = TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 11.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp
                )
            )

        }
    }

    companion object{
        val Default = HTheme(
            name = "Default",
            colorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme.Default,
            font = HFont.Monospace,
            shapes = HShapes.Default
        )
    }
}