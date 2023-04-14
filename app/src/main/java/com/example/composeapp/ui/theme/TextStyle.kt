package com.example.composeapp.ui.theme

import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

sealed class TextStyle(val size: TextUnit, val weight: FontWeight, val style: FontStyle) {
    object Title : TextStyle(size = 30.sp, weight = FontWeight.Bold, style = FontStyle.Normal)
    object Subtitle : TextStyle(size = 20.sp, weight = FontWeight.Bold, style = FontStyle.Italic)
    object Body : TextStyle(size = 16.sp, weight = FontWeight.Normal, style = FontStyle.Normal)
}
