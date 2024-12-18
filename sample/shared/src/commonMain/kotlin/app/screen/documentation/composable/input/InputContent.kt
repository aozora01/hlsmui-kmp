package app.screen.documentation.composable.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.AppViewModel
import app.ContentSwitcher

import app.screen.documentation.composable.theme.ThemeViewModel
import io.github.aozora01.hlsmui.component.HSpacer
import io.github.aozora01.hlsmui.component.container.HCode
import io.github.aozora01.hlsmui.component.input.HRadio
import io.github.aozora01.hlsmui.component.input.HSelect
import io.github.aozora01.hlsmui.component.input.HSwitch
import io.github.aozora01.hlsmui.component.input.textfield.HOutlinedTextField
import io.github.aozora01.hlsmui.component.input.textfield.HTextField
import io.github.aozora01.hlsmui.component.text.HBody
import io.github.aozora01.hlsmui.component.text.HHeadline
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.component.text.SizeCategory
import model.HComponent
import model.HComponentName
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun InputContent(componentName:HComponentName){
    Column(
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        HTitle("input/ H${componentName.name}", size = SizeCategory.Large)
        Code(componentName)

    }
}


@Composable
private fun Code(componentName: HComponentName){

    val list = listOf("one", "two", "three", "four", "five")

    HTitle(" ${componentName.name}")
    ContentSwitcher(
        switchOnText = "preview",
        switchOffText = "code",
        switchOnContent = { when(componentName){
            HComponentName.Select -> {
                var selectedOption by remember { mutableStateOf(list[0]) }
                HSelect(
                    selectedOption = selectedOption,
                    options = list,
                    onOptionSelected = {selectedOption = it},
                    selectedOptionLabel = { HLabel(it) },
                    optionLabel = { HLabel(it) }
                )
            }
            HComponentName.Switch -> {
                var checked by remember { mutableStateOf(true) }
                HSwitch(
                    isChecked = checked,
                    onCheckedChange = {checked = it},
                    switchOnLabel = {HLabel("on")},
                    switchOffLabel = {HLabel("off")}
                )
            }
            HComponentName.Radio -> {
                var selectedOption by remember { mutableStateOf(list[0]) }
                HRadio(
                    selectedOption = selectedOption,
                    options = list,
                    onOptionSelected = {selectedOption = it},
                    optionLabel = {HLabel(it)}
                )
            }
            HComponentName.TextField -> {
                HTextField(value = "hello world")
            }
            HComponentName.OutlinedTextField -> {
                HOutlinedTextField(value = "hello world")
            }
            else -> {}
        } },
        switchOffContent = {
            when(componentName){
                HComponentName.Select -> {
                    HCode(
                        """
                        val list = listOf("one", "two", "three", "four", "five")
                        var selectedOption by remember { mutableStateOf(list[0]) }
                        HSelect(
                            selectedOption = selectedOption,
                            options = list,
                            onOptionSelected = {selectedOption = it},
                            selectedOptionLabel = { HLabel(it) },
                            optionLabel = { HLabel(it) }
                        )
                        """.trimIndent()
                    )
                }
                HComponentName.Switch -> {
                    HCode(
                        """
                            var checked by remember { mutableStateOf(true) }
                            HSwitch(
                                isChecked = checked,
                                onCheckedChange = {checked = it},
                                switchOnLabel = {HLabel("on")},
                                switchOffLabel = {HLabel("off")}
                            )
                        """.trimIndent()
                    )
                }
                HComponentName.Radio -> {
                    HCode(
                        """
                        val list = listOf("one", "two", "three", "four", "five")
                        var selectedOption by remember { mutableStateOf(list[0]) }
                        HRadio(
                            selectedOption = selectedOption,
                            options = list,
                            onOptionSelected = {selectedOption = it},
                            optionLabel = {HLabel(it)}
                        )
                        """.trimIndent()
                    )
                }
                HComponentName.TextField -> {
                    HCode(
                        """
                        HTextField(value = "hello world")
                        """.trimIndent()
                    )
                }
                HComponentName.OutlinedTextField -> {
                    HCode(
                        """
                        HOutlinedTextField(value = "hello world")
                        """.trimIndent()
                    )
                }
                else -> {}
            }
        }
    )
}