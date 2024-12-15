package com.example.business.omdb.domain.mappers

import com.example.business.omdb.data.entities.ContentEntity
import com.example.business.omdb.data.entities.ContentTypeEntity
import com.example.business.omdb.data.entities.OMDBResponseEntity
import com.example.business.omdb.data.entities.OMDBResponseEntity.ErrorResponseEntity
import com.example.business.omdb.data.entities.OMDBResponseEntity.SearchSuccessResponseEntity
import com.example.business.omdb.domain.models.Content
import com.example.business.omdb.domain.models.ContentType
import com.example.business.omdb.domain.models.OMDBResponse.ErrorResponse
import com.example.business.omdb.domain.models.OMDBResponse.SearchSuccessResponse

fun OMDBResponseEntity.toModel() = when (this) {
  is SearchSuccessResponseEntity -> SearchSuccessResponse(
    search = search.map { it.toModel() },
    totalResults = totalResults,
    response = response,
  )
  is ErrorResponseEntity -> ErrorResponse(
    error = error,
    response = response,
  )
}

fun ContentEntity.toModel() = Content(
  title = title,
  year = year,
  imdbID = imdbID,
  type = type.toModel(),
  posterUrl = posterUrl,
)

fun ContentTypeEntity.toModel() = when (this) {
  ContentTypeEntity.movie -> ContentType.movie
  ContentTypeEntity.series -> ContentType.series
  ContentTypeEntity.episode -> ContentType.episode
}