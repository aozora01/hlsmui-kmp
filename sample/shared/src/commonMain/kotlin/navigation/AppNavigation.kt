package navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


import androidx.navigation.compose.rememberNavController
import screen.documentation.DocumentationScreen
import screen.home.HomeScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = Screen.Documentation.route,
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Documentation.route) {
            DocumentationScreen()
        }
//        composable(Screen.Generate.route) {
//            GenerateScreen()
//        }
//        composable(Screen.Test.route)  {
//            MyApp()
//        }
    }
}