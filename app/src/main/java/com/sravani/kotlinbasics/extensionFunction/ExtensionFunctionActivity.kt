package com.sravani.kotlinbasics.extensionFunction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExtensionFunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var name = "jhon"
        println(name.changeToLowercase())
    }
}

/*

Syntax

fun ClassName.functionName(parameters): ReturnType {
    // function body
}*/

/*
They cannot access the class’s private or protected members.
They do not modify the actual class but appear to add new methods.
 */
