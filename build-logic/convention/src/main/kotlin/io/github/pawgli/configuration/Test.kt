package io.github.pawgli.configuration

import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.withType

internal fun Project.configureTest() {
  tasks.withType<Test> {
    useJUnitPlatform()
  }
}
