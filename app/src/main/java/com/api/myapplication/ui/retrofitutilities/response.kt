package com.api.myapplication.ui.retrofitutilities

import retrofit2.Response

data class Data(
    val country: String,
    val genres: List<String>,
    val id: Int,
    val images: List<String>,
    val imdb_rating: String,
    val poster: String,
    val title: String,
    val year: String
)

data class Details(
    val actors: String = "",
    val awards: String= "",
    val country: String= "",
    val director: String= "",
    val genres: List<String> = emptyList(),
    val id: Int = 0,
    val images: List<String> = emptyList(),
    val imdb_id: String= "",
    val imdb_rating: String= "",
    val imdb_votes: String= "",
    val metascore: String= "",
    val plot: String= "",
    val poster: String= "",
    val rated: String= "",
    val released: String= "",
    val runtime: String= "",
    val title: String= "",
    val type: String= "",
    val writer: String= "",
    val year: String= ""
)

data class Metadata(
    val current_page: String,
    val page_count: Int,
    val per_page: Int,
    val total_count: Int
)


data class MoviesList(
    val data: List<Data>,
    val metadata: Metadata
)


