package com.example.composeapp.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.composeapp.ui.page.session.SessionPage
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.primarySurfaceBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(primarySurfaceBackground)
                ) {
                    SessionPage()
                }
            }
        }
    }
}
