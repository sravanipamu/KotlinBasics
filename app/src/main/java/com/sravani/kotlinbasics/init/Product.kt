package com.sravani.kotlinbasics.init

class Product(price: Int) {

    val isExpensive: Boolean

    init {
        println("init constructor")
        isExpensive = price > 1000
    }

    constructor(price: Int, label : String) : this(price) {
        println("secondary constructor")
    }
}

