pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // Mapbox Maven repository
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            // Do not change the username below. It should always be "mapbox" (not your username).
            credentials.username = "mapbox"
            // Use the secret token stored in gradle.properties as the password
//
//            providers.gradleProperty("MAPBOX_DOWNLOADS_TOKEN").get()
            credentials.password = "sk.eyJ1IjoiZmFyaWR3YWpkaWEiLCJhIjoiY20wMGs1Y3JvMW01YzJpc2ZndXFxYndtcCJ9.BHkIbbk6SkHVKj7uvrClVA"
            authentication.create<BasicAuthentication>("basic")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            // Do not change the username below. It should always be "mapbox" (not your username).
            credentials.username = "mapbox"
            // Use the secret token stored in gradle.properties as the password
//
//            providers.gradleProperty("MAPBOX_DOWNLOADS_TOKEN").get()
            credentials.password = "sk.eyJ1IjoiZmFyaWR3YWpkaWEiLCJhIjoiY20wMGs1Y3JvMW01YzJpc2ZndXFxYndtcCJ9.BHkIbbk6SkHVKj7uvrClVA"
            authentication.create<BasicAuthentication>("basic")
        }
    }
}

rootProject.name = "MapBox_tutor"
include(":app")
 