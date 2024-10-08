package com.nur.data.network.dtos

import com.google.gson.annotations.SerializedName
import com.nur.domain.models.anime.Attributes

data class AttributesDto(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("status")
    val status: String = "",
    @SerializedName("posterImage")
    val posterImage: PosterImageDto,
    @SerializedName("titles")
    val titles: TitlesDto
)

fun AttributesDto.toDomain(): Attributes = Attributes(
    description,
    status,
    posterImage.toDomain(),
    titles.toDomain(),
)