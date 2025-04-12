package com.sravani.kotlinbasics.jvmannotations

class DeviceDetails {
    companion object {
        fun getVersionName() : String{
            return "1.0.0"
        }
        @JvmStatic
        fun getPlatform() : String {
            return "Android"
        }
    }
}