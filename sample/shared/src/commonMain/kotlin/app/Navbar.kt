package app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose_multiplatform_library_template.sample.shared.generated.resources.Res
import io.github.aozora01.hlsmui.component.text.HLabel
import io.github.aozora01.hlsmui.component.text.HTitle
import io.github.aozora01.hlsmui.component.text.SizeCategory
import org.koin.compose.viewmodel.koinViewModel

enum class NavbarColor{
    Primary,
    Secondary,
    Tertiary,
    Transparent
}

enum class NavbarMenu{
    Home,
    Documentation,
    About,
}



@Composable
fun Navbar(viewModel: AppViewModel = koinViewModel(), color: NavbarColor = NavbarColor.Transparent){

    val (backgroundColor, textColor)  = when(color){
        NavbarColor.Primary -> Pair(MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.onPrimary)
        NavbarColor.Secondary -> Pair(MaterialTheme.colorScheme.secondary, MaterialTheme.colorScheme.onSecondary)
        NavbarColor.Tertiary -> Pair(MaterialTheme.colorScheme.tertiary, MaterialTheme.colorScheme.onTertiary)
        NavbarColor.Transparent -> Pair(MaterialTheme.colorScheme.background, MaterialTheme.colorScheme.onBackground)

    }



    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(vertical = 16.dp),
//
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.weight(1f)) { Logo(textColor)}

        Row(
            modifier = Modifier.fillMaxWidth().weight(1f),
            horizontalArrangement = Arrangement.End
        ) {

            NavbarMenus(textColor)

        }

    }
}

@Composable
fun NavbarMenus(textColor :Color, viewModel: AppViewModel = koinViewModel()){
    val uiState = viewModel.uiState.collectAsState()

    val menus = listOf(
        NavbarMenu.Home,
       NavbarMenu.Documentation,
        NavbarMenu.About
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        menus.forEach {
            TextButton(
                onClick = {viewModel.updateNavbarMenu(it)},
                colors = ButtonDefaults.textButtonColors(
                    containerColor = if(uiState.value.navBarMenu == it) MaterialTheme.colorScheme.primaryContainer else Color.Transparent
                )

            ){
                HLabel(it.name.toString(), modifier = Modifier.padding(8.dp),color = textColor, size = SizeCategory.Large)

            }
        }
    }


}

@Composable
fun Logo(textColor: Color){
    val brush = Brush.horizontalGradient(listOf(
        MaterialTheme.colorScheme.primary,
        MaterialTheme.colorScheme.secondary,
        MaterialTheme.colorScheme.tertiary)
    )
    Text(
        text = "hlsmui",
        style = TextStyle(
            brush = brush,
            fontWeight = FontWeight.Black,
            fontSize = 28.sp,
            fontFamily = MaterialTheme.typography.titleLarge.fontFamily,
        )
//        color = textColor,

    )
}

