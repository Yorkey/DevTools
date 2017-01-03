package cn.helloyy.devtools.base

import android.view.View

/**
 * Created by wangyu on 2017/1/3.
 */
interface ViewBinder<in T> {
    fun bind(t: T) : View
    fun unbind(t: T)
}