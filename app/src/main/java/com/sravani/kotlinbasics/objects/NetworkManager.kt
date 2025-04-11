package com.sravani.kotlinbasics.objects

object NetworkManager : Logger() {
    private var isConnected: Boolean = false

    fun connect() {
        isConnected = true
        debug("Network Manager", "Connected to network")
    }

    fun disconnect() {
        isConnected = false
        debug("Network Manager", "Disconnected from network")
    }
}