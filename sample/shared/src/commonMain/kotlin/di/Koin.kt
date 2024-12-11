package di

import org.koin.core.context.startKoin
import org.koin.dsl.module
import screen.documentation.DocumentationViewModel
import app.AppViewModel
import screen.documentation.composable.theme.ThemeViewModel

val appModule = module {
    single { DocumentationViewModel() }
    single { AppViewModel() }
    single { ThemeViewModel() }
//    single { GenerateViewModel() }
//    single { SchemeViewModel() }
}

fun initKoin() = startKoin {modules(appModule)}