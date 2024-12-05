

package io.github.aozora01.hlsmui.component.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HHeadline(
    text: String = "Headline",
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onBackground,
    size: SizeCategory = SizeCategory.Medium,
)  {
    Text(
        text = text,
        color = color,
        modifier = modifier,
        style = when(size) {
            SizeCategory.Small -> MaterialTheme.typography.headlineSmall
            SizeCategory.Medium -> MaterialTheme.typography.headlineMedium
            SizeCategory.Large -> MaterialTheme.typography.headlineLarge
        }
    )
}