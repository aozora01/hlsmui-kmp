package app.screen.documentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.compose.viewmodel.koinViewModel
import app.screen.documentation.section.ContentSection
import app.screen.documentation.section.ExtraSection
import app.screen.documentation.section.ListSection


@Composable
fun DocumentationScreen(viewModel: DocumentationViewModel = koinViewModel() ) {
    val uiState by viewModel.uiState.collectAsState()

    val modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.background)
//        .clip(MaterialTheme.shapes.large)


    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        // List Section
        Box(modifier = modifier.weight(2f)){
            ListSection()
        }

        // Content Section
        Box(modifier = modifier.weight(6f)){
            ContentSection()
        }

        // Extra Section
        Box(modifier = modifier.weight(5f)){
            ExtraSection()
        }
    }

}




