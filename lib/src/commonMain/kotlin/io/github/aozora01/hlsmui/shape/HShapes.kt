package io.github.aozora01.hlsmui.shape

import androidx.compose.material3.Shapes
import io.github.aozora01.hlsmui.shape.shapes.cutCornerShapes
import io.github.aozora01.hlsmui.shape.shapes.defaultShapes
import io.github.aozora01.hlsmui.shape.shapes.extremeRoundedShapes
import io.github.aozora01.hlsmui.shape.shapes.noRoundedShapes
import io.github.aozora01.hlsmui.shape.shapes.roundedShapes
import io.github.aozora01.hlsmui.shape.shapes.slightRoundedShapes
import io.github.aozora01.hlsmui.shape.shapes.smoothRoundedShapes

class HShapes(
    val name: String,
    val shapes: Shapes

) {
    companion object{
        val Default = HShapes("Default", defaultShapes)
        val Rounded = HShapes("Rounded", roundedShapes)
        val CutCorner = HShapes("Cut Corner", cutCornerShapes)
        val SmoothRounded = HShapes("Smooth Rounded", smoothRoundedShapes)
        val NoRounded = HShapes("No Rounded", noRoundedShapes)
        val SlightRounded = HShapes("Slight Rounded", slightRoundedShapes)
        val ExtremeRounded = HShapes("Extreme Rounded", extremeRoundedShapes)

        val All = listOf(
            Default,
            Rounded,
            CutCorner,
            SmoothRounded,
            NoRounded,
            SlightRounded,
            ExtremeRounded
        )
    }


}