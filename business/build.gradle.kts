plugins {
  id("java-library")
  alias(libs.plugins.jetbrains.kotlin.jvm)
  kotlin("plugin.serialization") version "2.0.0"
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
  //Coroutines
  implementation(libs.kotlinx.coroutines.core)

  //Ktor
  implementation(libs.ktor.client.core)
  implementation(libs.ktor.client.content.negotiation)
  implementation(libs.ktor.serialization.kotlinx.json)

  //Serialization
  implementation(libs.kotlinx.serialization.json)
}