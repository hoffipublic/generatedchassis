val versionKotlin = "1.9.10"
val versionKotlinxDatetime = "0.4.1"
val versionKotlinxSerializationJson = "1.6.0"
val versionExposed = "0.43.0"
val versionH2 = "2.2.220"
val versionPostgres = "42.6.0"
val versionSlf4j = "2.0.7"

plugins {
    kotlin("jvm") version "1.9.0"
}

dependencies {
    implementation(project(":examples"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$versionKotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:$versionKotlinxDatetime")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$versionKotlinxSerializationJson")
    implementation("org.jetbrains.exposed:exposed-core:${versionExposed}")
    implementation("org.jetbrains.exposed:exposed-jdbc:${versionExposed}")
    implementation("org.jetbrains.exposed:exposed-kotlin-datetime:${versionExposed}")
    implementation("org.slf4j:slf4j-nop:${versionSlf4j}")

    implementation("net.datafaker:datafaker:2.0.1")
    implementation("org.instancio:instancio-core:3.0.1")

    implementation("com.zaxxer:HikariCP:5.0.1")
    // for DEVMODE
    runtimeOnly("com.h2database:h2:$versionH2")
    runtimeOnly("org.postgresql:postgresql:$versionPostgres")
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

