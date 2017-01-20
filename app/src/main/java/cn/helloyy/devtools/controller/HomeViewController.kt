package cn.helloyy.devtools.controller

import android.os.Build
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.helloyy.devtools.R
import cn.helloyy.devtools.base.BaseController
import org.jetbrains.anko.appcompat.v7.titleResource
import org.jetbrains.anko.find
import kotlinx.android.synthetic.main.controller_home.view.*
import org.jetbrains.anko.image
import org.jetbrains.anko.imageResource

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

        view.headerIcon.imageResource = when(Build.VERSION.SDK_INT) {
            24 -> R.drawable.nougat
            23 -> R.drawable.marshmallow
            21,22 -> R.drawable.lollipop
            20 -> R.drawable.kitkat
            else -> R.drawable.default_android
        }

        view.headerTitle.text = android.os.Build.MODEL
    }
}