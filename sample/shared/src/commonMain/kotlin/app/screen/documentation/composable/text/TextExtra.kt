package app.screen.documentation.composable.text

import androidx.compose.runtime.Composable
import app.screen.documentation.section.ComponentParam
import app.screen.documentation.section.ComponentParamsTable
import app.screen.documentation.section.Extras
import io.github.aozora01.hlsmui.component.text.HLabel

@Composable
fun TextExtra() {
    val componentParams = listOf(
        ComponentParam("text", "String", "", true),
        ComponentParam("size", "SizeCategory", "SizeCategory.Medium", false),
        ComponentParam("color", "Color", "MaterialTheme.colorScheme.onBackground",false),
        ComponentParam("modifier", "Modifier", "Modifier",false),
    )
    Extras("Parameters", true, { ComponentParamsTable(componentParams) })
}
