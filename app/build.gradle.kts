plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Deps.Android.compileSdkVersion)
    buildToolsVersion(Deps.Android.buildToolsVersion)
    defaultConfig {
        applicationId = AppInfo.id
        setMinSdkVersion(Deps.Android.minSdkVersion)
        setTargetSdkVersion(Deps.Android.compileSdkVersion)
        versionCode = AppInfo.Version.code
        versionName = AppInfo.Version.name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Deps.Kotlin.stdLib)
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.coreKtx)
    testImplementation(Deps.Test.JUnit.junit)
    androidTestImplementation(Deps.Test.JUnit.testRunner)
    androidTestImplementation(Deps.Test.Espresso.espresso)
}
