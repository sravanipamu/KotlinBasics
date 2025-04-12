package com.sravani.kotlinbasics.generics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GenericsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var names = listOf("jhon", "blob",  "Bean")
        var list = listOf(10,11,12)
        var dataString = Data<String>("sravani")
        var dataInt = Data<Int>(11)
        var dataFloat = Data<Float>(11.5f)
    }



}

class Data<T>(private var value : T) {
    fun <T> getValue() : T {
        return value as T
    }
}
