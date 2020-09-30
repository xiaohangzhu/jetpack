package com.xwjr.jetpack.extension

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.view.Gravity
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.fragment.app.Fragment
import com.xwjr.frame.extension.logI
import com.xwjr.jetpack.R


@SuppressLint("SetTextI18n")
fun Context.showOnBackPressPop(
        fragment: Fragment,
        dismiss: (() -> Unit)? = null,
        deal: (() -> Unit)? = null
) {
    try {
        val view = View.inflate(this, R.layout.pop_common_tip, null)
        val popupWindow = PopupWindow(
                view,
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        )
        popupWindow.apply {
            isFocusable = true
            isOutsideTouchable = true
            isTouchable = true
        }
        view.isFocusable = true // 这个很重要
        view.isFocusableInTouchMode = true
        view.setOnKeyListener { _, keyCode, _ ->
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                logI("点击事件被消费")
                true
            } else {
                false
            }
        }

        popupWindow.setOnDismissListener {
            if (dismiss != null) dismiss()
        }

        popupWindow.apply {
            isFocusable = true
            isOutsideTouchable = true
            isTouchable = true
            setBackgroundDrawable(BitmapDrawable())
            showAtLocation(view, Gravity.CENTER, 0, 0)
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }
}