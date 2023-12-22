plugins {
  id("convention.android.app")
}

android {
  namespace = "io.github.pawgli.daggercomposelibrary"

  defaultConfig {
    applicationId = "io.github.pawgli.daggercomposelibrary"
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.7"
  }
}

dependencies {
  implementation(libs.androidx.activityCompose)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.ui)
  implementation(libs.compose.uiPreview)
  implementation(libs.material3)
  debugImplementation(libs.compose.uiTooling)

  testImplementation(libs.bundles.testSuite)
}
