package com.xwjr.frame.extension

import android.util.Log

private const val TAG = "JetPack"
/**
 * 日志打印扩展
 */
fun Any?.logI(content: String) {
    try {
        if (ExtensionConfig.dev) {
            Log.i(TAG, content)
        }
    } catch (e: Exception) {
        Log.i(TAG, "日志打印错误")
        e.printStackTrace()
    }
}

/**
 * 日志打印扩展
 */
fun Any?.logE(content: String) {
    try {
        if (ExtensionConfig.dev) {
            Log.e(TAG, content)
        }
    } catch (e: Exception) {
        Log.e(TAG, "日志打印错误")
        e.printStackTrace()
    }
}

