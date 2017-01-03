package cn.helloyy.devtools

import android.app.Application
import be.shouldit.proxy.lib.APL
import timber.log.Timber

/**
 * Created by wangyu on 2016/12/17.
 */
class App : Application() {

    companion object {
        private var instance: App? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        Timber.plant(Timber.DebugTree())

        APL.setup(this)
    }
}