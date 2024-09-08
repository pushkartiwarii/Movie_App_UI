package com.api.myapplication.ui.screen

import androidx.lifecycle.ViewModel
import com.api.myapplication.ui.models.Movie
import com.api.myapplication.ui.models.MovieThumbnailState
import com.api.myapplication.ui.models.RecentlyWatchedMoviesData
import com.api.myapplication.ui.models.StreamingMoviesData
import com.api.myapplication.ui.models.UpcomingMoviesData
import com.api.myapplication.ui.models.getMovies
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LoginState(
    val isLoginCompleted: Boolean = false,
    val isError: Boolean = false,
)

data class HomeState(
    val featuredMovies: List<Movie> = getMovies(),
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData,

    val movieList: List<Movie> = getMovies(),
    val selectedMovie: Movie? = null,
)
class AppViewModel() : ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

    private val _homeState = MutableStateFlow((HomeState()))
    val homeState = _homeState.asStateFlow()

    fun onHomeEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.OnMovieClick -> {
                _homeState.update {
                    it.copy(selectedMovie = event.movie)
                }
            }
        }
    }

    fun onLoginEvent(event: LoginEvent) {
        when (event) {
            LoginEvent.OnLoginClick -> {
                _loginState.update {
                    it.copy(
                        isLoginCompleted = true,
                        isError = false
                    )
                }

            }
        }
    }
}



