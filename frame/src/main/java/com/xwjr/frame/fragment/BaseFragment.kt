package com.xwjr.frame.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.xwjr.frame.extension.logI

open class BaseFragment :Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logI("当前fragment ${this.javaClass.name}")
    }
}