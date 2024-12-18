package app.screen.documentation.composable.theme

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
import app.screen.documentation.section.ComponentParam
import app.screen.documentation.section.ComponentParamsTable
import app.screen.documentation.section.Extras
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
import io.github.aozora01.hlsmui.component.dump.HDumpShapes
import io.github.aozora01.hlsmui.component.dump.HDumpText
import io.github.aozora01.hlsmui.component.text.HTitle
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun ThemeExtra(viewModel: ThemeViewModel = koinViewModel()){

    val uiState = viewModel.uiState.collectAsState()



    val componentParas = when(uiState.value.isCustom){
        true -> listOf(
            ComponentParam("theme", "HTheme", "-", true,"define theme with constructed HTheme object that contains : color scheme, font, and shape"),
            ComponentParam("mode", "HMode", "HMode.Auto", false,"define mode : Auto, Light, or Dark"),
        )
        false -> listOf(
            ComponentParam("colorScheme", "HColorScheme", "-", true,""),
            ComponentParam("mode", "HMode", "HMode.Auto", false,"define mode : Auto, Light, or Dark"),
            ComponentParam("typography", "Typography", "Typography()", false,""),
            ComponentParam("shapes", "Shapes", "Shapes()", false,""),
        )
    }



    Column(modifier = Modifier.fillMaxWidth()){
        Extras("Parameters", true, { ComponentParamsTable(componentParas)})
        Extras("Color Scheme",false, { HDumpColorScheme() })

        if(uiState.value.isCustom){
            Extras("Typography",false, { HDumpText() })
            Extras("Font Weight",false, { HDumpFontWeight() })
            Extras("Shapes",false, {HDumpShapes()})
        }
    }
}




