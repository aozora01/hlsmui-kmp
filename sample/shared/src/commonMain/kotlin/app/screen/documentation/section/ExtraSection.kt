package app.screen.documentation.section

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aozora01.hlsmui.component.dump.HDumpColorScheme
import io.github.aozora01.hlsmui.component.dump.HDumpFontWeight
import io.github.aozora01.hlsmui.component.dump.HDumpText
import io.github.aozora01.hlsmui.component.text.HTitle
import org.koin.compose.viewmodel.koinViewModel
import app.screen.documentation.DocumentationViewModel
import app.screen.documentation.composable.text.InputExtra
import app.screen.documentation.composable.text.TextExtra
import app.screen.documentation.composable.theme.ThemeContent
import app.screen.documentation.composable.theme.ThemeExtra
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.AngleDown
import compose.icons.fontawesomeicons.solid.AngleUp
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.SizeCategory
import model.HComponentName

@Composable
fun ExtraSection(viewModel: DocumentationViewModel = koinViewModel()){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
//            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item{
            val uiState = viewModel.uiState.collectAsState()
            when(uiState.value.component){
                HComponentName.Theme -> ThemeExtra()

                HComponentName.Label -> TextExtra()
                HComponentName.Body -> TextExtra()
                HComponentName.Title -> TextExtra()
                HComponentName.Headline -> TextExtra()

                HComponentName.Switch -> InputExtra(HComponentName.Switch)
                HComponentName.Select -> InputExtra(HComponentName.Select)
                HComponentName.Radio -> InputExtra(HComponentName.Radio)
                HComponentName.TextField -> InputExtra(HComponentName.TextField)
                HComponentName.OutlinedTextField -> InputExtra(HComponentName.OutlinedTextField)



                else -> {}
            }
        }


    }
}



data class ComponentParam(
    val name: String = "test",
    val type: String = "String",
    val default: String = "test",
    val required: Boolean = false,
    val description: String = "lorem ipsum"
)

@Composable
fun ComponentParamsTable(componentParams: List<ComponentParam>){

    val cellModifier = Modifier
//        .border(1.dp, MaterialTheme.colorScheme.onBackground)
        .padding(16.dp)
    val rowModifier = Modifier
//        .border(1.dp, MaterialTheme.colorScheme.onBackground)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.onBackground)

    ) {
        val weights = listOf(2f,2f,2f,1.5f,2f)

        // header
        Row(
            modifier = rowModifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .border(1.dp, MaterialTheme.colorScheme.onBackground)

        ) {
            val titles = listOf("Param", "Type", "Default", "Required",  "Description")

            titles.forEachIndexed {index, it ->
               Box(
                   modifier = cellModifier.weight(weights.get(index)),
                   contentAlignment = Alignment.Center
               ){
                   HLabel(text = it, size = SizeCategory.Medium)
               }
            }

        }

        // content
        componentParams.forEach {
            Row(
                modifier = rowModifier.background(MaterialTheme.colorScheme.surfaceVariant)
            ) {
                val titles = listOf(
                    it.name,
                    it.type,
                    it.default,
                    if(it.required) "✅" else "❌",
                    it.description)
                titles.forEachIndexed {index, it ->
                    Box(
                        modifier = cellModifier.weight(weights.get(index)),
                        contentAlignment = Alignment.Center
                    ){
                        HLabel(text = it)
                    }
                }

            }
        }


    }
}




@Composable
fun Extras(
    text:String,
    isShow: Boolean = false,
    content: @Composable () -> Unit,


){
    var isShown by remember{ mutableStateOf(isShow) }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
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


}


