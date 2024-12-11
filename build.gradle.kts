plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
//    id("org.jetbrains.compose").apply(false)

//    id("org.jetbrains.kotlin.multiplatform") version "2.0.21"
    id("org.jetbrains.compose").version("1.7.0").apply(false)
    id("org.jetbrains.kotlin.plugin.compose").version("2.0.21").apply(false)


    id("com.vanniktech.maven.publish") version "0.28.0"
    id("org.jetbrains.dokka")
    id("org.jlleitschuh.gradle.ktlint")
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint") // Version should be inherited from parent

    // Optionally configure plugin
    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        version.set("1.0.1")
    }
}

tasks.register<Copy>("setUpGitHooks") {
    group = "help"
    from("$rootDir/.hooks")
    into("$rootDir/.git/hooks")
}
