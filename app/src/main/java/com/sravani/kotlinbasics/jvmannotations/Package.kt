package com.sravani.kotlinbasics.jvmannotations

import java.util.Date


data class Package @JvmOverloads constructor(var packageInd : Long, var packageName : String, var expiry : Date = Date(2025, 5,12))