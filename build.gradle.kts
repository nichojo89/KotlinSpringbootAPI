plugins {
    id("java")
    kotlin("jvm") version "1.7.21" // Kotlin version to use
    application // Application plugin. Also see 1️⃣ below the code
}

group = "org.kotlinspringboot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { // Settings for `KotlinCompile` tasks
    // Kotlin compiler options
    kotlinOptions.jvmTarget = "1.8" // Target version of generated JVM bytecode
}
//TODO toggle removing this
application {
    mainClass.set("MainKt") // The main class of the application
}