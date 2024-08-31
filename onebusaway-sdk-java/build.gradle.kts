plugins {
    id("onebusaway-sdk.kotlin")
    id("onebusaway-sdk.publish")
}

dependencies {
    api(project(":onebusaway-sdk-java-client-okhttp"))
}
