package app.screen.documentation.composable.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.AppViewModel
import app.ContentSwitcher

import app.screen.documentation.composable.theme.ThemeViewModel
import io.github.aozora01.hlsmui.component.HSpacer
import io.github.aozora01.hlsmui.component.container.HCode
import io.github.aozora01.hlsmui.component.text.HBody
import io.github.aozora01.hlsmui.component.text.HHeadline
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.component.text.SizeCategory
import model.HComponent
import model.HComponentName
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TextContent(componentName:HComponentName){
    Column(
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        HTitle("text/ H${componentName.name}", size = SizeCategory.Large)


        Code(componentName)

    }
}


@Composable
private fun Code(componentName: HComponentName){

    val sampleText = "hello world!"
    SizeCategory.entries.forEach {
       HTitle("${it.name} ${componentName.name}")
        ContentSwitcher(
            switchOnText = "preview",
            switchOffText = "code",
            switchOnContent = { when(componentName){
                HComponentName.Label -> HLabel(sampleText, size = it)
                HComponentName.Body -> HBody(sampleText, size = it)
                HComponentName.Title -> HTitle(sampleText, size = it)
                HComponentName.Headline -> HHeadline(sampleText, size = it)
                else -> {Text("asdf")}
            } },
            switchOffContent = { HCode("""
                H${componentName.name}(text="${sampleText}", size = SizeCategory.${it.name})
            """.trimIndent()) }
        )
   }
}