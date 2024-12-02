package io.github.aozora01.hlsmui.component.container

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.aozora01.hlsmui.theme.HTheme


@Composable
fun HlsmAppTheme(
    theme: HTheme,
    isDark: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(

        colorScheme = if (isDark) theme.colorScheme.dark else theme.colorScheme.light,
        shapes = theme.shape.shapes,
        typography = theme.typography.typography
    ){
        content()
    }
}