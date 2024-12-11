package io.github.aozora01.hlsmui.component.container

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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


@Composable
fun HCode(
    code: String,
    backgroundColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    borderColor: Color = MaterialTheme.colorScheme.onBackground,
    codeColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
) {
    val lines = code.lines()
    Box {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .background(backgroundColor)
                .border(
                    width = 1.dp,
                    shape = MaterialTheme.shapes.medium,
                    color = borderColor
                )
                .padding(top = 16.dp, bottom = 32.dp, start = 32.dp, end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    modifier = Modifier.scale(0.5f),
                    onClick = {
                        // copyToClipboard(code)
                    }
                ) {
                    Icon(
                        imageVector = FontAwesomeIcons.Solid.Copy,
                        contentDescription = "code",
                        tint = codeColor
                    )
                }
            }

            lines.forEachIndexed { index, line ->
                CodeLine(index + 1, line, codeColor)
            }
        }
    }
}

@Composable
fun CodeLine(lineNumber: Int, code: String, codeColor: Color) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(
            text = "$lineNumber",
            color = Color.Gray,
            fontSize = 14.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.width(30.dp)
        )
        HBody(code, size = SizeCategory.Large, color = codeColor)
    }
}