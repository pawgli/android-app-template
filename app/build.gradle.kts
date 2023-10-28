plugins {
  alias(libs.plugins.android.app)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "io.github.pawgli.daggercomposelibrary"
  compileSdk = 34

  defaultConfig {
    applicationId = "io.github.pawgli.daggercomposelibrary"
    minSdk = 30
    targetSdk = 34
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
  kotlin {
    jvmToolchain(jdkVersion = 17)
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.3"
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
