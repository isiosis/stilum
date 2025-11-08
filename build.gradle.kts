plugins {
    `maven-publish`
    signing
    id("org.jetbrains.dokka") version "1.9.20" apply false
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

allprojects {
    group = providers.gradleProperty("GROUP").get()
    version = providers.gradleProperty("VERSION_NAME").get()
}

nexusPublishing {
    repositories {
        sonatype {
            // Use the Central Portal compatibility endpoints:
            nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))

            username.set(property("OSSRH_USERNAME") as String)
            password.set(property("OSSRH_PASSWORD") as String)
        }
    }
}
