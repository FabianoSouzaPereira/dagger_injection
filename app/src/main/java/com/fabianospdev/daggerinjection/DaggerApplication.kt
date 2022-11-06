package com.fabianospdev.daggerinjection

import android.app.Application
import com.fabianospdev.daggerinjection.api.data.di.DaggerApplicationComponent

class DaggerApplication: Application() {
    val appComponent = DaggerApplicationComponent.factory().create(this)
}