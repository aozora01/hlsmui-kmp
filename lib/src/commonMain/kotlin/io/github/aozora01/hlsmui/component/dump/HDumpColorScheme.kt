package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


private class BoxProperty(
    val boxColor: Color,
    val textColor: Color,
    val text:String
)
@Composable
fun HDumpColorScheme(){

    var isShow by remember { mutableStateOf(true) }
    val boxProperties = listOf(
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.primary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            text = "primary"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.secondary,
            textColor = MaterialTheme.colorScheme.onSecondary,
            text = "secondary"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.tertiary,
            textColor = MaterialTheme.colorScheme.onTertiary,
            text = "tertiary"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.primaryContainer,
            textColor = MaterialTheme.colorScheme.onPrimaryContainer,
            text = "primary container"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.secondaryContainer,
            textColor = MaterialTheme.colorScheme.onSecondaryContainer,
            text = "secondary container"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.tertiaryContainer,
            textColor = MaterialTheme.colorScheme.onTertiaryContainer,
            text = "tertiary container"
        ),

        BoxProperty(
            boxColor = MaterialTheme.colorScheme.background,
            textColor = MaterialTheme.colorScheme.onBackground,
            text = "background"
        ),

        BoxProperty(
            boxColor = MaterialTheme.colorScheme.surface,
            textColor = MaterialTheme.colorScheme.onSurface,
            text = "surface"
        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceContainer,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface container"
//        ),

        BoxProperty(
            boxColor = MaterialTheme.colorScheme.surfaceVariant,
            textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            text = "surface variant"
        ),



        BoxProperty(
            boxColor = MaterialTheme.colorScheme.error,
            textColor = MaterialTheme.colorScheme.onError,
            text = "error"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.errorContainer,
            textColor = MaterialTheme.colorScheme.onErrorContainer,
            text = "error container"
        ),

        BoxProperty(
            boxColor = MaterialTheme.colorScheme.inversePrimary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            text = "inverse primary"
        ),

        BoxProperty(
            boxColor = MaterialTheme.colorScheme.inverseSurface,
            textColor = MaterialTheme.colorScheme.inverseOnSurface,
            text = "inverse surface"
        ),

//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceDim,
//            textColor = MaterialTheme.colorScheme.onBackground,
//            text = "surface dim"
//        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.surfaceTint,
            textColor = MaterialTheme.colorScheme.onBackground,
            text = "surface tint"
        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceBright,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface bright"
//        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceContainerLowest,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface container lowest"
//        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceContainerLow,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface container low"
//        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceContainerHigh,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface container high"
//        ),
//        BoxProperty(
//            boxColor = MaterialTheme.colorScheme.surfaceContainerHighest,
//            textColor = MaterialTheme.colorScheme.onSurface,
//            text = "surface container highest"
//        ),



        BoxProperty(
            boxColor = MaterialTheme.colorScheme.scrim,
            textColor = MaterialTheme.colorScheme.onBackground,
            text = "scrim"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.outline,
            textColor = MaterialTheme.colorScheme.outlineVariant,
            text = "outline"
        ),
        BoxProperty(
            boxColor = MaterialTheme.colorScheme.outlineVariant,
            textColor = MaterialTheme.colorScheme.outline,
            text = "outline variant"
        ),

        )

    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        boxProperties.forEach {
            BoxTest(boxProperty = it)
        }

    }
}

@Composable
private fun BoxTest(boxProperty: BoxProperty){
    Box(
        modifier = Modifier
//
            .height(120.dp)
            .fillMaxWidth()
            .padding(4.dp)
            .background(boxProperty.boxColor),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = boxProperty.text,
            color = boxProperty.textColor,
            fontSize = MaterialTheme.typography.labelLarge.fontSize,
            fontWeight = FontWeight.ExtraLight
//            fontStyle = FontStyle.Italic
        )
    }
}