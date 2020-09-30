package com.xwjr.jetpack

import android.os.Bundle
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import com.xwjr.frame.extension.logI

class IndexFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback {
           logI("返回事件")
        }

        requireActivity().onBackPressedDispatcher.addCallback {
            logI("返回事件2")
        }
    }

}