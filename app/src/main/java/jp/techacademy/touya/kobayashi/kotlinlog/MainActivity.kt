package jp.techacademy.touya.kobayashi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 23, "読書")

        human1.say()
        human1.think()

        val human2 = Human("斎藤", 58, "釣り")

        human2.say()
        human2.think()
    }
}