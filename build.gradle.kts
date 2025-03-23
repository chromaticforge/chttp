plugins {
    // cave man technology, sorry I play Minecraft 1.8.9 :(
    kotlin("jvm") version "1.9.10"
}

group = "com.github.chromaticforge.chttp"
version = "0.1.0-Alpha"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.0.2")
}

kotlin {
    jvmToolchain(8)
}