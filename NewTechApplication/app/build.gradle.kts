plugins {
    alias(libs.plugins.convention.application)
}

android {
    namespace = "com.example.newtechapplication"

    defaultConfig {
        applicationId = "com.example.newtechapplication"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":main_screen"))
    implementation(project(":base_resources"))
}