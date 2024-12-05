package io.github.aozora01.hlsmui.typography

import androidx.compose.material3.Typography

class HTypography (
    val name: String,
    val typography: Typography
){
    companion object{
        val Default = HTypography("Default", Typography())
        val All = listOf(Default)

    }
}