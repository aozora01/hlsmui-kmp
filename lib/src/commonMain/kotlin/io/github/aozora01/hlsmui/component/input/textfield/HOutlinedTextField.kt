package io.github.aozora01.hlsmui.component.input.textfield

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Eye
import compose.icons.fontawesomeicons.solid.EyeSlash
import compose.icons.fontawesomeicons.solid.Minus
import compose.icons.fontawesomeicons.solid.Plus
import io.github.aozora01.hlsmui.component.text.HLabel


@Composable
fun HOutlinedTextField(
    value: String = "value",
    onValueChange: (String) -> Unit = {},
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
    inputType: InputType = InputType.Text,
    label: @Composable () -> Unit = {HLabel("Input")},
    placeholder : @Composable () -> Unit = {HLabel("")},
    colors : TextFieldColors = OutlinedTextFieldDefaults.colors()
) {
    var showPassword by remember { mutableStateOf(false) }
    var number by remember { mutableStateOf(value.toIntOrNull() ?: 0) }
    var textValue by remember { mutableStateOf(value) }

    OutlinedTextField(
        placeholder = placeholder,
        colors = colors,
        value = when (inputType) {
            InputType.Number -> number.toString()
            else -> textValue
        },
        onValueChange = { newValue ->
            when (inputType) {
                InputType.Number -> {
                    val newNumber = newValue.toIntOrNull()
                    if (newNumber != null) { // Hanya ubah jika input valid
                        number = newNumber
                        onValueChange(number.toString())
                    }
                }
                else -> {
                    textValue = newValue
                    onValueChange(newValue)
                }
            }
        },
        label = label,
        modifier = modifier,
//        keyboardOptions = KeyboardOptions(keyboardType = inputType),
        visualTransformation = when (inputType) {
            InputType.Password ->
                if (showPassword) VisualTransformation.None else PasswordVisualTransformation()
            else -> VisualTransformation.None
        },
        trailingIcon = {
            when (inputType) {
                InputType.Password -> {
                    IconButton(
                        modifier = Modifier.scale(0.5f),
                        onClick = { showPassword = !showPassword }) {
                        Icon(

                            imageVector = if (showPassword) FontAwesomeIcons.Solid.Eye else FontAwesomeIcons.Solid.EyeSlash,
                            contentDescription = if (showPassword) "Sembunyikan password" else "Tampilkan password"
                        )
                    }
                }
                InputType.Number  -> {
//                    Row(
//                        modifier = Modifier.scale(0.3f),
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.End
//                    ) {
//                        IconButton(
//                            onClick = { number-- }
//                        ) {
//                            Icon(
//                                FontAwesomeIcons.Solid.Minus,
//                                contentDescription = "Kurangi",
//                            )
//                        }
//                        IconButton(
//                            modifier = Modifier.padding(8.dp),
//                            onClick = { number++ }
//                        ) {
//                            Icon(
//                                FontAwesomeIcons.Solid.Plus,
//                                contentDescription = "Tambah",
//                            )
//                        }
//
//                    }
                }
                else -> null
            }
        }
    )
}