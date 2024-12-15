package com.example.demoapp.network

import com.example.demoapp.BuildConfig
import com.example.demoapp.network.client.OMDBOkHttpClient
import dagger.Module
import dagger.Provides
import io.ktor.client.HttpClient

@Module
class NetworkModule {

  @Provides
  fun provideOMDBOkHttpClient(): HttpClient =
    OMDBOkHttpClient().invoke(BuildConfig.OMDB_CREDS)
}