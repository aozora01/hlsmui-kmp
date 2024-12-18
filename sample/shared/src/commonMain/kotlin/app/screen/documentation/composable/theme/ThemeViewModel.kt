package app.screen.documentation.composable.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ThemeUiState(
    val name:String = "theme",
    val isCustom: Boolean = false
)

class ThemeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ThemeUiState())
    val uiState : StateFlow<ThemeUiState> = _uiState.asStateFlow()

    fun updateIsCustom(isCustom: Boolean){
        _uiState.value = _uiState.value.copy(isCustom = isCustom)

    }
}