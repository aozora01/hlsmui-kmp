package app.screen.home

import androidx.lifecycle.ViewModel

data class HomeUiState(
    val textAcronym : String = "hassle-free, light, simple, materialized ui",
    val textDescription : String = "a Kotlin Multiplatform UI library designed for Jetpack Compose. It simplifies building layouts, styles, and theming, making it easier to create beautiful and consistent user interfaces.",
)

class HomeViewModel : ViewModel() {
    val uiState = HomeUiState()
}