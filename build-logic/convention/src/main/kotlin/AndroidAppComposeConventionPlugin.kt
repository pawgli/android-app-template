import com.android.build.api.dsl.ApplicationExtension
import io.github.pawgli.configuration.configureCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidAppComposeConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      pluginManager.apply("com.android.application")

      configure<ApplicationExtension> {
        configureCompose(extension = this)
      }
    }
  }
}
