package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.ui.color.HColor

private data class ColorGroup(
    val name: String,
    val colors: List<HColor>
)

private val rgbGroup = ColorGroup(
    "RGB",
    listOf(
        HColor.Red,
        HColor.Green,
        HColor.Blue
    )
)

private  val cmykGroup = ColorGroup(
    "CMYK",
    listOf(
        HColor.Cyan,
        HColor.Magenta,
        HColor.Yellow,
        HColor.Black
    )
)

private val otherColorGroups = ColorGroup(
    "Basic Colors",
    listOf(
        HColor.Black,
        HColor.White,
        HColor.Gray,

        HColor.Red,
        HColor.Green,
        HColor.Blue,
        HColor.Yellow,

        HColor.Orange,
        HColor.Purple,
        HColor.Pink,
        HColor.Brown
    )
)

private val medalColorGroups = ColorGroup(
    "Medal Colors",
    listOf(
        HColor.Gold,
        HColor.Silver,
        HColor.Bronze
    )
)

private val crayonColorGroups = ColorGroup(
    "Crayon Colors",
    listOf(
        HColor.Yellow,
        HColor.Bronze,
        HColor.Pink,
        HColor.Green,

        HColor.Emerald,
        HColor.Lilac,
        HColor.Azure,
        HColor.Lime,

        HColor.Maroon,
        HColor.Lavender,
        HColor.Coral,
        HColor.Magenta,

        HColor.Navy,
        HColor.SkyBlue,
        HColor.Apricot,
        HColor.BabyBlue
    )

)

private val colorGroups = listOf(
   rgbGroup, cmykGroup, otherColorGroups, crayonColorGroups, medalColorGroups
)

@Composable
fun HDumpColor(){
    Column(modifier = Modifier.fillMaxWidth()) {
        colorGroups.forEach { colorGroup ->
            ColorGroupBox(colorGroup)
        }
    }
}

@Composable
private  fun ColorGroupBox(colorGroup: ColorGroup){
    HLabel(colorGroup.name)
    colorGroup.colors.forEach { hColor ->
        ColorBox(hColor)
    }
    Spacer(modifier = Modifier.height(32.dp))
}



@Composable
private fun ColorBox(hColor: HColor){
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp))  {
        Box(modifier = Modifier.fillMaxWidth(0.5f).height(48.dp).background(hColor.color))
        Spacer(modifier = Modifier.width(16.dp))
        HLabel(hColor.name)
    }
}