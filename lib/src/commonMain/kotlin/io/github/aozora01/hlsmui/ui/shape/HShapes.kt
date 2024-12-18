package io.github.aozora01.hlsmui.ui.shape

import androidx.compose.material3.Shapes
import io.github.aozora01.hlsmui.ui.shape.shapes.*

enum class HShapes(val shapes: Shapes) {
    Default(defaultShapes),
    Rounded(roundedShapes),
    CutCorner(cutCornerShapes),
    SmoothRounded(smoothRoundedShapes),
    NoRounded(noRoundedShapes),
    SlightRounded(slightRoundedShapes),
    ExtremeRounded(extremeRoundedShapes);
}