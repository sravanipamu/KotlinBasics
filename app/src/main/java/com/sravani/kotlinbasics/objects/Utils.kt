package com.sravani.kotlinbasics.objects

class Utils {

    companion object : Logger() {

        fun isEmailValid(email: String): Boolean {
            return email.contains("@")
        }

        override fun debug(tag: String, message: String) {
            super.debug(tag, message)
        }
    }
}