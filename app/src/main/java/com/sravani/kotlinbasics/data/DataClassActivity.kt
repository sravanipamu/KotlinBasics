package com.sravani.kotlinbasics.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DataClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user1 = User("Jhon", 25)
        val user2 = User("Jhon", 25)
        val user3 = user2


        // toString
        println("user1  $user1")

        println("user2  $user1")

        // equals()
        println(user1 == user2) // true

        // == and === (Structural  equality and Compare equality )
        println(user1 == user3) // false
        println(user2 == user3) // true


        // copy()
        val user4 = user1.copy()

        println("user4 $user4")

    }

    /*
      atleast one property in the primary constructor
      it must be val or val
      Cannot be abstract, open, sealed, or inner.
     */
}