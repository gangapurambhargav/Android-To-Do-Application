package com.example.android_to_do_application.Model.Store

import android.graphics.HardwareRenderer
import com.example.android_to_do_application.Model.Action
import android.arch.core.util.Function
import android.opengl.GLSurfaceView

interface Store<T>{
    fun dispatch(action: Action)
    fun subscribe(renderer: Renderer<T>, func: Function<T, T>= Function { it })
}