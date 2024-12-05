package io.github.aozora01.hlsmui.animation.transition

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ZoomInFadeIn(
    durationMillis: Int = 1000,
    delayMillis: Int = 0,
    initialScale: Float = 0.5f, // Skala awal zoom-in
    content: @Composable () -> Unit
) {
    val scale = remember { Animatable(initialScale) }
    val alpha = remember { Animatable(0f) }

    // Animasi scale dan alpha
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong())
        launch {
            scale.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = durationMillis)
            )
        }
        launch {
            alpha.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = durationMillis)
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(
                scaleX = scale.value,
                scaleY = scale.value,
                alpha = alpha.value
            ),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}