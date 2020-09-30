package com.xwjr.frame.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xwjr.frame.extension.logI

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logI("当前activity:${this.javaClass.name}")
    }
}