plugins {
  `kotlin-dsl`
}

kotlin {
  jvmToolchain(17)
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.kotlin.gradle)
}

gradlePlugin {
  plugins {
    registerConvention("AndroidAppConventionPlugin")
    registerConvention("AndroidAppComposeConventionPlugin")
  }
}

fun NamedDomainObjectContainer<PluginDeclaration>.registerConvention(name: String) {
  register(name) {
    id = name
    implementationClass = name
  }
}
