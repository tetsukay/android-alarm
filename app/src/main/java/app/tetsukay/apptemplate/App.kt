package app.tetsukay.apptemplate

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}

