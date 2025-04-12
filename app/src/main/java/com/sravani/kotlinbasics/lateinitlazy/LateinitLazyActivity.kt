package com.sravani.kotlinbasics.lateinitLazy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.R

class LateinitLazyActivity : AppCompatActivity() {

    //  delayed initialization we use lateinit and lazy

     lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lateinit_lazy)
        name = "Kotlin"
        println(name.length) // Safe after assignment

      /*

      Use case
      -------
      You can't initialize a variable immediately (e.g., in onCreate()).
      The variable is non-null and will definitely be set before use.

      Rules
      ------
      Only for var
      Only for non-nullable types (can’t be String?)
      Can’t be used with primitive types (like Int, Boolean)

       */

        val config by lazy1{
            println("Initializing config")
            "Loaded Config"
        }


        println(config)

        println(config)
        /*
        Use case
        -------
        You want to initialize a value only when needed.
        Value never changes once set.
         */

    }


    fun<T> lazy1(block : ()-> T) : Lazy<T>{
        return lazy(block)
    }

}