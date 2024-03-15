package com.krillinator.lektion_10_bonus_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This new calculator class is awesome
        val myTest = Calculator()

        // Invoke method
        println(myTest.addition(15, 15))

    }
}