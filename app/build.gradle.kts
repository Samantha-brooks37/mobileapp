plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.android.application")
    id("com.google.gms.google-services")

}

android {
    namespace = "com.example.itmobileapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.itmobileapp"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Firebase
    implementation 'com.google.firebase:firebase-database:20.0.5'
    implementation 'com.google.firebase:firebase-auth:21.0.3'
    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
    implementation 'com.facebook.android:facebook-android-sdk:12.3.0'
    implementation 'com.twitter.sdk.android:twitter-core:3.1.1'
    implementation 'com.instagram.android:instagram-sdk:1.0.0'


    // UI Components
    implementation("com.google.firebase:firebase-analytics")
    implementation 'com.google.android.material:material:1.3.0'
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(project(":app"))
    implementation(project(":app"))
    implementation(project(":app"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}