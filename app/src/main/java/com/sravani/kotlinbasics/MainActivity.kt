package com.sravani.kotlinbasics

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.constKeyword.ConstKeywordActivity
import com.sravani.kotlinbasics.data.DataClassActivity
import com.sravani.kotlinbasics.inline.InlineFunctionsActivity
import com.sravani.kotlinbasics.lamdaHighOrder.LamdaHighOrderActivity
import com.sravani.kotlinbasics.lateinitLazy.LateinitLazyActivity
import com.sravani.kotlinbasics.nullsafty.NullsaftyActivity
import com.sravani.kotlinbasics.objects.ObjectCompanionObjectActivity
import com.sravani.kotlinbasics.variables.VariableActivity
import com.sravani.kotlinbasics.visibilityModifier.VisibilityModifier

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun variable(view: View) {
        startActivity(Intent(this, VariableActivity::class.java))
    }

    fun NullSafty(view: View) {
        startActivity(Intent(this, NullsaftyActivity::class.java))
    }
    fun constKeyword(view: View) {
        startActivity(Intent(this, ConstKeywordActivity::class.java))
    }

    fun lateinitlazy(view: View) {
        startActivity(Intent(this, LateinitLazyActivity::class.java))
    }

    fun visibility(view: View) {
        startActivity(Intent(this, VisibilityModifier::class.java))
    }

    fun lamdaHighOrder(view: View) {
        startActivity(Intent(this, LamdaHighOrderActivity::class.java))
    }

    fun objectCompanionObject(view: View) {
        startActivity(Intent(this, ObjectCompanionObjectActivity::class.java))
    }

    fun inlineFunctions(view: View) {
        startActivity(Intent(this, InlineFunctionsActivity::class.java))
    }

    fun dataClass(view: View) {
        startActivity(Intent(this, DataClassActivity::class.java))
    }

}