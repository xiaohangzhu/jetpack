package com.xwjr.jetpack.jetpack.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.xwjr.frame.extension.logI
import com.xwjr.frame.fragment.BaseFragment
import com.xwjr.jetpack.R
import com.xwjr.jetpack.extension.showOnBackPressPop
import kotlinx.android.synthetic.main.fragment_on_back_press.*

class OnBackPressFragment : BaseFragment() {
    private var backListener: OnBackPressedCallback? = null
    private var backListener2: OnBackPressedCallback? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_on_back_press, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initBackListener()
        onBackClickListener()
        setClickListener()
    }

    private fun setClickListener() {
        tv_button.setOnClickListener {
            context?.showOnBackPressPop(this)
        }
    }

    private fun initBackListener() {
        backListener = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                logI("点击事件1")
                backListener?.isEnabled = false
                backListener2?.isEnabled = true
            }
        }

        backListener2 = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                logI("点击事件2")
                backListener?.isEnabled = true
                backListener2?.isEnabled = false
            }
        }
        backListener2?.handleOnBackPressed()
        backListener2?.remove()
    }

    private fun onBackClickListener() {
        requireActivity().onBackPressedDispatcher.addCallback(backListener2!!)
        requireActivity().onBackPressedDispatcher.addCallback(backListener!!)
    }
}