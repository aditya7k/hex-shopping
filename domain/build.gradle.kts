import Dependencies.assertK
import Dependencies.junitJupiter
import Dependencies.junitJupiterEngine
import Dependencies.kotlinBom
import Dependencies.kotlinStLibraryJdk8
import Dependencies.micronautInject
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    kotlin("kapt")
    kotlin("plugin.allopen")
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
    // Use assertK more fluent assertions
    testImplementation(assertK())

    micronautInject().also {
        implementation(it)
        kapt(it)
        kaptTest(it)
    }
}
