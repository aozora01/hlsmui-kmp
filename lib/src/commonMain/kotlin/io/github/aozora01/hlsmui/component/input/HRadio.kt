package io.github.aozora01.hlsmui.component.input

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp


@Composable
fun <T> HRadio(
    selectedOption: T,
    options: List<T>,
    onOptionSelected: (T) -> Unit,
    optionLabel: @Composable (T) -> Unit ,
    modifier: Modifier = Modifier,
    colors: RadioButtonColors = RadioButtonDefaults.colors(
        selectedColor = MaterialTheme.colorScheme.primary,
        unselectedColor = MaterialTheme.colorScheme.onBackground
    )
) {
    Column(modifier = modifier) {
        options.forEach { option ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (option == selectedOption),
                        onClick = { onOptionSelected(option) },
                        role = Role.RadioButton
                    )
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    colors = colors,
                    selected = (option == selectedOption),
                    onClick = null // null recommended for accessibility with screenreaders
                )
                Spacer(Modifier.width(8.dp))
                optionLabel(option)
            }
        }
    }
}