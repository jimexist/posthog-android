import org.gradle.api.JavaVersion

object PosthogBuildConfig {
    fun shouldSkipDebugVariant(name: String): Boolean {
        return System.getenv("CI")?.toBoolean() ?: false && name == "debug"
    }

    object Build {
        // should it be 1.8 still?
        val JAVA_VERSION = JavaVersion.VERSION_11
    }

    object Android {
        val COMPILE_SDK = 34
        val MIN_SDK = 21
        val TARGET_SDK = COMPILE_SDK
    }

    object Kotlin {
        // compiler has to match kotlin version
        // https://developer.android.com/jetpack/androidx/releases/compose-kotlin
        val COMPILER_EXTENSION_VERSION = "1.4.3" // kotlin 1.8.10

        val KOTLIN_COMPATIBILITY = "1.5"

        // also update buildSrc/gradle.kts - kotlinVersion
        val KOTLIN = "1.8.10"
    }

    object Plugins {
        val SPOTLESS = "6.21.0"
        val DETEKT = "1.23.1"
        val API_VALIDATOR = "0.13.2"
        val BUILD_CONFIG = "4.1.2"
    }

    object Dependencies {
        // runtime
        val LIFECYCLE = "2.6.2"
        val GSON = "2.10.1"
        val OKHTTP = "4.11.0"

        // tests
        val ANDROIDX_JUNIT = "1.1.5"
        val ANDROIDX_RUNNER = "1.5.2"
        val ANDROIDX_CORE = "1.5.0"
        val MOCKITO = "5.1.0"
        val MOCKITO_INLINE = "5.2.0"
        val ROBOLECTRIC = "4.10.3"
    }
}