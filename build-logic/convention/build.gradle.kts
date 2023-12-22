plugins {
  `kotlin-dsl`
}

kotlin {
  jvmToolchain(17)
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.kotlin.gradle)
}

gradlePlugin {
  plugins {
    register("AndroidAppConventionPlugin") {
      id = "convention.android.app"
      implementationClass = "AndroidAppConventionPlugin"
    }
  }
}
