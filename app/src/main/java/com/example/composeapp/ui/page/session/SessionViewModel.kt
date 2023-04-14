package com.example.composeapp.ui.page.session

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SessionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(SessionUIState())
    val uiState: StateFlow<SessionUIState> = _uiState.asStateFlow()

    fun onUserChanged(user: String) {
        _uiState.value = uiState.value.copy(user = user)
    }

    fun onPassChanged(password: String) {
        _uiState.value = uiState.value.copy(password = password)
    }

    fun onKeyBoardDonePressed() {
        checkErrors()
    }

    private fun checkErrors() {
        _uiState.value = uiState.value.copy(
            isUserError = uiState.value.user != "admin",
            isPasswordError = uiState.value.password != "admin"
        )
    }

    fun onLogInPressed() {
        checkErrors()
    }
}
