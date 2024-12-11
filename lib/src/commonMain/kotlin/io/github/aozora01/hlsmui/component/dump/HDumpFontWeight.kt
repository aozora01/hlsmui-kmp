package io.github.aozora01.hlsmui.component.dump

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HDumpFontWeight() {
    val text = "the lazy dog jumped over the quick brown fox"
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "$text ( Thin )",
            fontWeight = FontWeight.Thin,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Extra Light )",
            fontWeight = FontWeight.ExtraLight,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Light )",
            fontWeight = FontWeight.Light,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Normal )",
            fontWeight = FontWeight.Normal,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Medium )",
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Semi Bold )",
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Bold )",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Extra Bold )",
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( Black )",
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W100 )",
            fontWeight = FontWeight.W100,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W200 )",
            fontWeight = FontWeight.W200,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W300 )",
            fontWeight = FontWeight.W300,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W400 )",
            fontWeight = FontWeight.W400,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W500 )",
            fontWeight = FontWeight.W500,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W600 )",
            fontWeight = FontWeight.W600,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W700 )",
            fontWeight = FontWeight.W700,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W800 )",
            fontWeight = FontWeight.W800,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "$text ( W900 )",
            fontWeight = FontWeight.W900,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
