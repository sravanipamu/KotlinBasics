package com.sravani.kotlinbasics.visibilityModifier

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.utils.ApiHelper

 open class VisibilityModifier : AppCompatActivity() {

    // default(public) , internal, private and protected

    open var name = "Alice"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
     open fun sayHello() { // public default modifier
        println("Hello!")
    }
    private fun validateInput(input: String): Boolean { // private
        return input.isNotEmpty()
    }
    protected fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

class SubClassActivity : VisibilityModifier(), ApiHelper {

    override var name = "Jhon"
    fun greet() {
        showToast("Welcome!")
    }

    override fun sayHello() {
        super.sayHello()
    }

    override fun fetchData() {
        super.fetchData()
    }

}



