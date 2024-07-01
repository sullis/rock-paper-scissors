plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

val powertoolsVersion = "1.18.0"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:33.2.1-jre")
    implementation("com.amazonaws:aws-lambda-java-core:1.2.3")
    implementation("com.amazonaws:aws-lambda-java-events:3.11.6")
    implementation("software.amazon.lambda:powertools-logging:$powertoolsVersion")
    implementation("software.amazon.lambda:powertools-metrics:$powertoolsVersion")
}

tasks.test {
    useJUnitPlatform()
}
