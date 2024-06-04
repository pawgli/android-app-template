package io.github.pawgli.configuration

import io.github.pawgli.utils.getVersion
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension

internal fun Project.configureKotlin() {
  kotlinExtension.apply {
    jvmToolchain(jdkVersion = getVersion("java").toInt())
  }
}
