/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/6.7/userguide/multi_project_builds.html
 */

rootProject.name = "hex-shopping"
module("domain")

fun module(firstPathSegment: String, vararg pathSegments: String) {

    val projectPath = arrayOf(firstPathSegment, *pathSegments)

    require(projectPath.isNotEmpty()) { "Project path must contain at least 1 element." }

    val projectName = projectPath.last()
    val path = projectPath.sliceArray(0 until projectPath.size - 1)
    val group = path.joinToString(separator = "-")
    val directory = path.joinToString(separator = "/", prefix = "./")

    include("${if (group.isEmpty()) "" else "$group-"}$projectName")
    project(":${if (group.isEmpty()) "" else "$group-"}$projectName").projectDir = file("$directory/$projectName")
}
