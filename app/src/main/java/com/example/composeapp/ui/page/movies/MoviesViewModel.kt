package com.example.composeapp.ui.page.movies

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

private const val MOVIES_COUNT = 21

private const val IMAGE_URL = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/" +
    "5a7382a8-7e17-48bb-9295-77dc9a4f446f/dfneagn-9fe31f25-b3cd-4f32-be03-543ef4835115.jpg/v1/fill/" +
    "w_1280,h_1896,q_75,strp/the_mandalorian__season_3____poster_by_rosereystock_dfneagn-fullview.jpg?" +
    "token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVh" +
    "MGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2" +
    "ZcLzVhNzM4MmE4LTdlMTctNDhiYi05Mjk1LTc3ZGM5YTRmNDQ2ZlwvZGZuZWFnbi05ZmUzMWYyNS1iM2NkLTRmMzItYmUwMy01NDNlZj" +
    "Q4MzUxMTUuanBnIiwiaGVpZ2h0IjoiPD0xODk2Iiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F" +
    "0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvNWE3MzgyYTgtN2UxNy00OGJiLTkyOTUtNzdkYzlhNGY0NDZmXC9yb3NlcmV5c3Rv" +
    "Y2stNC5wbmciLCJvcGFjaXR5Ijo5NSwicHJvcG9ydGlvbnMiOjAuNDUsImdyYXZpdHkiOiJjZW50ZXIifX0.qvnDo-HzMGy1EJ5_xRtAVR" +
    "3gn45zNoBZY7sf_sYlLxE"

class MoviesViewModel : ViewModel() {
    private val _moviesUIState: MutableStateFlow<MoviesUIState> = MutableStateFlow(MoviesUIState())
    val moviesUIState: StateFlow<MoviesUIState> get() = _moviesUIState.asStateFlow()

    init {
        val movies = mutableListOf<MovieUIState>()
        (0 until MOVIES_COUNT).forEach { _ ->
            movies.add(MovieUIState(IMAGE_URL))
        }
        _moviesUIState.value = MoviesUIState(movies)
    }
}
