plugins {
    id("io.github.fallow.java")
}

dependencies {
    api(project(":fallow-broker-redis"))
    api(project(":fallow-codec-jackson"))
    api(project(":fallow-demo:fallow-demo-shared"))
}