package com.example.composeapp.ui.page

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.components.button.PrimaryButton
import com.example.composeapp.ui.components.textfield.MainTextField
import com.example.composeapp.ui.theme.mediumDimen
import com.example.composeapp.ui.theme.smallDimen

@Composable
fun SessionPage() {
    val focusManager = LocalFocusManager.current

    var user by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var isUserError by remember {
        mutableStateOf(false)
    }

    var isPasswordError by remember {
        mutableStateOf(false)
    }

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
            value = user,
            isError = isUserError
        ) {
            user = it
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
                    isUserError = user != "admin"
                    isPasswordError = password != "admin"
                }
            ),
            placeHolder = "Introduce your password",
            label = "Password",
            value = password,
            isError = isPasswordError
        ) {
            password = it
        }
        Spacer(modifier = Modifier.height(mediumDimen))
        PrimaryButton(text = "Log in") {
            isUserError = user != "admin"
            isPasswordError = password != "admin"
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SessionPagePreview() {
    SessionPage()
}
