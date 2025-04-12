package com.sravani.kotlinbasics.infix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

 class InfixNotationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var number =  10 add 11
        var isPositive = this isPositive -1

        // built infix methods (is, in, until, downto, step
        val list = listOf(1, 2, 3)
        if(list is ArrayList)
            println("array list")
    }

     infix fun Int.add(secondNumber :Int) : Int{
       return  this + secondNumber
    }

    private infix fun isPositive(number : Int) : Boolean{
        return number > 0
    }


   /* private infix fun <T, R>  T.is1(list : R) : Boolean {
        if(this instanceOf list) {
            return true
        }
        return false
    }*/
}

/*
it has only one parameter
and it should be extension function

 */