package app


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.input.HSwitch
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.SizeCategory

@Composable
fun ContentSwitcher(
    switchOnText: String = "preview",
    switchOffText: String = "code",
    switchOnContent: @Composable () -> Unit,
    switchOffContent: @Composable () -> Unit,

    ) {
    var isTrue by remember { mutableStateOf(true) }
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        HSwitch(
            isChecked = isTrue,
            onCheckedChange = {isTrue = it},
            switchOnLabel = {HLabel(switchOnText, size = SizeCategory.Large)},
            switchOffLabel = {HLabel(switchOffText, size = SizeCategory.Large)},
            modifier = Modifier.scale(0.5f)
        )
        if (isTrue) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.small)
                .border(1.dp, MaterialTheme.colorScheme.onBackground, MaterialTheme.shapes.small)
                .padding(16.dp)
            ){
                switchOnContent()
            }
        } else {
            switchOffContent()

        }
    }


}