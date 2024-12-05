package io.github.aozora01.hlsmui.component.container

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.aozora01.hlsmui.mode.SchemeMode
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.theme.HTheme


@Composable
fun HAppTheme(
    theme: HTheme = HTheme.Default,
    mode:SchemeMode = SchemeMode.Auto,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme =  when(mode){
            SchemeMode.Auto -> if(isSystemInDarkTheme()) theme.colorScheme.dark else theme.colorScheme.light
            SchemeMode.Light -> theme.colorScheme.light
            SchemeMode.Dark -> theme.colorScheme.dark
        },
        shapes = theme.shapes.shapes,
        typography = theme.typography.typography
    ){
        content()
    }
}

@Composable
fun HAppTheme(
    colorScheme:HColorScheme = HColorScheme.Default,
    mode:SchemeMode = SchemeMode.Auto,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme =  when(mode){
            SchemeMode.Auto -> if(isSystemInDarkTheme()) colorScheme.dark else colorScheme.light
            SchemeMode.Light -> colorScheme.light
            SchemeMode.Dark -> colorScheme.dark
        }

    ){
        content()
    }
}
