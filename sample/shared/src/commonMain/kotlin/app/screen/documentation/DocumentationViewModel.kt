package app.screen.documentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import model.HComponentName

data class DocumentationUiState(
    val name:String = "docs",
    val component:HComponentName = HComponentName.GetStarted
)

class DocumentationViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DocumentationUiState())
    val uiState: StateFlow<DocumentationUiState> = _uiState.asStateFlow()

    fun updateComponent(component: HComponentName){
        _uiState.value = _uiState.value.copy(component = component)
    }

}