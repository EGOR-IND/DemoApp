package com.example.business.omdb.domain.repos

import com.example.business.omdb.domain.models.OMDBResponse

interface OMDBRepository {
  suspend fun fetchSearchResponse(searchQuery: String): OMDBResponse
}