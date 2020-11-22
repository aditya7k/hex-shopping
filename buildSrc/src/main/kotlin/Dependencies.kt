import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency

object Dependencies {

    fun log4jCore(version: String = Versions.log4j2): ModuleDependency = log4j2("log4j-core", version)
    fun log4jApi(version: String = Versions.log4j2): ModuleDependency = log4j2("log4j-api", version)
    fun log4jSlf4j(version: String = Versions.log4j2): ModuleDependency = log4j2("log4j-slf4j-impl", version)

    fun annotationAPI(version: String = Versions.annotationApi): ModuleDependency = DefaultExternalModuleDependency("javax.annotation", "javax.annotation-api", version)
    fun micronautKotlinRuntime(version: String = Versions.micronaut): ModuleDependency = DefaultExternalModuleDependency("io.micronaut.kotlin", "micronaut-kotlin-runtime", version)
    fun micronautTest(version: String = Versions.micronaut): ModuleDependency = DefaultExternalModuleDependency("io.micronaut.test", "micronaut-test-junit5", version)

    fun kotlinBom(version: String = Versions.kotlin): ModuleDependency = kotlin("kotlin-bom", version)
    fun kotlinStLibraryJdk8(version: String = Versions.kotlin): ModuleDependency = kotlin("kotlin-stdlib-jdk8", version)

    fun junitJupiter(version:  String = Versions.junit): ModuleDependency = junit("junit-jupiter-api", version)
    fun junitJupiterEngine(version:  String = Versions.junit): ModuleDependency = junit("junit-jupiter-engine", version)
    fun assertK(version : String = Versions.assertK) : ModuleDependency = DefaultExternalModuleDependency("com.willowtreeapps.assertk", "assertk-jvm", version)

    fun micronautBom(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-bom", version)
    fun micronautInject(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-inject-java", version)
    fun micronautRuntime(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-runtime", version)
    fun micronautValidation(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-validation", version)
    fun micronautHttpClient(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-http-client", version)
    fun micronautManagement(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-management", version)
    fun micronautHttpServerNetty(version: String = Versions.micronaut): ModuleDependency = micronaut("micronaut-http-server-netty", version)

    private fun log4j2(name: String, version: String = Versions.log4j2): ModuleDependency = DefaultExternalModuleDependency("org.apache.logging.log4j", name, version)
    private fun kotlin(name: String, version: String = Versions.kotlin): ModuleDependency = DefaultExternalModuleDependency("org.jetbrains.kotlin", name, version)
    private fun junit(name: String, version: String = Versions.junit): ModuleDependency = DefaultExternalModuleDependency("org.junit.jupiter", name, version)
    private fun micronaut(name: String, version: String = Versions.micronaut): ModuleDependency = DefaultExternalModuleDependency("io.micronaut", name, version)

}
