package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import io.github.aozora01.hlsmui.component.input.textfield.HOutlinedTextField
import io.github.aozora01.hlsmui.component.input.textfield.HTextField
import io.github.aozora01.hlsmui.component.input.textfield.InputType


@Composable
fun HTextFieldDump() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        HTextField(value = "")
        HTextField(inputType = InputType.Number)
        HTextField(inputType = InputType.Password)

        HOutlinedTextField()
        HOutlinedTextField(inputType = InputType.Number)
        HOutlinedTextField(inputType = InputType.Password)
    }
}