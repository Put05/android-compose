package com.example.composeapp.ui.components.button

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.primaryButtonBackground
import com.example.composeapp.ui.theme.primaryButtonTextColor

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = primaryButtonBackground)
    ) {
        Text(text = text, color = primaryButtonTextColor)
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(text = "Primary button") {
        // Do nothing here.
    }
}
