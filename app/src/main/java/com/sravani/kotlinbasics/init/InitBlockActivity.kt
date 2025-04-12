package com.sravani.kotlinbasics.init

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class InitBlockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var product = Product(400)

    }
}

/*
init block can be excuted after the primary constructor and before secondary constructor
it doesn't allow any parameters
if the class contains more than one init block it executes in the order we have declared
it uses the primary constructor parameters
 */