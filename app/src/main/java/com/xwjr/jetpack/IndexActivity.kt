package com.xwjr.jetpack

import android.content.Intent
import android.os.Bundle
import com.xwjr.frame.activity.BaseActivity
import com.xwjr.jetpack.jetpack.activity.OnBackPressActivity
import kotlinx.android.synthetic.main.activity_index.*

class IndexActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        setClickListener()
    }

    private fun setClickListener() {
        activity.setOnClickListener {
            startActivity(Intent(this, OnBackPressActivity::class.java))
        }
    }

}
