package cn.helloyy.devtools.controller

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.helloyy.devtools.R
import cn.helloyy.devtools.base.BaseController
import org.jetbrains.anko.appcompat.v7.titleResource
import org.jetbrains.anko.find

/**
 * Created by wangyu on 2017/1/3.
 */
class HomeViewController(args: Bundle?) : BaseController(args) {

    override fun bindView(inflater: LayoutInflater, container: ViewGroup): View {
        var view : View = inflater.inflate(R.layout.controller_home, container, false);
        return view;
    }

    override fun onViewBound(view: View) {
        super.onViewBound(view)

        val toolbar = view.find<Toolbar>(R.id.toolbar)
        toolbar.titleResource = R.string.title_controller_home
    }
}