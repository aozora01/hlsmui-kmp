package screen.documentation.section

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.AngleDown
import compose.icons.fontawesomeicons.solid.AngleUp
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.SizeCategory
import model.HComponent
import model.HComponentName
import org.koin.compose.viewmodel.koinViewModel
import screen.documentation.DocumentationViewModel

private val components = listOf(
    HComponent(name = HComponentName.GetStarted),
    HComponent(name = HComponentName.Theme),
    HComponent(name = HComponentName.Input, childern = listOf(
        HComponent(name = HComponentName.Switch),
        HComponent(name = HComponentName.Select),
        HComponent(name = HComponentName.Radio),
        HComponent(name = HComponentName.TextField),
        )),

)

@Composable
fun ListSection(viewModel: DocumentationViewModel = koinViewModel()){
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)

    ) {
        item {
            components.forEach {
                if(it.childern.isEmpty()){
                    ComponentItem(it)
                }else{
                    ComponentExpandedItem(it)
                }
            }
            }
    }
}





@Composable
private fun ComponentItem(component: HComponent, viewModel: DocumentationViewModel = koinViewModel()) {
    val uiState = viewModel.uiState.collectAsState()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { viewModel.updateComponent(component.name) }
            .background(if(uiState.value.component == component.name) MaterialTheme.colorScheme.primaryContainer else Color.Transparent)
            .padding(16.dp),



    ){
        HLabel(component.name.toString(), size = SizeCategory.Large)
    }
}

//@Composable
//private fun ComponentItem(component: HComponent, viewModel: DocumentationViewModel = koinViewModel()) {
//    val uiState = viewModel.uiState.collectAsState()
//    TextButton(
//        modifier = Modifier.fillMaxWidth(),
//        colors = ButtonDefaults.textButtonColors(
//            containerColor = if(uiState.value.component == component.name) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.background
//        ),
//        onClick = {viewModel.updateComponent(component.name)}
//
//    ){
//        HLabel(component.name.toString(), size = SizeCategory.Large)
//    }
//}

@Composable
private fun ComponentExpandedItem(component: HComponent) {
    var isShown by remember{mutableStateOf(false)}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{isShown = !isShown}
            .padding(16.dp)

    ){
        Row {
            Icon(
                imageVector = if(isShown) FontAwesomeIcons.Solid.AngleUp else FontAwesomeIcons.Solid.AngleDown,
                contentDescription = "expand",
                modifier = Modifier.height(12.dp),
                tint = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.width(16.dp))
            HLabel(text ="${component.name}", size = SizeCategory.Large)
        }

    }
    if(isShown){
        Column(modifier = Modifier.padding(start = 24.dp)) {
            component.childern.forEach {
                ComponentItem(it)
            }
        }
    }
}


