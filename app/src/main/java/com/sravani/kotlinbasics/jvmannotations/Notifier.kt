package com.sravani.kotlinbasics.jvmannotations

class Notifier {
    @JvmOverloads
    fun notifyUser(message: String, title: String = "Notice", urgent: Boolean = false) {
        val urgency = if (urgent) "URGENT" else "Normal"
        println("[$urgency] $title: $message")
    }
}