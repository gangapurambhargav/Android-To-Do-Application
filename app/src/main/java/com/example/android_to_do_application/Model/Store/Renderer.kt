package com.example.android_to_do_application.Model.Store

import androidx.lifecycle.LiveData

interface Renderer<T> {
    fun render(model: LiveData<T>)
}