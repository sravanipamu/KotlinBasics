package com.sravani.kotlinbasics.extensionFunction

fun String.changeToLowercase() : String{
    return this.lowercase()
}

fun Int.isPositive() : Boolean {
    return this > 0
}