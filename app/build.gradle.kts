plugins {
  id("AndroidAppConventionPlugin")
  id("AndroidAppComposeConventionPlugin")
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
}

dependencies {
  implementation(libs.androidx.activityCompose)

  testImplementation(libs.bundles.testSuite)
}
