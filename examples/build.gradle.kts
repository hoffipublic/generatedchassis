val versionKotlin = "1.8.22"
val versionKotlinxDatetime = "0.4.0"
val versionKotlinxSerializationJson = "1.5.1"

plugins {
    kotlin("jvm") version "1.8.22"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$versionKotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:$versionKotlinxDatetime")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$versionKotlinxSerializationJson")
}

repositories {
    mavenCentral()
    google()
}

