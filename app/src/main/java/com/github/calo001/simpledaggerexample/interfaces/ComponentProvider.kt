package com.github.calo001.simpledaggerexample.interfaces

import com.github.calo001.simpledaggerexample.di.ApplicationComponent

interface ComponentProvider {
    val component: ApplicationComponent
}