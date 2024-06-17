# Android App Template

This project is a template for an Android application, set up with all the basic convention plugins and a version catalog. It uses Kotlin as the main programming language and Gradle for build automation. The project is also set up with JUnit Jupiter and Kotest for testing, and Detekt for code quality checks.

## 🚀 Usage

To create a new project using this template, click on a `Use this project` button.

## 🛠️ Technologies Used

- **Android Compose**: The project uses [Jetpack Compose](https://developer.android.com/jetpack/compose), a modern toolkit for building native Android UI.
- **JUnit Jupiter and Kotest**: Used for testing. You can find more information in the [JUnit Jupiter](https://junit.org/junit5/docs/current/user-guide/) and [Kotest](https://kotest.io/docs/framework/framework.html) documentation.
- **Detekt**: Used for code quality checks. Check out the [Detekt](https://detekt.github.io/detekt/) documentation for more details.

## 📏 Convention Plugins

The project uses several convention plugins to standardize the build process and ensure consistency across the project.

All the plugins are defined in the `build-logic/convention/build.gradle.kts`, and added to the version catalog, so they can be referred by their aliases in a module's `build.gradle.kts` file.

### 📱 Android application module

```kotlin
plugins {
  alias(libs.plugins.convention.android.app)
  alias(libs.plugins.convention.android.app.compose) // Only if compose is used in the module
}

android {
  namespace = "com.example.projectname.modulename"

  // The rest of the application setup
}
```

### 📚 Android library module

```kotlin
plugins {
  alias(libs.plugins.convention.android.library)
  alias(libs.plugins.convention.android.library.compose) // Only if compose is used in the module
}

android {
  namespace = "com.example.projectname.modulename"
}
```

### ☕ JVM module

```kotlin
plugins {
  alias(libs.plugins.convention.jvm.library)
}
```
