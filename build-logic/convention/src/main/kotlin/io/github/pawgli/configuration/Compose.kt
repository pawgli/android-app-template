package io.github.pawgli.configuration

import com.android.build.api.dsl.CommonExtension
import io.github.pawgli.utils.getLibrary
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureCompose(
  extension: CommonExtension<*, *, *, *, *, *>,
) {
  extension.apply {
    buildFeatures {
      compose = true
    }
  }

  dependencies {
    val bom = getLibrary("compose-bom")
    add("implementation", platform(bom))
    add("implementation", getLibrary("compose-ui"))
    add("implementation", getLibrary("compose-material3"))
    add("implementation", getLibrary("compose-uiPreview"))
    add("debugImplementation", getLibrary("compose-uiTooling"))
  }
}
