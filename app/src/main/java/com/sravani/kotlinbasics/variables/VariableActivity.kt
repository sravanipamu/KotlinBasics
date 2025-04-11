package com.sravani.kotlinbasics.variables

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.R

class VariableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable)
        val name = "Alice"      // Inferred as String
        val age: Int = 25       // Explicit type

        // mutable
        var count = 10
        count = 15              // Allowed

        var message: String = "Hello"
        message = "Hi"          // Also fine

        // immutable
        val isKotlinFun = true

    }

}