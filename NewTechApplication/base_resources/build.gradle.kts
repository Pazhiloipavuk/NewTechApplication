plugins {
    alias(libs.plugins.convention.library)
}

android {
    namespace = "com.example.base_resources"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(libs.com.google.android.material)
}