package com.sravani.kotlinbasics.scopefunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.data.User
import com.sravani.kotlinbasics.sealed.ScreenSealed
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

class ScopeFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // let function (input - it and output - lamda)
        // used for nullable types and transformation

        var name : String ? = "sravani_12"

        var transformedName1 : String? = null
        if(name != null) {
            transformedName1 =  name.uppercase()
        }

        var transformedName = name?.let1({ it->
            println("let function")
            it.uppercase()
        })
        println("original name $name")
        println("uppercase name $transformedName")

        val userLet = User("Bob", 25)
        val userLetResult = userLet.let ({ it->
            it.name = "Bob Hit"
            it.age = 30
        })
        println( "Updated User in let: $userLet")



        // run function (input - this and output will be lamda)
        // used for nullable types and working on the this object
        val user = User("John", 25)
        val result = user?.run {
            this.name = "Jane"
            this.age = 30
        }
        println( "Updated User in run: $user")


       // with function (input parameter this and return type lamda)
        // used for only non nullable types and working on the this object
        val userWith = User("John", 25)
        val resultWith = with(userWith) {
            this.name = "Jane"
            this.age = 30
        }
        println( "Updated User in with: $userWith")

        // apply function (input parameter this and return type this)
        // used for object configuration
        val userApply = User("", 0).apply {
            name = "Alice"
            age = 25
        }
        println("Updated user in apply $userApply")

        // also function (input parameter it and return type this)
        // used for side effects
        val userAlso = User("Bob", 30).also {
            println("Creating user: ${it.name}")
            it.age += 1
        }
        println("Updated user in also $userAlso")
        "SRAVANI".toLowerCase()
        toLowerCase("SRAVANI")
    }





}

private fun toLowerCase(it : String){
   it.lowercase()
}


private fun String.toLowerCase(){
    this.lowercase()
}

public inline fun  String.let1(block: (String) -> String): String {
    return block(this)
}

public inline fun <T, R> T.let(block: (T) -> R): R {
    return block(this)
}





public inline fun <T, R> T.run(block: T.() -> R): R {
    return block()
}

public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
    return receiver.block()
}

public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}
public inline fun <T> T.also(block: (T) -> Unit): T {
    block(this)
    return this
}

public inline fun <T> T.filter(block : T.()-> Unit) : Unit{
    return  block()
}


