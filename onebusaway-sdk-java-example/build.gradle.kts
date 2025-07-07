plugins {
    id("onebusaway-sdk.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":onebusaway-sdk-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "org.onebusaway.example.Main"
}
