package com.example.composeapp.ui.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.components.button.PrimaryButton
import com.example.composeapp.ui.components.button.SecondaryButton
import com.example.composeapp.ui.components.text.BodyText
import com.example.composeapp.ui.components.text.SubtitleText
import com.example.composeapp.ui.components.text.TitleText
import com.example.composeapp.ui.components.textfield.MainTextField
import com.example.composeapp.ui.theme.ComposeAppTheme

@Composable
fun ComponentsPage() {
    var mainTFValue by remember {
        mutableStateOf("")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            TitleText(text = "Title")
            SubtitleText(text = "Subtitle")
            BodyText(text = "Body")
            PrimaryButton(text = "Primary button") {
                // Nothing here.
            }
            SecondaryButton(text = "Secondary button") {
                // Nothing here.
            }
            MainTextField(placeHolder = "Write something", label = "Label", value = mainTFValue) {
                mainTFValue = it
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComponentsPagePreview() {
    ComposeAppTheme {
        ComponentsPage()
    }
}
