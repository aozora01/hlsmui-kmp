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
fun FadeOut(
    durationMillis: Int = 1000,
    delayMillis: Int = 0, // Parameter waktu delay
    content: @Composable () -> Unit
) {
    // Animasi alpha dimulai dari 1 (sepenuhnya terlihat)
    val alpha = remember { Animatable(1f) }

    // Animasi fade out
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong()) // Tunggu sesuai waktu delay
        alpha.animateTo(
            targetValue = 0f, // Menuju 0% opacity
            animationSpec = tween(durationMillis = durationMillis)
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer(alpha = alpha.value), // Mengatur alpha berdasarkan animasi
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}