import Dependencies.assertk
import Dependencies.junitJupiter
import Dependencies.junitJupiterEngine
import Dependencies.kotlinBom
import Dependencies.kotlinStlibJdk8

plugins {
}


dependencies {
    // Align versions of all Kotlin components
    implementation(platform(kotlinBom()))

    // Use the Kotlin JDK 8 standard library.
    implementation(kotlinStlibJdk8())

    // Use JUnit Jupiter API for testing.
    testImplementation(junitJupiter())

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly(junitJupiterEngine())

    testImplementation(assertk())
}

repositories {
    mavenCentral()
}