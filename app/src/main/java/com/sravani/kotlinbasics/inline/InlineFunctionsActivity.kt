package com.sravani.kotlinbasics.inline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class InlineFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        doSomething {
            println("action")
            return
        }
        println("oncreate end")
    }

    private inline fun doSomething(action: () -> Unit) {
        println("Before doSomething")
        action()
        println("After doSomething")
    }
}

