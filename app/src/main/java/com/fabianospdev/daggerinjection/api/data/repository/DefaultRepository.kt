package com.fabianospdev.daggerinjection.api.data.repository

import android.util.Log

class DefaultRepository: Repository {
    override fun login() {
        Log.d("DefaultRepository", "Login Done")
    }

}