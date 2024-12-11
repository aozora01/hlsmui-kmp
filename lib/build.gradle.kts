import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    kotlin("multiplatform")
//    id("org.jetbrains.kotlin.multiplatform").version("2.0.21")


    id("com.android.library")
//    id("org.jetbrains.compose")
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")

    id("org.jetbrains.compose").version("1.7.0")
    id("org.jetbrains.kotlin.plugin.compose").version("2.0.21")

}


kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    js {
        browser()
        binaries.executable()
    }

    jvm("desktop")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "lib"
            isStatic = true
        }
    }

    sourceSets {
        @OptIn(ExperimentalComposeLibrary::class)
        val commonMain by getting {
            dependencies {
//                implementation("org.jetbrains.androidx.navigation:navigation-compose:2.8.0-alpha10")
                implementation("br.com.devsrsouza.compose.icons:font-awesome:1.1.1")
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.components.resources)



            }
        }
        val androidMain by getting {
            dependencies {
            }
        }

        val jsMain by getting {
            dependencies
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val desktopMain by getting {
            dependencies {
            }
        }
    }
}

android {
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
    namespace = "com.myapplication.common"

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}


mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        groupId = "io.github.aozora01",
        artifactId = "hlsmui",
        version = "1.0.58"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("KMP Library for saving data to the clipboard")
        description.set("This library can be used by Android and iOS targets for the shared functionality of saving data to the clipboard")
        inceptionYear.set("2024")
        url.set("https://github.com/aozora01/hlsmui")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        // Specify developer information
        developers {
            developer {
                id.set("aozora01")
                name.set("aozora")
                email.set("aozoralangitbiru@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/aozora01/hlsmui")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}

//mavenPublishing {
////    publishToMavenCentral(SonatypeHost.DEFAULT)
//    // or when publishing to https://s01.oss.sonatype.org
//    publishToMavenCentral(SonatypeHost.S01, automaticRelease = true)
//    signAllPublications()
//    coordinates("com.example.mylibrary", "mylibrary-runtime", "1.0.0")
//
//    pom {
//        name.set(project.name)
//        description.set("A description of what my library does.")
//        inceptionYear.set("2023")
//        url.set("https://github.com/username/mylibrary/")
//        licenses {
//            license {
//                name.set("The Apache License, Version 2.0")
//                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//            }
//        }
//        developers {
//            developer {
//                id.set("username")
//                name.set("User Name")
//                url.set("https://github.com/username/")
//            }
//        }
//        scm {
//            url.set("https://github.com/username/mylibrary/")
//            connection.set("scm:git:git://github.com/username/mylibrary.git")
//            developerConnection.set("scm:git:ssh://git@github.com/username/mylibrary.git")
//        }
//    }
//}
