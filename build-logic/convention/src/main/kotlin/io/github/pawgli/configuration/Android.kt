@file:Suppress("MagicNumber")

package io.github.pawgli.configuration

import com.android.build.api.dsl.CommonExtension
import io.github.pawgli.ConventionDefaults
import org.gradle.api.Project

internal fun Project.configureSdkVersions(
  extension: CommonExtension<*, *, *, *, *>,
  minSdk: Int = ConventionDefaults.MinSdk,
) {
  extension.apply {
    compileSdk = ConventionDefaults.CompileSdk

    defaultConfig {
      this.minSdk = minSdk
    }
  }
}
