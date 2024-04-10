import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.variant.LibraryAndroidComponentsExtension
import io.github.pawgli.configuration.configureKotlin
import io.github.pawgli.configuration.configureSdkVersions
import io.github.pawgli.configuration.configureTest
import io.github.pawgli.configuration.disableUnnecessaryAndroidTests
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConventionPlugin : Plugin<Project> {

  override fun apply(target: Project) {
    with(target) {
      with(pluginManager) {
        apply("com.android.library")
        apply("org.jetbrains.kotlin.android")
      }

      configureKotlin()
      configureTest()
      configure<LibraryAndroidComponentsExtension> {
        disableUnnecessaryAndroidTests(extension = this)
      }
      configure<LibraryExtension> {
        configureSdkVersions(extension = this)
      }
    }
  }
}
