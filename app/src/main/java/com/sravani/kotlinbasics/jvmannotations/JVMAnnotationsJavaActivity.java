package com.sravani.kotlinbasics.jvmannotations;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;


public class JVMAnnotationsJavaActivity  extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //jvm static
        Debugger.INSTANCE.log("JVMAnnotationsActivity");
        System.out.println(DeviceDetails.Companion.getPlatform());
        // jvm overload
        Package package1 = new Package(10, "Annual_Plan", new Date(2026, 4,12));
        Package package2 = new Package(12, "Monthly_Plan");
        Notifier notifier = new Notifier();

        notifier.notifyUser("Server restarted");

        if(Config.isProduction) {
            Debugger.INSTANCE.log("JVMAnnotationsActivity");
        }
    }
}
