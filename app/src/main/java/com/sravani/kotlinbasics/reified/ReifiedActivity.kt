package com.sravani.kotlinbasics.reified

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.sravani.kotlinbasics.data.User

class ReifiedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printData("sravani")
        printData(10)
        printData(10.4)

        val json = """{"name":"Alice", "age":25}"""
        val user: User = parseJson(json)
    }

    inline fun <reified T> printData(data : T){
        println("type of data ${T::class}") // KClass<T>
        println("type of data ${T::class.java}") // Class<T>
        println("type of data ${T::class.simpleName}")
    }

    fun printData(data : String){
        println("type of data ${data::class.simpleName}")
    }

    inline fun <reified T> parseJson(json: String): T {
        return Gson().fromJson(json, T::class.java)
    }
}
