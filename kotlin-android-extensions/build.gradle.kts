
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}
android {
    compileSdk =libs.versions.compileSdk.get().toInt()
    namespace = "io.github.uhsk.kit"
    defaultConfig {
        minSdk =libs.versions.minSdk.get().toInt()
        testInstrumentationRunner= "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled= false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    compileOnly ( libs.androidx.core)
    compileOnly (libs.androidx.appcompat)
    implementation (libs.common.io)
    implementation (libs.common.lang)
    testImplementation (libs.test.junit)
    androidTestImplementation (libs.test.android.ext)
    androidTestImplementation ( libs.test.android.espresso)
}
