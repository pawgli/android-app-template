@file:Suppress("MagicNumber")

package io.github.pawgli.configuration

import com.android.build.api.dsl.ApplicationExtension
import io.github.pawgli.ConventionDefaults

internal fun configureSdkVersions(
  extension: ApplicationExtension,
  minSdk: Int = ConventionDefaults.MinSdk,
) {
  extension.apply {
    compileSdk = ConventionDefaults.CompileSdk

    defaultConfig {
      this.minSdk = minSdk
    }
  }
}
