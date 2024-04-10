package io.github.pawgli.configuration

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType

internal fun Project.configureTest() {
  tasks.withType<Test> {
    useJUnitPlatform()
  }
}

@Suppress("UnstableApiUsage")
internal fun Project.disableUnnecessaryAndroidTests(
  extension: LibraryAndroidComponentsExtension
) {
  extension.beforeVariants {
    it.androidTest.enable = it.androidTest.enable && projectDir.resolve("src/androidTest").exists()
  }
}
