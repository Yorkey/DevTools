package cn.helloyy.devtools

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {

    //private var container: ViewGroup? = null

    private var lastBackPress: Long = 0L

    private var router: Router? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val container = findViewById(R.id.controller_container) as ViewGroup

        router = Conductor.attachRouter(this, container, savedInstanceState)

        if (router?.hasRootController() == false) {

        }

    }

    override fun onBackPressed() {
        if (router?.handleBack() == false) {
            val now = Date().time
            if (now - lastBackPress > 2000) {
                lastBackPress = now
                toast("再按一次退出应用")
            } else {
                super.onBackPressed()
            }
        }
    }
}
