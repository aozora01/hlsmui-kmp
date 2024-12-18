package app.screen.documentation.composable.text

import androidx.compose.runtime.Composable
import app.screen.documentation.section.ComponentParam
import app.screen.documentation.section.ComponentParamsTable
import app.screen.documentation.section.Extras
import model.HComponentName

@Composable
fun InputExtra(component:HComponentName) {
    val componentParams = when(component){
        HComponentName.Select -> {
            listOf(
                ComponentParam("selectedOption", "T", "-", true),
                ComponentParam("options", "List<T>", "-", true),
                ComponentParam("onOptionSelected", "(T) -> Unit", "-", true),
                ComponentParam("selectedOptionLabel", "@Composable (T) -> Unit", "-", true),
                ComponentParam("optionLabel", "@Composable (T) -> Unit", "-", true),
                ComponentParam("modifier", "Modifier", "Modifier", false),
                ComponentParam("colors", "SelectColors", "SelectDefaults.colors()", false)
            )
        }
        HComponentName.Switch ->{
            listOf(
                ComponentParam("isChecked", "Boolean", "-", true),
                ComponentParam("onCheckedChange", "(Boolean) -> Unit", "-", true),
                ComponentParam("switchOnLabel", "@Composable () -> Unit", "{}", false),
                ComponentParam("switchOffLabel", "@Composable () -> Unit", "{}", false),
                ComponentParam("modifier", "Modifier", "Modifier", false),
                ComponentParam("colors", "SwitchColors", "SwitchDefaults.colors()", false)
            )
        }

        HComponentName.Radio -> {
            listOf(
                ComponentParam("selectedOption", "T", "-", true),
                ComponentParam("options", "List<T>", "-", true),
                ComponentParam("onOptionSelected", "(T) -> Unit", "-", true),
                ComponentParam("optionLabel", "@Composable (T) -> Unit", "-", true),
                ComponentParam("modifier", "Modifier", "Modifier", false),
                ComponentParam("colors", "RadioButtonColors", "RadioButtonDefaults.colors()", false)
            )
        }

        HComponentName.TextField -> {
            listOf(
                ComponentParam("value", "String", "value", false),
                ComponentParam("onValueChange", "(String) -> Unit", "{}", false),
                ComponentParam("inputType", "InputType", "InputType.Text", false),
                ComponentParam("label", "@Composable () -> Unit", "{}", false),
                ComponentParam("placeholder", "@Composable () -> Unit", "{}", false),
                ComponentParam("modifier", "Modifier", "Modifier", false),
                ComponentParam("colors", "TextFieldColors", "TextFieldDefaults.colors()", false)
            )

        }
        HComponentName.OutlinedTextField -> {
            listOf(
                ComponentParam("value", "String", "value", false),
                ComponentParam("onValueChange", "(String) -> Unit", "{}", false),
                ComponentParam("inputType", "InputType", "InputType.Text", false),
                ComponentParam("label", "@Composable () -> Unit", "{}", false),
                ComponentParam("placeholder", "@Composable () -> Unit", "{}", false),
                ComponentParam("modifier", "Modifier", "Modifier", false),
                ComponentParam("colors", "TextFieldColors", "OutlinedTextFieldDefaults.colors()", false)
            )

        }

        else -> emptyList()
    }
    Extras("Parameters", true, { ComponentParamsTable(componentParams) })
}
