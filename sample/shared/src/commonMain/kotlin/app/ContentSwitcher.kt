package app


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import io.github.aozora01.hlsmui.component.input.HSwitch
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.SizeCategory

@Composable
fun ContentSwitcher(
    switchOnText: String = "preview",
    switchOffText: String = "code",
    switchOncontent: @Composable () -> Unit,
    switchOffcontent: @Composable () -> Unit,
    ) {
    var isTrue by remember { mutableStateOf(false) }
    HSwitch(
        isChecked = isTrue,
        onCheckedChange = {isTrue = it},
        switchOnLabel = {HLabel(switchOnText, size = SizeCategory.Large)},
        switchOffLabel = {HLabel(switchOffText, size = SizeCategory.Large)},
        modifier = Modifier.scale(0.5f)
    )
    if (isTrue) {
        switchOncontent()
    } else {
        switchOffcontent()
    }

}