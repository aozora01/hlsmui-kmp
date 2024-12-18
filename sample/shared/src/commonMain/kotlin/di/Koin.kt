package di

import org.koin.core.context.startKoin
import org.koin.dsl.module
import app.screen.documentation.DocumentationViewModel
import app.AppViewModel
import app.screen.documentation.composable.theme.ThemeViewModel
import app.screen.home.HomeViewModel

val appModule = module {
    single { DocumentationViewModel() }
    single { AppViewModel() }
    single { ThemeViewModel() }
    single { HomeViewModel() }
//    single { GenerateViewModel() }
//    single { SchemeViewModel() }
}

fun initKoin() = startKoin {modules(appModule)}