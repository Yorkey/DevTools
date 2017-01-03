package cn.helloyy.devtools.base

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import cn.helloyy.devtools.R
import org.jetbrains.anko.appcompat.v7.navigationIconResource

/**
 * Created by wangyu on 2016/12/30.
 */
abstract class ControllerWithToolbar(args: Bundle?) : BaseController(args) {

    protected var toolbar : Toolbar? = null

    protected open var title: String? = null


    fun setTitle() {
        toolbar?.title = title
    }


    override fun onViewBound(view: View) {
        setTitle()
        super.onViewBound(view)
    }

    protected fun showBackNavigator() {
        toolbar?.navigationIconResource = R.drawable.back
        toolbar?.setNavigationOnClickListener {
            router.popCurrentController()
        }
    }


}