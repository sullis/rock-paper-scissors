plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

val powertoolsVersion = "1.20.2"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.0"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:33.4.8-jre")
    implementation("com.amazonaws:aws-lambda-java-core:1.3.0")
    implementation("com.amazonaws:aws-lambda-java-events:3.15.0")
    implementation("software.amazon.lambda:powertools-logging:$powertoolsVersion")
    implementation("software.amazon.lambda:powertools-metrics:$powertoolsVersion")
}

tasks.test {
    useJUnitPlatform()
}
