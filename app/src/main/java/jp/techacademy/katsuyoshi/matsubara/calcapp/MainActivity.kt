package jp.techacademy.katsuyoshi.matsubara.calcapp

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, CalcResult::class.java)

        val input1: Double
        val input2: Double
        try {
            input1 = editText1.text.toString().toDouble()
            input2 = editText2.text.toString().toDouble()

            when (v?.id) {
                R.id.button1 -> intent.putExtra("RESULT", input1 + input2)
                R.id.button2 -> intent.putExtra("RESULT", input1 - input2)
                R.id.button3 -> intent.putExtra("RESULT", input1 * input2)
                R.id.button4 -> intent.putExtra("RESULT", input1 / input2)
            }


            startActivity(intent)

        } catch (e: Exception) {
            /* val s = "error"
            when (v?.id) {
                R.id.button1 -> button1.setOnClickListener { view -> */
                    Snackbar.make(button1, "error", Snackbar.LENGTH_LONG)
                        .setAction("Hide") {
                        }.show()
          /*      }
                R.id.button2 -> button2.setOnClickListener { view ->
                    Snackbar.make(view, s, Snackbar.LENGTH_LONG)
                        .setAction("Hide") {
                        }.show()
                }
                R.id.button3 -> button3.setOnClickListener { view ->
                    Snackbar.make(view, s, Snackbar.LENGTH_LONG)
                        .setAction("Hide") {
                        }.show()
                }
                R.id.button4 -> button4.setOnClickListener { view ->
                    Snackbar.make(view, s, Snackbar.LENGTH_LONG)
                        .setAction("Hide") {
                        }.show()
                }
            } */

            println(e)
        }
    }

}




