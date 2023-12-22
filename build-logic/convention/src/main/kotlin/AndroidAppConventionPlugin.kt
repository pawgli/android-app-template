import com.android.build.api.dsl.ApplicationExtension
import io.github.pawgli.ConventionDefaults
import io.github.pawgli.configuration.configureKotlin
import io.github.pawgli.configuration.configureSdkVersions
import io.github.pawgli.configuration.configureTest
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidAppConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      with(pluginManager) {
        apply("com.android.application")
        apply("org.jetbrains.kotlin.android")
      }

      configureKotlin()
      configureTest()
      configure<ApplicationExtension> {
        defaultConfig.targetSdk = ConventionDefaults.TargetSdk
        configureSdkVersions(extension = this)
      }
    }
  }
}
