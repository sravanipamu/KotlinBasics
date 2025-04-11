package com.sravani.kotlinbasics.objects

open class Logger {
   open fun debug(tag: String, message: String) {
        println("DEBUG: [$tag] $message")
    }
}