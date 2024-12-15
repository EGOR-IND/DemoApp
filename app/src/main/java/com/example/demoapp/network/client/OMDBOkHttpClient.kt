package com.example.demoapp.network.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.cache.HttpCache

class OMDBOkHttpClient {

  fun invoke(credential: String): HttpClient = HttpClient(OkHttp) {
    install(HttpCache)
  }
    .config {
      defaultRequest {
        url("http://www.omdbapi.com/?apikey=$credential")
      }
    }
}