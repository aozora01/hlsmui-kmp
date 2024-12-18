package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.HSpacer
import io.github.aozora01.hlsmui.component.text.HLabel


private class ShapeProperty(
    val shape: Shape,
    val text:String
)
@Composable
fun HDumpShapes(){

    val shapesProperties = listOf(
        ShapeProperty(
            shape = MaterialTheme.shapes.extraSmall,
            text = "Extra Small"
        ),
        ShapeProperty(
            shape = MaterialTheme.shapes.small,
            text = "Small"
        ),
        ShapeProperty(
            shape = MaterialTheme.shapes.medium,
            text = "Medium"
        ),
        ShapeProperty(
            shape = MaterialTheme.shapes.large,
            text = "Large"
        ),
        ShapeProperty(
            shape = MaterialTheme.shapes.extraLarge,
            text = "Extra Large"
        )
    )


    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        shapesProperties.forEach {
            BoxTest(it)
        }

    }
}

@Composable
private fun BoxTest(shapeProperty: ShapeProperty){
    Column (
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .aspectRatio(1f)
            .clip(shapeProperty.shape)
            .background(MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        HLabel(shapeProperty.text, color = MaterialTheme.colorScheme.onPrimary)
        HSpacer(16.dp)
        HLabel(
            "(MaterialTheme.shapes.${formatString(shapeProperty.text)})",
            color = MaterialTheme.colorScheme.onPrimary)
    }
}

private fun formatString(input: String): String {
    val noSpaces = input.replace(" ", "")
    return noSpaces.replaceFirstChar { it.lowercase() }
}