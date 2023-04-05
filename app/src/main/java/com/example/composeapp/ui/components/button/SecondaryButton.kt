package com.example.composeapp.ui.components.button

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.secondaryButtonBackground
import com.example.composeapp.ui.theme.secondaryButtonTextColor

@Composable
fun SecondaryButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = secondaryButtonBackground)
    ) {
        Text(text = text, color = secondaryButtonTextColor)
    }
}

@Preview(showBackground = true)
@Composable
fun SecondaryButtonPreview() {
    SecondaryButton(text = "Secondary button") {
        // Do nothing here.
    }
}