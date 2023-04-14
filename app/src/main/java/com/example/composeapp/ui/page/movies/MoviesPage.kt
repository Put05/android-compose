package com.example.composeapp.ui.page.movies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeapp.ui.components.image.ComposeImage
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.smallDimen

private const val COLUMNS_COUNT = 3
private const val ASPECT_RATIO = 2 / 3f

@Composable
fun MoviesPage(vm: MoviesViewModel = viewModel()) {
    val moviesUIState by vm.moviesUIState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val rows = moviesUIState.movies.count() / COLUMNS_COUNT
        for (i in 0 until rows) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                for (j in 0 until COLUMNS_COUNT) {
                    val pos = i * COLUMNS_COUNT + j
                    ComposeImage(
                        url = moviesUIState.movies[pos].imageUrl,
                        modifier = Modifier
                            .aspectRatio(ASPECT_RATIO)
                            .weight(1f)
                            .padding(smallDimen)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviesPagePreview() {
    ComposeAppTheme {
        MoviesPage()
    }
}
