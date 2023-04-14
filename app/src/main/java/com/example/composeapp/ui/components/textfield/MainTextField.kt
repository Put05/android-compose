package com.example.composeapp.ui.components.textfield

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.primaryTextFieldBackgroundColor
import com.example.composeapp.ui.theme.primaryTextFieldFocusedBorderColor
import com.example.composeapp.ui.theme.primaryTextFieldFocusedLabelColor
import com.example.composeapp.ui.theme.primaryTextFieldTextColor
import com.example.composeapp.ui.theme.primaryTextFieldUnfocusedBorderColor
import com.example.composeapp.ui.theme.primaryTextFieldUnfocusedLabelColor

@Composable
fun MainTextField(
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardAction: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    placeHolder: String,
    label: String,
    value: String = "",
    onValueChanged: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardAction,
        visualTransformation = visualTransformation,
        placeholder = { Text(text = placeHolder) },
        label = { Text(text = label) },
        value = value,
        onValueChange = onValueChanged,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = primaryTextFieldBackgroundColor,
            textColor = primaryTextFieldTextColor,
            unfocusedBorderColor = primaryTextFieldUnfocusedBorderColor,
            focusedBorderColor = primaryTextFieldFocusedBorderColor,
            unfocusedLabelColor = primaryTextFieldUnfocusedLabelColor,
            focusedLabelColor = primaryTextFieldFocusedLabelColor
        )
    )
}

@Preview(showBackground = true)
@Composable
fun MainTextFieldPreview() {
    MainTextField(placeHolder = "Placeholder", label = "Label", value = "") {
        // Do nothing here.
    }
}
