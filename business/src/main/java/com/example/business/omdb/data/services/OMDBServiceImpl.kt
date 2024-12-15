package com.example.business.omdb.data.services

import com.example.business.omdb.data.entities.OMDBResponseEntity
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.parameters
import kotlinx.serialization.json.Json

class OMDBServiceImpl(
  private val httpClient: HttpClient,
  private val json: Json,
) : OMDBService {

  override suspend fun getSearchResponse(
    searchQuery: String
  ): OMDBResponseEntity = json.decodeFromString(
      OMDBResponseEntity.serializer(),
      httpClient.get {
        parameters {
          append("s", searchQuery)
        }
      }.bodyAsText()
    )
}