package app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.container.HAppTheme
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.ui.theme.HTheme
import app.navigation.AppNavigation
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(viewModel: AppViewModel = koinViewModel()) {
    val uiState = viewModel.uiState.collectAsState()
    val theme = HTheme(
        colorScheme = uiState.value.colorScheme,
        font = uiState.value.font,
        shapes = uiState.value.shapes
    )


    HAppTheme(theme = theme, mode = uiState.value.mode){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        )
        {
            Navbar()
            AppNavigation()
        }

    }
}




