package com.example.composeapp.ui.page

data class SessionUIState(
    val user: String = "",
    val password: String = "",
    val isUserError: Boolean = false,
    val isPasswordError: Boolean = false
)
