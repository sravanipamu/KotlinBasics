package com.sravani.kotlinbasics.singletonpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SingletonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var thread1 = Thread(){
            run {
                var retrofitClient1 = RetrofitClientSyncronized.getInstance()
                println("Current Thread ${Thread.currentThread().name}"+retrofitClient1)
            }
        }

        var thread2 = Thread(){
            run {
                var retrofitClient2 = RetrofitClientSyncronized.getInstance()
                println("Current Thread ${Thread.currentThread().name}"+retrofitClient2)
            }
        }
        thread1.start()
        thread2.start()

    }
}