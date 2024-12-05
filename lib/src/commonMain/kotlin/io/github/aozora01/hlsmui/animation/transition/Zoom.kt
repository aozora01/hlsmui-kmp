package io.github.aozora01.hlsmui.animation.transition

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ZoomAnimation(
    scale: Float,
    content: @Composable () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        content
    }
}

