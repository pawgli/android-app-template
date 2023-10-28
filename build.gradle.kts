import io.gitlab.arturbosch.detekt.Detekt

plugins {
  alias(libs.plugins.android.app) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.detekt)
}
// a
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
