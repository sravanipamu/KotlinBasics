package com.sravani.kotlinbasics.jvmannotations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Date

class JVMAnnotationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // jvm fields
        Debugger.log("JVMAnnotationsActivity")
        println(DeviceDetails.getPlatform())
        // jvm overload
       val package1 = Package(10, "Annual_Plan", Date(2026, 4,12))
       val package2 = Package(12, "Monthly_Plan")
       val notifier = Notifier()

        notifier.notifyUser("Server restarted")

        if(Config.isProduction) {
            Debugger.log("App is in release mode")
        }
    }
}