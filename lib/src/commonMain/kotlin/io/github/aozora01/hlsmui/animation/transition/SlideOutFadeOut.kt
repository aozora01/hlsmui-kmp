package io.github.aozora01.hlsmui.animation.transition

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.IntOffset
import io.github.aozora01.hlsmui.animation.SlideDirection
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SlideOutFadeOut(
    slideOffset: Float = 300f,
    durationMillis: Int = 1000,
    delayMillis: Int = 0,
    slideDirection: SlideDirection = SlideDirection.Down,
    content: @Composable () -> Unit
) {
    // Tentukan nilai akhir offset berdasarkan arah slide
    val targetOffset = when (slideDirection) {
        SlideDirection.Left -> -slideOffset
        SlideDirection.Right -> slideOffset
        SlideDirection.Up -> -slideOffset
        SlideDirection.Down -> slideOffset
    }

    // Animasi offset dan alpha
    val offsetX = remember { Animatable(0f) }
    val offsetY = remember { Animatable(0f) }
    val alpha = remember { Animatable(1f) }

    // Animasi keluar
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong()) // Tunggu sesuai waktu delay
        launch {
            if (slideDirection == SlideDirection.Left || slideDirection == SlideDirection.Right) {
                offsetX.animateTo(targetOffset, animationSpec = tween(durationMillis))
            } else {
                offsetY.animateTo(targetOffset, animationSpec = tween(durationMillis))
            }
        }
        launch {
            alpha.animateTo(0f, animationSpec = tween(durationMillis))
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset { IntOffset(offsetX.value.toInt(), offsetY.value.toInt()) }
            .graphicsLayer(alpha = alpha.value),
        contentAlignment = Alignment.TopCenter
    ) {
        content()
    }
}
