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
    // Use `./gradlew :onebusaway-sdk-java-example:run` to run `Main`
    // Use `./gradlew :onebusaway-sdk-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "org.onebusaway.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
