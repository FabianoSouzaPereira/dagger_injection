package com.fabianospdev.daggerinjection.ui.di

import com.fabianospdev.daggerinjection.ui.login.LoginActivity
import com.fabianospdev.daggerinjection.ui.main.FirstFragment
import com.fabianospdev.daggerinjection.ui.main.MainActivity
import com.fabianospdev.daggerinjection.ui.main.SecondFragment
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: FirstFragment)
    fun inject(fragment: SecondFragment)
    fun inject(activity: LoginActivity)

}