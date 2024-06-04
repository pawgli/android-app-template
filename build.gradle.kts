import io.gitlab.arturbosch.detekt.Detekt

plugins {
  with(libs.plugins) {
    alias(android.app) apply false
    alias(kotlin.android) apply false
    alias(compose) apply false
    alias(compose.compiler) apply false
    alias(detekt)

    // Convention plugins
    alias(convention.android.app) apply false
    alias(convention.android.app.compose) apply false
    alias(convention.android.library) apply false
    alias(convention.android.library.compose) apply false
    alias(convention.jvm.library) apply false
  }
}

dependencies {
  detektPlugins(libs.detekt.formatting)
}

detekt {
  allRules = false
  autoCorrect = true
  parallel = true
  buildUponDefaultConfig = true
  source.setFrom(projectDir)
  config.setFrom("$projectDir/detekt.yml")
}

tasks.withType<Detekt>().configureEach {
  jvmTarget = libs.versions.java.get()
  exclude("**/test/**", "**/androidTest/**", "**/build/**")
  reports {
    html.required.set(false)
    xml.required.set(true)
    txt.required.set(false)
    sarif.required.set(false)
    md.required.set(false)
  }
}
