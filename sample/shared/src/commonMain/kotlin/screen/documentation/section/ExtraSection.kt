package screen.documentation.section

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.dump.HDumpColorScheme
import io.github.aozora01.hlsmui.component.dump.HDumpFontWeight
import io.github.aozora01.hlsmui.component.dump.HDumpText
import io.github.aozora01.hlsmui.component.text.HTitle
import org.koin.compose.viewmodel.koinViewModel
import screen.documentation.DocumentationViewModel
import screen.documentation.composable.theme.ThemeExtra

@Composable
fun ExtraSection(viewModel: DocumentationViewModel = koinViewModel()){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item{
            ThemeExtra()
        }


    }
}


