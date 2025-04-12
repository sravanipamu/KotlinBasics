package com.sravani.kotlinbasics.init

import androidx.lifecycle.ViewModel
import com.sravani.kotlinbasics.objects.NetworkManager

class ProductViewModel(private val networkmanager: NetworkManager) : ViewModel() {

    init {
        checkNetwork()
    }

    fun checkNetwork() {
        networkmanager.connect()
    }
}