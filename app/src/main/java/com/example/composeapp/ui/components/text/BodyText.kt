package com.example.composeapp.ui.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.TextStyle
import com.example.composeapp.ui.theme.primaryTextColor

@Composable
fun BodyText(text: String) {
    Text(
        text = text,
        color = primaryTextColor,
        fontSize = TextStyle.Body.size,
        fontStyle = TextStyle.Body.style,
        fontWeight = TextStyle.Body.weight
    )
}

@Preview(showBackground = true)
@Composable
fun BodyTextPreview() {
    ComposeAppTheme {
        BodyText("Body")
    }
}