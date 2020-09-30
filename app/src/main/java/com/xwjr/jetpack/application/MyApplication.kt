package com.xwjr.jetpack.application

import android.app.Application
import com.xwjr.frame.extension.ExtensionConfig

class MyApplication :Application(){
    override fun onCreate() {
        super.onCreate()

        ExtensionConfig.dev = true
    }
}