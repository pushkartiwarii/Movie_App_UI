package com.api.myapplication.ui.models

import androidx.annotation.DrawableRes
import com.api.myapplication.R

data class MovieThumbnailState(
    val id: Int,
    val img: Int
)
val UpcomingMoviesData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.venom
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.kraven_the_hunter__film__poster
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.captain_america_brave_new_world_poster
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.theconjuring
    )
)

val RecentlyWatchedMoviesData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.iron_man
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.pulpfiction
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.inception
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.ironman2
    ),
)

val StreamingMoviesData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.iron_man_3_
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.thegodfather
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.interstellar_film
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.forestgump
    ),
)