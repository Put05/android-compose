package com.example.composeapp.ui.components.image

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.GreyLight

@Composable
fun ComposeImage(url: String, modifier: Modifier = Modifier) {
    AsyncImage(
        model = url,
        contentDescription = null,
        modifier = modifier.background(GreyLight),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun ComposeImagePreview() {
    ComposeAppTheme {
        ComposeImage("file:///android_asset/the_mandalorian.jpeg")
    }
}
