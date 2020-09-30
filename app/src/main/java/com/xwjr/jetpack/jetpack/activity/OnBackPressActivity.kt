package com.xwjr.jetpack.jetpack.activity

import android.os.Bundle
import com.xwjr.frame.activity.BaseActivity
import com.xwjr.frame.extension.addFragment
import com.xwjr.jetpack.R
import kotlinx.android.synthetic.main.activity_on_back_press.*

class OnBackPressActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_back_press)

        setClickListener()
    }

    private fun setClickListener() {
        tv_button.setOnClickListener {
            addFragment(OnBackPressFragment(), R.id.frame_layout)
        }
    }
}
