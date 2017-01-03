package cn.helloyy.devtools.demo

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast

import cn.helloyy.devtools.R
import org.jetbrains.anko.*

class KotlinFirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_kotlin_first)
//        val toolbar = findViewById(R.id.toolbar) as Toolbar
//        setSupportActionBar(toolbar)
//
//        val fab = findViewById(R.id.fab) as FloatingActionButton
//        fab.setOnClickListener(View.OnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        })
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        verticalLayout {
            padding = dip(30)
            val name = editText {
                hint = "Name"
                textSize = 24f
            }
            val password = editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                textSize = 26f
                //onClick { Toast.makeText(this@KotlinFirstActivity, "${name.text},${password.text}", Toast.LENGTH_SHORT).show() }
                onClick {toast("${name.text},${password.text}")}
            }
        }
    }

}
