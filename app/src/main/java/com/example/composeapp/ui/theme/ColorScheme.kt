package com.example.composeapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

// region Surface

val primarySurfaceBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Black else White

// endregion

// region Text

val primaryTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) White else Black

// endregion

// region Button

val primaryButtonBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) White else Black

val primaryButtonTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Black else White

val secondaryButtonBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) BlueLight else BlueDark

val secondaryButtonTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) BlueDark else BlueLight

// endregion

// region TextField

val primaryTextFieldTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) White else Black

val primaryTextFieldBackgroundColor: Color
    @Composable
    get() = Color.Transparent

val primaryTextFieldFocusedBorderColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) White else Black

val primaryTextFieldUnfocusedBorderColor: Color
    @Composable
    get() = Color.Gray

val primaryTextFieldFocusedLabelColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) White else Black

val primaryTextFieldUnfocusedLabelColor: Color
    @Composable
    get() = Color.Gray

// endregion
