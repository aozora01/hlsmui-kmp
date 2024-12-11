package screen.documentation.composable.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.AngleDown
import compose.icons.fontawesomeicons.solid.AngleUp
import compose.icons.fontawesomeicons.solid.ArrowDown
import compose.icons.fontawesomeicons.solid.ArrowUp
import compose.icons.fontawesomeicons.solid.Compress
import compose.icons.fontawesomeicons.solid.Expand
import io.github.aozora01.hlsmui.component.dump.HDumpColorScheme
import io.github.aozora01.hlsmui.component.dump.HDumpFontWeight
import io.github.aozora01.hlsmui.component.dump.HDumpText
import io.github.aozora01.hlsmui.component.text.HTitle
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun ThemeExtra(viewModel: ThemeViewModel = koinViewModel()){

    val uiState = viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxWidth()){
        Spacer(modifier = Modifier.height(16.dp))
        Dumper("Color Scheme", { HDumpColorScheme() })
        if(uiState.value.isCustom){
            Dumper("Typography", { HDumpText() })
            Dumper("Font Weight", { HDumpFontWeight() })
            Dumper("Shapes", {})
        }
    }
}


@Composable
private fun Dumper(
    text:String,
    content: @Composable () -> Unit
){
    var isShown by remember{mutableStateOf(false)}

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { isShown = !isShown }
    ) {
        Icon(
            imageVector = if(isShown) FontAwesomeIcons.Solid.AngleUp else FontAwesomeIcons.Solid.AngleDown,
            contentDescription = "expand",
            modifier = Modifier.height(16.dp),
            tint = MaterialTheme.colorScheme.onBackground
        )

        HTitle("${if(isShown) "" else ""}   $text")
    }

    Spacer(modifier = Modifier.height(16.dp))
    if(isShown){
        content()
        Spacer(modifier = Modifier.height(32.dp))
    }

}
