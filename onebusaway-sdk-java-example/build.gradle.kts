plugins {
    id("java")
}

group = "org.onebusaway.example"
version = "0.1.0-alpha.4"

repositories {
    mavenCentral()
}

dependencies {

    implementation(project(":onebusaway-sdk-java"))
    implementation(project(mapOf("path" to ":onebusaway-sdk-java-core")))


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}