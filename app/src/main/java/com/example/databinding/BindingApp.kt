package com.example.databinding

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BindingApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BindingApp)
            modules(appModules)
        }
    }
}