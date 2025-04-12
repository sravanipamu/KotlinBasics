package com.sravani.kotlinbasics.objects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.R

class ObjectCompanionObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_companion)

        println("${NetworkManager.connect()}")

        println(RetrofitBuilder.instance)

        String.also {  }

        println("isEmail Valid "+Utils.isEmailValid("jhon.12@gmail.com"))
        println("isEmail Valid "+Utils.debug("ObjectCompanionObjectActivity", "debug message checking..."))

        // difference between object and companion object

        /*
        Object - it follows the singleton pattern and object level
        Companion Object - these are static methods and class level
         */
    }
}

