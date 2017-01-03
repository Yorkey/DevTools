package cn.helloyy.devtools.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller


/**
 * Created by wangyu on 2016/12/30.
 */
abstract class BaseController(args: Bundle?) : Controller(args) {

    abstract fun bindView(inflater : LayoutInflater, container : ViewGroup) : View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        var view = bindView(inflater, container)
        onViewBound(view)
        return view
    }

    open fun onViewBound(view : View) {

    }
}