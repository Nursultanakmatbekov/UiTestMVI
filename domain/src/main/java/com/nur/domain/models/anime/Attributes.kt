package com.nur.domain.models.anime


data class Attributes(
    val description: String = "",
    val status: String = "",
    val posterImage: PosterImage,
    val titles: Titles, )