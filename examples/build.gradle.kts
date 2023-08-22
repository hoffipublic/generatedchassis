val versionKotlin = "1.9.0"
val versionKotlinxDatetime = "0.4.0"
val versionKotlinxSerializationJson = "1.5.1"
val versionExposed = "0.41.1"

plugins {
    kotlin("jvm") version "1.9.0"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$versionKotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:$versionKotlinxDatetime")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$versionKotlinxSerializationJson")
    implementation("org.jetbrains.exposed:exposed-core:${versionExposed}")
    implementation("org.jetbrains.exposed:exposed-kotlin-datetime:${versionExposed}")
}

repositories {
    mavenCentral()
    google()
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            //Will retain parameter names for Java reflection
            javaParameters = true
            kotlinOptions.freeCompilerArgs = listOf("-Xcontext-receivers")
        }
    }
}
