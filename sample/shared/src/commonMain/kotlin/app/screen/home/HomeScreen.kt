package app.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.text.HHeadline
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.component.text.SizeCategory
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel = koinViewModel()) {
    val uiState = viewModel.uiState

    Row(
        horizontalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Box(modifier = Modifier.weight(1f)){ LeftSection() }

        Box(modifier = Modifier.weight(1f)){ RightSection(uiState)}
    }

}

@Composable
private fun LeftSection(){

     Box(
         modifier = Modifier
             .fillMaxWidth()
             .aspectRatio(1.5f)
             .clip(MaterialTheme.shapes.large)
             .background(MaterialTheme.colorScheme.primaryContainer)
     )

}

@Composable
private fun RightSection(uiState: HomeUiState){
    Column(
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        HHeadline(uiState.textAcronym, size = SizeCategory.Large)
        HTitle(uiState.textDescription)
    }
}