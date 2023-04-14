package com.example.composeapp.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.components.button.PrimaryButton
import com.example.composeapp.ui.components.textfield.MainTextField
import com.example.composeapp.ui.theme.mediumDimen
import com.example.composeapp.ui.theme.smallDimen

@Composable
fun SessionPage() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = mediumDimen),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MainTextField(
            modifier = Modifier.fillMaxWidth(),
            placeHolder = "Introduce your user",
            label = "User",
            onValueChanged = {}
        )
        Spacer(modifier = Modifier.height(smallDimen))
        MainTextField(
            modifier = Modifier.fillMaxWidth(),
            placeHolder = "Introduce your password",
            label = "Password",
            onValueChanged = {}
        )
        Spacer(modifier = Modifier.height(mediumDimen))
        PrimaryButton(text = "Log in") {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SessionPagePreview() {
    SessionPage()
}
