package com.jonesl7l.testapplication

import android.app.Application
import android.content.Context

class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
    }
}