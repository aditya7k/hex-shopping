import Dependencies.assertK
import Dependencies.junitJupiter
import Dependencies.junitJupiterEngine
import Dependencies.kotlinBom
import Dependencies.kotlinStLibraryJdk8

plugins {
}


dependencies {
    // Align versions of all Kotlin components
    implementation(platform(kotlinBom()))

    // Use the Kotlin JDK 8 standard library.
    implementation(kotlinStLibraryJdk8())

    // Use JUnit Jupiter API for testing.
    testImplementation(junitJupiter())

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly(junitJupiterEngine())

    testImplementation(assertK())
}

repositories {
    mavenCentral()
}