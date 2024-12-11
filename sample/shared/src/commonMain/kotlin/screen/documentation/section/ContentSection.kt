package screen.documentation.section

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.HComponentName
import org.koin.compose.viewmodel.koinViewModel
import screen.documentation.DocumentationViewModel
import screen.documentation.composable.started.StartedContent
import screen.documentation.composable.theme.ThemeContent

@Composable
fun ContentSection(){

    LazyColumn {
        item { Content() }
    }
}

@Composable
private fun Content(viewModel: DocumentationViewModel = koinViewModel()){
    val uiState = viewModel.uiState.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
            .border(width = 1.dp, shape = MaterialTheme.shapes.large, color = MaterialTheme.colorScheme.onBackground)
            .padding(32.dp)
    ) {
        when(uiState.value.component){
            HComponentName.GetStarted -> StartedContent()
            HComponentName.Theme -> ThemeContent()
            else -> {}
        }


    }
}

