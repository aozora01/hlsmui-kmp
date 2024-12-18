package io.github.aozora01.hlsmui.component.container

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import io.github.aozora01.hlsmui.ui.mode.HMode
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.theme.HTheme


@Composable
fun HAppTheme(
    theme: HTheme,
    mode: HMode = HMode.Auto,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme =  when(mode){
            HMode.Auto -> if(isSystemInDarkTheme()) theme.colorScheme.dark else theme.colorScheme.light
            HMode.Light -> theme.colorScheme.light
            HMode.Dark -> theme.colorScheme.dark
        },
        shapes = theme.shapes.shapes,
        typography = theme.getTypography()
    ){
        content()
    }
}

@Composable
fun HAppTheme(
    colorScheme: HColorScheme,
    typography: Typography = Typography(),
    shapes: Shapes = Shapes(),
    mode: HMode = HMode.Auto,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme =  when(mode){
            HMode.Auto -> if(isSystemInDarkTheme()) colorScheme.dark else colorScheme.light
            HMode.Light -> colorScheme.light
            HMode.Dark -> colorScheme.dark
        },
        shapes = shapes,
        typography = typography

    ){
        content()
    }
}
