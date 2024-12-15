package com.example.demoapp.di

import com.example.demoapp.network.NetworkModule
import dagger.Component

@Component(
  modules = [NetworkModule::class],
)
interface AppComponent {
}