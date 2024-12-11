package io.github.aozora01.hlsmui.component.input

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HSwitch(
    isChecked:Boolean ,
    onCheckedChange:(Boolean)->Unit,
    switchOnLabel: @Composable () -> Unit = {  },
    switchOffLabel: @Composable () -> Unit = {  },
    modifier: Modifier = Modifier,
//    toggleModifier: Modifier = Modifier
) {
    // Remember the switch state


    // UI for the switch
    Row(

        verticalAlignment = Alignment.CenterVertically,
//        modifier = modifier

    ) {
        if(isChecked) switchOnLabel() else switchOffLabel()
        Spacer(modifier = Modifier.width(4.dp))
        Switch(
            modifier = modifier,
            checked = isChecked,
            onCheckedChange = { onCheckedChange(it)},

            colors = SwitchDefaults.colors(

                checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
                checkedThumbColor = MaterialTheme.colorScheme.primary,
                uncheckedThumbColor = MaterialTheme.colorScheme.primary,
                uncheckedTrackColor = MaterialTheme.colorScheme.background,
            )
        )

    }
}

//@Composable
//fun HSwitch(
//    isChecked:Boolean ,
//    onCheckedChange:(Boolean)->Unit,
//    modifier: Modifier = Modifier
//){
//    Switch(
//        modifier = modifier,
//        checked = isChecked,
//        onCheckedChange = { onCheckedChange(it)},
//
//        colors = SwitchDefaults.colors(
//
//            checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
//            checkedThumbColor = MaterialTheme.colorScheme.primary,
//            uncheckedThumbColor = MaterialTheme.colorScheme.primary,
//            uncheckedTrackColor = MaterialTheme.colorScheme.background,
//        )
//    )
//}

