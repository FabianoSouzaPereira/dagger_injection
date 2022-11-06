package com.fabianospdev.daggerinjection.api.data.di

import com.fabianospdev.daggerinjection.api.data.repository.DefaultRepository
import com.fabianospdev.daggerinjection.api.data.repository.Repository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun provideDefaultDataSource(repository: DefaultRepository): Repository
}