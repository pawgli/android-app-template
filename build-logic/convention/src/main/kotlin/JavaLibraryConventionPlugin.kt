import io.github.pawgli.configuration.configureKotlin
import io.github.pawgli.configuration.configureTest
import org.gradle.api.Plugin
import org.gradle.api.Project

class JavaLibraryConventionPlugin : Plugin<Project> {

  override fun apply(target: Project) = with(target) {
    with(pluginManager) {
      apply("org.jetbrains.kotlin.jvm")
    }

    configureKotlin()
    configureTest()
  }
}
