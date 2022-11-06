package com.fabianospdev.daggerinjection.ui.di

import androidx.lifecycle.ViewModel
import com.fabianospdev.daggerinjection.api.data.di.ViewModelKey
import com.fabianospdev.daggerinjection.ui.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel
}