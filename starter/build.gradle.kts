import Dependencies.assertK
import Dependencies.junitJupiter
import Dependencies.junitJupiterEngine
import Dependencies.kotlinBom
import Dependencies.kotlinStLibraryJdk8
import Dependencies.micronautBom
import Dependencies.micronautInject
import Dependencies.micronautRuntime
import Dependencies.micronautTest
import Dependencies.micronautValidation

plugins {
    application
    kotlin("kapt")
}

application {
    mainClass.set("com.hex.shopping.Starter")
}

dependencies {
    api(project(":adapters-inbound-web"))
    runtimeOnly(project(":configuration-runtime-files"))

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
    testImplementation(micronautTest())

}
