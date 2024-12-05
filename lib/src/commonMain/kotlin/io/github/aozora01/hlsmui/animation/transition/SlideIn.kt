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
import androidx.compose.ui.unit.IntOffset
import io.github.aozora01.hlsmui.animation.SlideDirection
import kotlinx.coroutines.delay

@Composable
fun SlideIn(
    slideOffset: Float = 300f,
    durationMillis: Int = 1000,
    delayMillis: Int = 0, // Parameter waktu delay
    slideDirection: SlideDirection = SlideDirection.Up,
    content: @Composable () -> Unit
) {

    // Tentukan nilai awal berdasarkan arah
    val initialOffset = when (slideDirection) {
        SlideDirection.Left -> -slideOffset
        SlideDirection.Right -> slideOffset
        SlideDirection.Up -> -slideOffset
        SlideDirection.Down -> slideOffset
    }

    val offsetX = remember { Animatable(if (slideDirection == SlideDirection.Left || slideDirection == SlideDirection.Right) initialOffset else 0f) }
    val offsetY = remember { Animatable(if (slideDirection == SlideDirection.Up || slideDirection == SlideDirection.Down) initialOffset else 0f) }

    // Animasi slide saat halaman ditampilkan
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong()) // Tunggu sesuai waktu delay
        if (slideDirection == SlideDirection.Left || slideDirection == SlideDirection.Right) {
            offsetX.animateTo(
                targetValue = 0f,
                animationSpec = tween(durationMillis = durationMillis)
            )
        } else {
            offsetY.animateTo(
                targetValue = 0f,
                animationSpec = tween(durationMillis = durationMillis)
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset { IntOffset(offsetX.value.toInt(), offsetY.value.toInt()) }, // Offset animasi
        contentAlignment = Alignment.TopCenter
    ) {
        content()
    }
}