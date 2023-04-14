package com.example.composeapp.ui.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.TextStyle
import com.example.composeapp.ui.theme.primaryTextColor

@Composable
fun TitleText(text: String) {
    Text(
        text = text,
        color = primaryTextColor,
        fontSize = TextStyle.Title.size,
        fontStyle = TextStyle.Title.style,
        fontWeight = TextStyle.Title.weight
    )
}

@Preview(showBackground = true)
@Composable
fun TitleTextPreview() {
    ComposeAppTheme {
        TitleText("Title")
    }
}
