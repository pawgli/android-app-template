package io.github.pawgli.configuration

import com.android.build.api.dsl.CommonExtension
import io.github.pawgli.utils.getAsString
import io.github.pawgli.utils.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureCompose(
  extension: CommonExtension<*, *, *, *, *, *>,
) {
  extension.apply {
    buildFeatures {
      compose = true
    }

    composeOptions {
      kotlinCompilerExtensionVersion = libs.findVersion("composeCompiler").getAsString()
    }
  }

  dependencies {
    val bom = libs.findLibrary("compose-bom").get()
    add("implementation", platform(bom))
    add("implementation", libs.findLibrary("compose-ui").get())
    add("implementation", libs.findLibrary("compose-material3").get())
    add("implementation", libs.findLibrary("compose-uiPreview").get())
    add("debugImplementation", libs.findLibrary("compose-uiTooling").get())
  }
}
