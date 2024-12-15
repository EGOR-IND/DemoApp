package com.example.business.omdb.data.repos

import com.example.business.omdb.data.services.OMDBService
import com.example.business.omdb.domain.mappers.toModel
import com.example.business.omdb.domain.models.OMDBResponse
import com.example.business.omdb.domain.repos.OMDBRepository

class OMDBRepositoryImpl(
  private val omdbService: OMDBService
) : OMDBRepository {

  override suspend fun fetchSearchResponse(searchQuery: String): OMDBResponse =
    omdbService.getSearchResponse(searchQuery).toModel()
}