package com.github.calo001.simpledaggerexample.utils

import android.app.Activity
import com.github.calo001.simpledaggerexample.interfaces.ComponentProvider

val Activity.injector get() = (application as ComponentProvider).component