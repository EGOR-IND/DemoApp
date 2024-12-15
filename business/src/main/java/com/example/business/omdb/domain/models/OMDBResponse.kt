package com.example.business.omdb.domain.models

sealed class OMDBResponse {

  data class SearchSuccessResponse(
    val search: List<Content>,
    val totalResults: Int,
    val response: Boolean,
  ) : OMDBResponse()

  data class ErrorResponse(
    val error: String,
    val response: Boolean,
  ) : OMDBResponse()
}

data class Content(
  val title: String,
  val year: String,
  val imdbID: String,
  val type: ContentType,
  val posterUrl: String,
)

enum class ContentType {
  movie,
  series,
  episode,
}
