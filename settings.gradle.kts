pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        mavenCentral()
        // for Avro plugin
        maven(url = "https://dl.bintray.com/gradle/gradle-plugins")
    }
}

rootProject.name = "kotlin-design-patterns"

include("kommons-logging")
include("kommons-junit-jupiter")

include("abstract-document")
include("abstract-factory")
include("acycle-visitor")