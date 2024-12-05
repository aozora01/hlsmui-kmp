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


@Composable
fun ZoomOut(
    durationMillis: Int = 1000,
    delayMillis: Int = 0,
    targetScale: Float = 0.5f, // Skala akhir zoom-out
    content: @Composable () -> Unit
) {
    val scale = remember { Animatable(1f) }

    // Animasi scale
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong())
        scale.animateTo(
            targetValue = targetScale, // Menuju skala yang lebih kecil
            animationSpec = tween(durationMillis = durationMillis)
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(scaleX = scale.value, scaleY = scale.value),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}