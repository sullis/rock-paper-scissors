plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    mavenCentral()
}

val powertoolsVersion = "1.16.1"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:32.1.2-jre")
    implementation("com.amazonaws:aws-lambda-java-core:1.2.2")
    implementation("com.amazonaws:aws-lambda-java-events:3.11.2")
    implementation("software.amazon.lambda:powertools-logging:$powertoolsVersion")
    implementation("software.amazon.lambda:powertools-metrics:$powertoolsVersion")
}

tasks.test {
    useJUnitPlatform()
}
