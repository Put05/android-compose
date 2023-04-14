package com.example.composeapp.ui.page.session

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeapp.ui.components.button.PrimaryButton
import com.example.composeapp.ui.components.textfield.MainTextField
import com.example.composeapp.ui.theme.mediumDimen
import com.example.composeapp.ui.theme.smallDimen

@Composable
fun SessionPage(sessionViewModel: SessionViewModel = viewModel()) {
    val focusManager = LocalFocusManager.current
    val uiState by sessionViewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = mediumDimen),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MainTextField(
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            ),
            placeHolder = "Introduce your user",
            label = "User",
            value = uiState.user,
            isError = uiState.isUserError
        ) {
            sessionViewModel.onUserChanged(user = it)
        }
        Spacer(modifier = Modifier.height(smallDimen))
        MainTextField(
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardAction = KeyboardActions(
                onDone = {
                    focusManager.clearFocus()
                    sessionViewModel.onKeyBoardDonePressed()
                }
            ),
            placeHolder = "Introduce your password",
            label = "Password",
            value = uiState.password,
            isError = uiState.isPasswordError
        ) {
            sessionViewModel.onPassChanged(password = it)
        }
        Spacer(modifier = Modifier.height(mediumDimen))
        PrimaryButton(text = "Log in") {
            sessionViewModel.onLogInPressed()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SessionPagePreview() {
    SessionPage()
}
