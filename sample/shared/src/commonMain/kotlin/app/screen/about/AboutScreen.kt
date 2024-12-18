package app.screen.about

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.text.HTitle
import openUrl

@Composable
fun AboutScreen() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        HTitle("check github",
            modifier = Modifier.clickable {
                openUrl("https://github.com/aozora01/hlsmui")
            })
    }

}