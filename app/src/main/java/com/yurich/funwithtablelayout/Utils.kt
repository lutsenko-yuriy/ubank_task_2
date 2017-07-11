@file:JvmName("Utils")
package com.yurich.funwithtablelayout

import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by yurich on 11.07.17.
 */
fun ViewGroup.inflate(resId: Int, attachToRoot: Boolean = false)
        = LayoutInflater.from(context).inflate(resId, this, attachToRoot)

operator fun  String.times(count: Int): String {
    val builder = StringBuilder(this)
    for (i in 1..count - 1) {
        builder.append(this)
    }
    return builder.toString()
}