package io.github.aozora01.hlsmui.component.input

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun <T> HSelect(
    selectedOption: T,
    options: List<T>,
    onOptionSelected: (T) -> Unit,
    modifier: Modifier = Modifier,
    selectedOptionLabel: @Composable (T) -> Unit,
    optionLabel: @Composable (T) -> Unit
){
    var expanded by remember { mutableStateOf(false) } // Mengontrol apakah menu terbuka atau tidak
    Box(modifier = modifier.fillMaxWidth(1f)) {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),


            border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground) // Ubah warna border
        ) {
            selectedOptionLabel(selectedOption)
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
//                .fillMaxWidth()
                .heightIn(max = 400.dp) // Batasi tinggi maksimum
                .wrapContentHeight()
                .background(MaterialTheme.colorScheme.surfaceVariant)
        ) {
            options.forEach { option ->
                DropdownMenuItem(

                    onClick = {
                        onOptionSelected(option) // Memanggil fungsi saat tema dipilih
                        expanded = false // Menutup dropdown
                    },
                    text = {
                        optionLabel(option)
                    }
                )
            }
        }
    }

}
