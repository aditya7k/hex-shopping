import Dependencies.annotationAPI
import Dependencies.assertK
import Dependencies.jacksonKotlin
import Dependencies.junitJupiter
import Dependencies.junitJupiterEngine
import Dependencies.kotlinBom
import Dependencies.kotlinLogging
import Dependencies.kotlinStLibraryJdk8
import Dependencies.kotlinxCoroutine
import Dependencies.log4jApi
import Dependencies.log4jCore
import Dependencies.log4jSlf4j
import Dependencies.micronautBom
import Dependencies.micronautHttpClient
import Dependencies.micronautHttpServerNetty
import Dependencies.micronautInject
import Dependencies.micronautKotlinRuntime
import Dependencies.micronautManagement
import Dependencies.micronautRuntime
import Dependencies.micronautTest
import Dependencies.micronautValidation

plugins {
    kotlin("kapt")
    kotlin("plugin.allopen")
}

allOpen {
    annotations(
            "io.micronaut.aop.Around",
            "io.micronaut.http.annotation.Controller",
            "javax.inject.Singleton"
    )
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

    //micronaut dependencies requiring annotation processing
    platform(micronautBom()).also {
        implementation(it)
        testImplementation(it)
        kapt(it)
        kaptTest(it)
    }

    micronautInject().also {
        implementation(it)
        kapt(it)
        kaptTest(it)
    }

    micronautValidation().also {
        implementation(it)
        kapt(it)
    }

    //micronaut dependencies
    implementation(micronautRuntime())
    implementation(micronautHttpClient())
    implementation(micronautManagement())
    implementation(micronautHttpServerNetty())
    implementation(micronautKotlinRuntime())
    implementation(kotlinxCoroutine())

    // other dependencies
    implementation(annotationAPI())

    //micronaut test dependency
    testImplementation(micronautTest())

    //logging
    implementation(log4jCore())
    implementation(kotlinLogging())
    runtimeOnly(log4jApi())
    runtimeOnly(log4jSlf4j())

    //json
    implementation(jacksonKotlin())


}
