package io.github.aozora01.hlsmui.ui.shape.shapes

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp


// Default shapes as you defined
internal val defaultShapes = Shapes()

// Variants of Shapes for different themes
internal val roundedShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp)
)

internal val cutCornerShapes = Shapes(
    small = CutCornerShape(8.dp),
    medium = CutCornerShape(16.dp),
    large = CutCornerShape(24.dp)
)

internal val smoothRoundedShapes = Shapes(
    small = RoundedCornerShape(50.dp),
    medium = RoundedCornerShape(50.dp),
    large = RoundedCornerShape(50.dp)
)

internal val noRoundedShapes = Shapes(
    small = RoundedCornerShape(0.dp),
    medium = RoundedCornerShape(0.dp),
    large = RoundedCornerShape(0.dp)
)

internal val slightRoundedShapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(6.dp)
)

internal val extremeRoundedShapes = Shapes(
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(32.dp),
    large = RoundedCornerShape(48.dp)
)