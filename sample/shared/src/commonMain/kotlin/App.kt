import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import io.github.aozora01.hlsmui.component.container.HAppTheme
import io.github.aozora01.hlsmui.component.dump.HTextFieldDump
import io.github.aozora01.hlsmui.component.input.textfield.HTextField
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.mode.SchemeMode
import io.github.aozora01.hlsmui.scheme.HColorScheme
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {

    HAppTheme(colorScheme = HColorScheme.JakartaBus, mode = SchemeMode.Dark){
        LazyColumn(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)){
            item {
                HTextFieldDump()
            }
        }


    }
}



expect fun getPlatformName(): String
