package com.example.business.omdb.data.services

import com.example.business.omdb.data.entities.OMDBResponseEntity

interface OMDBService {
  suspend fun getSearchResponse(searchQuery: String): OMDBResponseEntity
}