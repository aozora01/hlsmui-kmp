package screen.documentation.composable.theme


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import app.AppUiState
import app.AppViewModel
import app.ContentSwitcher
import io.github.aozora01.hlsmui.component.HSpacer
import io.github.aozora01.hlsmui.component.container.HCode
import io.github.aozora01.hlsmui.component.input.HSelect
import io.github.aozora01.hlsmui.component.input.HSwitch
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.component.text.SizeCategory
import io.github.aozora01.hlsmui.component.wireframe.HPhoneWireFrame
import io.github.aozora01.hlsmui.ui.mode.HMode
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory
import io.github.aozora01.hlsmui.ui.shape.HShapes
import io.github.aozora01.hlsmui.ui.typography.font.HFont
import org.koin.compose.viewmodel.koinViewModel
import screen.documentation.DocumentationViewModel



@Composable
fun ThemeContent(appViewModel: AppViewModel = koinViewModel(), themeViewModel: ThemeViewModel = koinViewModel()){

    val themeUiState = themeViewModel.uiState.collectAsState()


    Selector()
    HSpacer(32.dp)
    ContentSwitcher(
        switchOnText = "preview",
        switchOffText = "code",
        switchOncontent = { ThemePreview() },
        switchOffcontent = { HCode(appViewModel.getThemeCode(themeUiState.value.isCustom)) }
    )
}




@Composable
private fun ThemePreview(){
    Row(
        horizontalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Box(modifier = Modifier.weight(1f)){  HPhoneWireFrame()}

        Box(modifier = Modifier.weight(1f)){  HPhoneWireFrame()}
    }
}

@Composable
private fun Selector(viewModel: ThemeViewModel = koinViewModel()){

    val uiState = viewModel.uiState.collectAsState()

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        HTitle("themes", size = SizeCategory.Large,)

        HSwitch(
            isChecked = uiState.value.isCustom,
            onCheckedChange = { viewModel.updateIsCustom(it) },
            switchOnLabel = { HLabel("Custom Theme") },
            switchOffLabel = { HLabel("Color Scheme") },
            modifier = Modifier.scale(0.5f)

        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(32.dp)){
            Box(modifier = Modifier.weight(1f)){ ColorSchemeCategorySelector() }
            Box(modifier = Modifier.weight(1f)){ ColorSchemeSelector() }
            Box(modifier = Modifier.weight(1f)){ ModeSelector()  }
        }
        if(uiState.value.isCustom){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(32.dp)){
                Box(modifier = Modifier.weight(1f)){ FontSelector() }
                Box(modifier = Modifier.weight(1f)){ ShapeSelector()  }
                Spacer(modifier = Modifier.weight(1f))


            }
        }

    }


}

@Composable
private fun ColorSchemeSelector(viewModel: AppViewModel = koinViewModel()){
    Column {
        HLabel("Color Scheme")
        Spacer(modifier = Modifier.height(8.dp))
        val uiState = viewModel.uiState.collectAsState()
        val colorSchemeList = if(uiState.value.colorSchemeCategory == HColorSchemeCategory.All) {
            HColorScheme.All
        } else {
            HColorScheme.All.filter { it.categories.contains(uiState.value.colorSchemeCategory) }
        }

        HSelect(
            selectedOption = uiState.value.colorScheme,
            options = colorSchemeList,
            onOptionSelected = {viewModel.updateColorScheme(it)},
            selectedOptionLabel = {HLabel(it.name)},
            optionLabel = {HLabel(it.name)}
        )
    }
}

@Composable
private fun ColorSchemeCategorySelector(viewModel: AppViewModel = koinViewModel()){
    Column {
        HLabel("Category : ")
        Spacer(modifier = Modifier.height(8.dp))
        val uiState = viewModel.uiState.collectAsState()
        HSelect(
            selectedOption = uiState.value.colorSchemeCategory,
            options = HColorSchemeCategory.entries,
            onOptionSelected = {viewModel.updateColorSchemeCategory(it)},
            selectedOptionLabel = {HLabel(it.name)},
            optionLabel = {HLabel(it.name)}
        )
    }
}

@Composable
private fun FontSelector(viewModel: AppViewModel = koinViewModel()){
    Column {
        HLabel("Font :")
        Spacer(modifier = Modifier.height(8.dp))
        val uiState = viewModel.uiState.collectAsState()
        HSelect(
            selectedOption = uiState.value.font,
            options = HFont.entries,
            onOptionSelected = {viewModel.updateFont(it)},
            selectedOptionLabel = {HLabel(it.name)},
            optionLabel = {HLabel(it.name)}
        )
    }
}

@Composable
private fun ShapeSelector(viewModel: AppViewModel = koinViewModel()){
    Column {
        HLabel("Shape :")
        Spacer(modifier = Modifier.height(8.dp))
        val uiState = viewModel.uiState.collectAsState()
        HSelect(
            selectedOption = uiState.value.shapes,
            options = HShapes.All,
            onOptionSelected = {viewModel.updateShapes(it)},
            selectedOptionLabel = {HLabel(it.name)},
            optionLabel = {HLabel(it.name)}
        )
    }
}

@Composable
private fun ModeSelector(viewModel: AppViewModel = koinViewModel()){
    Column {
        HLabel("Mode :")
        Spacer(modifier = Modifier.height(8.dp))
        val uiState = viewModel.uiState.collectAsState()
        HSelect(
            selectedOption = uiState.value.mode,
            options = HMode.entries,
            onOptionSelected = {viewModel.updateMode(it)},
            selectedOptionLabel = {HLabel(it.name)},
            optionLabel = {HLabel(it.name)}
        )
    }
}