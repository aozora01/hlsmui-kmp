package app.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


import androidx.navigation.compose.rememberNavController
import app.AppViewModel
import app.NavbarMenu
import app.screen.about.AboutScreen
import app.screen.documentation.DocumentationScreen
import app.screen.home.HomeScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AppNavigation(viewModel: AppViewModel = koinViewModel()) {
    val uiState = viewModel.uiState.collectAsState()
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = when(uiState.value.navBarMenu){
            NavbarMenu.Home -> Screen.Home.route
            NavbarMenu.Documentation -> Screen.Documentation.route
            NavbarMenu.About -> Screen.About.route
        },
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Documentation.route) {
            DocumentationScreen()
        }
        composable(Screen.About.route) {
            AboutScreen()
        }

    }
}