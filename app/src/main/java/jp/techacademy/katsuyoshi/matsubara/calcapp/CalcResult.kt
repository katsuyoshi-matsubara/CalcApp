package jp.techacademy.katsuyoshi.matsubara.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_result.*

class CalcResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_result)

        val result = intent.getDoubleExtra("RESULT", 0.0)

        textView.text = result.toString()
    }
}
