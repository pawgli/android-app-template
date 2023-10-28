warn("Big PR") if git.lines_of_code > 500

# detekt
checkstyle_format.base_path = Dir.pwd
checkstyle_format.report "build/reports/detekt/detekt.xml"

# AndroidLint
android_lint.report_file = "app/build/reports/lint-results-debug.xml"
android_lint.skip_gradle_task = true
android_lint.lint(inline_mode: true)

github.dismiss_out_of_range_messages