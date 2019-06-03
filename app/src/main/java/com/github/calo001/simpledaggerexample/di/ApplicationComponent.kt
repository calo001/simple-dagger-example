package com.github.calo001.simpledaggerexample.di

import com.github.calo001.simpledaggerexample.models.Profile
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface ApplicationComponent {
    val profile: Profile
}