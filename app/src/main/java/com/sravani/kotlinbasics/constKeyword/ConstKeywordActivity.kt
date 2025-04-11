package com.sravani.kotlinbasics.constKeyword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.R
import com.sravani.kotlinbasics.utils.APP_NAME
import com.sravani.kotlinbasics.utils.Constants

class ConstKeywordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_const)

        val name = "Alice"
       //  const val base_url  = "https://api.example.com"

       // Accessing the variable

        println(Constants.BASE_URL)
        println(APP_NAME)

        /*
        difference between val and const
         1. val is Runtime constant and const is Compiletime Constant
         2. val Can be any type and const allows only primitives & Strings
         3. val can be inside any class or function and const must be top-level or in object/companion object
         */
    }
}