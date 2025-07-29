# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class org.onebusaway.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }