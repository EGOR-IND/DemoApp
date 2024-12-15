package com.example.business.omdb.data.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class OMDBResponseEntity {

  @Serializable
  data class SearchSuccessResponseEntity(
    @SerialName("Search")
    val search: List<ContentEntity>,
    @SerialName("totalResults")
    val totalResults: Int,
    @SerialName("Response")
    val response: Boolean,
  ) : OMDBResponseEntity()

  @Serializable
  data class ErrorResponseEntity(
    @SerialName("Error")
    val error: String,
    @SerialName("Response")
    val response: Boolean,
  ) : OMDBResponseEntity()
}

@Serializable
data class ContentEntity(
  @SerialName("Title")
  val title: String,
  @SerialName("Year")
  val year: String,
  @SerialName("imdbID")
  val imdbID: String,
  @SerialName("Type")
  val type: ContentTypeEntity,
  @SerialName("Poster")
  val posterUrl: String,
)

@Serializable
enum class ContentTypeEntity {
  movie,
  series,
  episode,
}
