package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import io.github.aozora01.hlsmui.component.text.HBody
import io.github.aozora01.hlsmui.component.text.HDisplay
import io.github.aozora01.hlsmui.component.text.HHeadline
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.SizeCategory
import io.github.aozora01.hlsmui.component.text.HTitle

private class TextProperty(
    val type : String,
    val size : String,
    val style : TextStyle
)

//private val textProperties = listOf(
//
//    TextProperty(
//        type = "Headline",
//        size = "Large",
//        style = MaterialTheme.typography.headlineLarge
//    ),
//    TextProperty(
//        type = "Headline",
//        size = "Medium",
//        style = MaterialTheme.typography.headlineMedium
//    ),
//    TextProperty(
//        type = "Headline",
//        size = "Small",
//        style = MaterialTheme.typography.headlineSmall
//    ),
//    TextProperty(
//        type = "Title",
//        size = "Large",
//        style = MaterialTheme.typography.titleLarge
//    ),
//    TextProperty(
//        type = "Title",
//        size = "Medium",
//        style = MaterialTheme.typography.titleMedium
//    ),
//    TextProperty(
//        type = "Title",
//        size = "Small",
//        style = MaterialTheme.typography.titleSmall
//    ),
//    TextProperty(
//        type = "Label",
//        size = "Large",
//        style = MaterialTheme.typography.labelLarge
//    ),
//    TextProperty(
//        type = "Label",
//        size = "Medium",
//        style = MaterialTheme.typography.labelMedium
//    ),
//    TextProperty(
//        type = "Label",
//        size = "Small",
//        style = MaterialTheme.typography.labelSmall
//    ),
//
//
//
//    TextProperty(
//        type = "Body",
//        size = "Large",
//        style = MaterialTheme.typography.bodyLarge
//    ),
//    TextProperty(
//        type = "Body",
//        size = "Medium",
//        style = MaterialTheme.typography.bodyMedium
//    ),
//    TextProperty(
//        type = "Body",
//        size = "Small",
//        style = MaterialTheme.typography.bodySmall
//    ),
//
//    TextProperty(
//        type = "Display",
//        size = "Large",
//        style = MaterialTheme.typography.displayLarge
//    ),
//    TextProperty(
//        type = "Display",
//        size = "Medium",
//        style = MaterialTheme.typography.displayMedium
//    ),
//    TextProperty(
//        type = "Display",
//        size = "Small",
//        style = MaterialTheme.typography.displaySmall
//    ),
//)


@Composable
fun HDumpText(){

    Column(modifier = Modifier.fillMaxWidth()) {
        val text = "the lazy dog jumped over the quick brown fox"

        HHeadline(text = "${text} ( Headline Larga )",  size = SizeCategory.Large)
        HHeadline(text = "${text} ( Headline Medium )",  size = SizeCategory.Medium)
        HHeadline(text = "${text} ( Headline Small )",  size = SizeCategory.Small)

        HTitle(text = "${text} ( Title Larga )",  size = SizeCategory.Large)
        HTitle(text = "${text} ( Title Medium )",  size = SizeCategory.Medium)
        HTitle(text = "${text} ( Title Small )",  size = SizeCategory.Small)

        HLabel(text = "${text} ( Label Larga )",  size = SizeCategory.Large)
        HLabel(text = "${text} ( Label Medium )",  size = SizeCategory.Medium)
        HLabel(text = "${text} ( Label Small )",  size = SizeCategory.Small)

        HBody(text = "${text} ( Body Larga )",  size = SizeCategory.Large)
        HBody(text = "${text} ( Body Medium )",  size = SizeCategory.Medium)
        HBody(text = "${text} ( Body Small )",  size = SizeCategory.Small)

        HDisplay(text = "${text} ( Display Larga )",  size = SizeCategory.Large)
        HDisplay(text = "${text} ( Display Medium )",  size = SizeCategory.Medium)
        HDisplay(text = "${text} ( Display Small )",  size = SizeCategory.Small)

    }
}

