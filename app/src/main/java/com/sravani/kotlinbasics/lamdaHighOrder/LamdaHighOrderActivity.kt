package com.sravani.kotlinbasics.lamdaHighOrder

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.util.Function
import com.sravani.kotlinbasics.R


class LamdaHighOrderActivity : AppCompatActivity() {

    var name : String  = "Jhon"

    var welcomeMessage : () -> Unit = { println("Welcome Message") }

    var dynamicMessage : (String) -> Unit = { it -> println("Welcome $it") }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamda_high_order)

     /*  var welcomeMessage : Function<Unit, Unit>  = object : Function<Unit, Unit> {
           override fun apply(value: Unit) {
               println("Welcome Message")
           }

       }

        welcomeMessage.apply(Unit)*/

        welcomeMessage()

     /*   var dynamicMessage : Function<String, Unit>  = object : Function<String, Unit> {
            override fun apply(value: String) {
                println("Welcome Message $value")
            }

        }

        dynamicMessage.apply(name)*/

        dynamicMessage(name)

        // highorder function ( lamda passing as function parameter and returning lamda as a return type of the function)

        // lamdas we use mainly in functional interface

        setCustomClickAction {
            println("Custom Event Clicked")
        }

        // function returns the function
        val greeter = greetUser()
        greeter("Greeting Jhon")

        // functional interface
        findViewById<AppCompatButton>(R.id.click).setOnClickListener {

            //loginUser("admin", "1234")


            loginUser("admin", "1234", object : OnLoginCallback {
                override fun onLoginSuccess(username: String) {
                 println("Login Success")
                }

                override fun onLoginFailure(error: String) {
                    println("Login Failure")
                }
            })
        }


    }


    private fun setCustomClickAction(action: () -> Unit) {
        action() // call the passed-in lambda
    }

    private fun greetUser(): (String) -> Unit {
        return { name -> println("Welcome, $name!") }
    }


   /* fun loginUser(username: String, password: String, callback: OnLoginCallback) {
        if (username == "admin" && password == "1234") {
            callback.onLoginSuccess(username)
        }
    }*/

    fun loginUser(username: String, password: String, callback: OnLoginCallback) {
        if (username == "admin" && password == "1234") {
            callback.onLoginSuccess(username)
        } else{
            callback.onLoginFailure("invalid name")
        }
    }

     interface OnLoginCallback {
        fun onLoginSuccess(username: String)
        fun onLoginFailure(error : String)
    }
}