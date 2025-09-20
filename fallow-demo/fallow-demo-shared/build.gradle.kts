plugins {
    id("io.github.fallow.java")
}

dependencies {
    compileOnly(project(":fallow-broker-common"))
    compileOnly(project(":fallow-codec-jackson"))
}