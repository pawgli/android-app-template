plugins {
  with(libs.plugins) {
    alias(convention.android.app)
    alias(convention.android.app.compose)
  }
}

android {
  namespace = "io.github.pawgli.androidapptemplate"

  defaultConfig {
    applicationId = "io.github.pawgli.androidapptemplate"
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
}

dependencies {
  implementation(libs.androidx.activityCompose)

  testImplementation(libs.bundles.testSuite)
}
