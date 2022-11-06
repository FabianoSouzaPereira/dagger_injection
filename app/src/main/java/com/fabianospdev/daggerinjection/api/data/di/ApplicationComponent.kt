package com.fabianospdev.daggerinjection.api.data.di

import android.content.Context
import com.fabianospdev.daggerinjection.ui.di.MainComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Component(modules = [DataModule::class, ViewModelBuilder::class, SubComponentsModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }

    fun mainComponent(): MainComponent.Factory
}

@Module(subcomponents = [MainComponent::class])
object SubComponentsModule
