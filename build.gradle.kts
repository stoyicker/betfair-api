import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.71"
}

group = "com.stoyicker"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(group = "com.squareup.retrofit2", name = "retrofit", version = "2.4.0")
    implementation(group = "com.squareup.retrofit2", name = "converter-moshi", version = "2.4.0")
    implementation(group = "com.squareup.retrofit2", name = "adapter-rxjava2", version = "2.4.0")
    implementation(group = "com.squareup.moshi", name = "moshi-kotlin", version = "1.7.0")
    implementation(group = "io.reactivex.rxjava2", name = "rxjava2", version = "2.2.2")
}

configurations.all {
    resolutionStrategy {
        failOnVersionConflict()
        force(
            "com.squareup.okio:okio:1.14.0",
            "com.squareup.moshi:moshi:1.7.0")
    }
}
