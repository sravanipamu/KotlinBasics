package com.sravani.kotlinbasics.data

data class User (var name : String) {

     constructor( name: String,  age: Int) : this(name)
  
}