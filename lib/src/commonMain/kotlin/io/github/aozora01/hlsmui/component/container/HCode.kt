package io.github.aozora01.hlsmui.component.container

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Copy
import io.github.aozora01.hlsmui.component.text.HBody
import io.github.aozora01.hlsmui.component.text.SizeCategory
import io.github.aozora01.hlsmui.copyTextToClipBoard


@Composable
fun HCode(
    code: String,
    language: String = "kotlin",
//    backgroundColor: Color = MaterialTheme.colorScheme.surfaceVariant,
//    borderColor: Color = MaterialTheme.colorScheme.onBackground,
//    codeColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
) {
    val lines = code.lines()
    Box {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .border(
                    width = 1.dp,
                    shape = MaterialTheme.shapes.medium,
                    color = MaterialTheme.colorScheme.onBackground
                ),
//                .padding(top = 16.dp, bottom = 32.dp, start = 32.dp, end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer)){
                TopSection(language, code)
                HorizontalDivider(color = MaterialTheme.colorScheme.onBackground, thickness = 1.dp)
            }

            Column(
                modifier = Modifier.padding(top = 8.dp, bottom = 32.dp, start =32.dp, end = 32.dp),
            ){
                lines.forEachIndexed { index, line ->
                    CodeLine(index + 1, line)
                }
            }

        }
    }
}

@Composable
fun TopSection(language: String, code: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
//            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(top = 16.dp, bottom = 16.dp, start =32.dp, end = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = language,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace)

        IconButton(
            modifier = Modifier.height(16.dp),
            onClick = {
                copyTextToClipBoard(code)
            }
        ) {
            Icon(
                imageVector = FontAwesomeIcons.Solid.Copy,
                contentDescription = "code",
                tint = MaterialTheme.colorScheme.onBackground,
            )
        }
    }

}

@Composable
fun CodeLine(lineNumber: Int, code: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "$lineNumber",
            color = Color.Gray,
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.width(30.dp)
        )

        Text(
            text = code,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace)
//        HBody(code, size = SizeCategory.Large, color = codeColor)
    }
}