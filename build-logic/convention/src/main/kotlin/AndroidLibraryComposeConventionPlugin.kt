import com.android.build.api.dsl.LibraryExtension
import io.github.pawgli.configuration.configureCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

  override fun apply(target: Project) = with(target) {
    pluginManager.apply("com.android.library")

    configure<LibraryExtension> {
      configureCompose(extension = this)
    }
  }
}
