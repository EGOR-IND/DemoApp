package com.example.demoapp

import android.app.Application
import com.example.demoapp.di.AppComponent

class MainApplication : Application() {

  val appComponent = AppComponent.create()
}