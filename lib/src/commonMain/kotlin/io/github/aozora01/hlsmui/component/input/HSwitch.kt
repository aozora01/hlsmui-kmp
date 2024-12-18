package io.github.aozora01.hlsmui.component.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HSwitch(
    isChecked:Boolean,
    onCheckedChange:(Boolean)->Unit,
    switchOnLabel: @Composable () -> Unit = {  },
    switchOffLabel: @Composable () -> Unit = {  },
    modifier: Modifier = Modifier,
    colors: SwitchColors = SwitchDefaults.colors(

        checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
        checkedThumbColor = MaterialTheme.colorScheme.primary,
        uncheckedThumbColor = MaterialTheme.colorScheme.primary,
        uncheckedTrackColor = MaterialTheme.colorScheme.background,
    )
) {

    Row(

        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        if(isChecked) switchOnLabel() else switchOffLabel()

        Switch(
            modifier = modifier,
            checked = isChecked,
            onCheckedChange = { onCheckedChange(it)},
            colors = colors
        )

    }
}

