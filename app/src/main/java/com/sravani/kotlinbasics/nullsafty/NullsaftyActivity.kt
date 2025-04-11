package com.sravani.kotlinbasics.nullsafty

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.R

class NullsaftyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safty)

        val name: String = "Alice"    // Non-nullable



        val nickname: String? = ""  // Nullable

        // accessing the variable for non nullable type

        val nameLength = name.length

        // safe call operator
        val nicknameLength = nickname?.length

        // elvis operator
        val length = nickname?.length ?: 0

        // Not-null Assertion (!!)
        val lengthAssertion = nickname!!.length

        // Smart Cast
        if (nickname != null) {
            println(nickname.length)
        }

       /* if(nickname == null) {
            throw NullPointerException()
        }*/

    }

}