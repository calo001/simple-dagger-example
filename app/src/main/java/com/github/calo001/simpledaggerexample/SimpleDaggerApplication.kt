package com.github.calo001.simpledaggerexample

import android.app.Application
import com.github.calo001.simpledaggerexample.di.ApplicationComponent
import com.github.calo001.simpledaggerexample.di.DaggerApplicationComponent
import com.github.calo001.simpledaggerexample.interfaces.ComponentProvider

class SimpleDaggerApplication : Application(), ComponentProvider {
    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }
}