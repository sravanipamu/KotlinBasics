package com.sravani.kotlinbasics

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sravani.kotlinbasics.constkeyword.ConstKeywordActivity
import com.sravani.kotlinbasics.data.DataClassActivity
import com.sravani.kotlinbasics.extensionFunction.ExtensionFunctionActivity
import com.sravani.kotlinbasics.generics.GenericsActivity
import com.sravani.kotlinbasics.infix.InfixNotationActivity
import com.sravani.kotlinbasics.init.InitBlockActivity
import com.sravani.kotlinbasics.inline.InlineFunctionsActivity
import com.sravani.kotlinbasics.jvmannotations.JVMAnnotationsActivity
import com.sravani.kotlinbasics.lamdaHighOrder.LamdaHighOrderActivity
import com.sravani.kotlinbasics.lateinitlazy.LateinitLazyActivity
import com.sravani.kotlinbasics.nullsafty.NullsaftyActivity
import com.sravani.kotlinbasics.objects.ObjectCompanionObjectActivity
import com.sravani.kotlinbasics.scopefunctions.ScopeFunctionsActivity
import com.sravani.kotlinbasics.sealed.SealedActivity
import com.sravani.kotlinbasics.singletonpattern.SingletonActivity
import com.sravani.kotlinbasics.variables.VariableActivity
import com.sravani.kotlinbasics.visibilitymodifier.VisibilityModifier

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

    fun jvmAnnotations(view: View) {
        startActivity(Intent(this, JVMAnnotationsActivity::class.java))
    }

     fun initBlock(view: View) {
        startActivity(Intent(this, InitBlockActivity::class.java))
    }

    fun extensionFunction(view: View) {
        startActivity(Intent(this, ExtensionFunctionActivity::class.java))
    }

    fun infixNotation(view: View) {
        startActivity(Intent(this, InfixNotationActivity::class.java))
    }

    fun generics(view: View) {
        startActivity(Intent(this, GenericsActivity::class.java))
    }

    fun singletonPattern(view: View) {
        startActivity(Intent(this, SingletonActivity::class.java))
    }

    fun sealedClasses(view: View) {
        startActivity(Intent(this, SealedActivity::class.java))
    }

    fun scopeFunctions(view: View) {
        startActivity(Intent(this, ScopeFunctionsActivity::class.java))
    }

}