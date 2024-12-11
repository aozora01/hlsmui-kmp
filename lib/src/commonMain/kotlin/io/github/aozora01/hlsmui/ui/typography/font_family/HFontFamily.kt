package io.github.aozora01.hlsmui.ui.typography.font_family

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.ResourceFont
import compose_multiplatform_library_template.lib.generated.resources.Res
import compose_multiplatform_library_template.lib.generated.resources.quicksand_regular
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.Resource

object HFontFamily {
    @Composable
    fun QuickSand() = FontFamily(Font(Res.font.quicksand_regular))
}


