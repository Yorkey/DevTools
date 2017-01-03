package cn.helloyy.devtools.layout

import android.view.View
import cn.helloyy.devtools.base.ViewBinder
import cn.helloyy.devtools.controller.HomeViewController
import org.jetbrains.anko.UI
import org.jetbrains.anko.horizontalGravity
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

/**
 * Created by wangyu on 2017/1/3.
 */
class HomeViewLayout : ViewBinder<HomeViewController> {

    override fun bind(homeView: HomeViewController): View {
//        return homeView.activity.UI {
//
//        }
    }

    override fun unbind(t: HomeViewController) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}