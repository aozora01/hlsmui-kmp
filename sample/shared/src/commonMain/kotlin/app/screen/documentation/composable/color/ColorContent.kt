package app.screen.documentation.composable.color

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Search
import io.github.aozora01.hlsmui.component.input.textfield.HOutlinedTextField
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.ui.color.HColor

@Composable
fun ColorContent(){
    var colors by remember{mutableStateOf(HColor.entries)}
    var keyword by remember{mutableStateOf("")}
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
       HOutlinedTextField(
           value = keyword,
           onValueChange = {
               keyword = it
           },
           label = {
               HLabel("Search")
//               Icon(
//                   modifier = Modifier.height(16.dp),
//                   imageVector = FontAwesomeIcons.Solid.Search,
//                   contentDescription = null
//               )
           }
       )

        val filteredColors = colors.filter { it.name.contains(keyword, ignoreCase = true) }
        filteredColors.forEach {
            ColorBox(it)
        }
    }
}



@Composable
private fun ColorBox(color: HColor){
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            HLabel(color.name)
            HLabel("HColor.${color.name}.value")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(MaterialTheme.shapes.small)
                .background(color.color)
        )
    }
}