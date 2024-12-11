package io.github.aozora01.hlsmui.animation.anim

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale

import io.github.aozora01.hlsmui.animation.AnimationTrigger

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Zoom(
    scale:Float = 2f,
    durationMillis: Long = 5000L,

    trigger: AnimationTrigger = AnimationTrigger.Hover,
    content : @Composable () -> Unit
){
    var currentScale by remember { mutableStateOf(1f) }
//    val animationModifier = when(trigger){
//        AnimationTrigger.Hover -> {
//            Modifier
//                .fillMaxSize()
//                .clickable{
//                    actualScale.value = scale
//                }
//
//                .scale(actualScale.value)
//        }
//        else -> Modifier
//    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable{
                currentScale = 5f
            }

            .scale(currentScale),
        contentAlignment = Alignment.Center
    ){
        content()
    }
}




