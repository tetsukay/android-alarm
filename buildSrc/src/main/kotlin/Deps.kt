object Deps {

    object Kotlin {
        private const val version = "1.3.50"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }

    object Android {
        const val androidGradlePlugin = "com.android.tools.build:gradle:3.5.1"
        const val compileSdkVersion = 29
        const val buildToolsVersion = "29.0.1"
        const val minSdkVersion = 23
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.1.0"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
    }

    object Dagger {
        const val dagger = "2.24"
    }

    object Test {

        object Espresso {
            const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
        }

        object JUnit {
            const val junit = "junit:junit:4.12"
            const val testRunner = "androidx.test:runner:1.2.0"
        }
    }
}
