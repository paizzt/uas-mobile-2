@file:Suppress("DEPRECATION")

package com.example.aplikasialquran.utils

import android.app.IntentService
import android.content.Intent
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.ResultReceiver
import java.util.*

class GetAddressIntentService : IntentService(IDENTIFIER) {
    private var addressResultReceiver: ResultReceiver? = null

    //handle the address request
    override fun onHandleIntent(intent: Intent?) {
        var msg = ""

        //get result receiver from intent
        addressResultReceiver = intent!!.getParcelableExtra("add_receiver")
        if (addressResultReceiver == null) {
            return
        }
        val location = intent.getParcelableExtra<Location>("add_location")

        //send no location error to results receiver
        if (location == null) {
            msg = "No location, can't go further without location"
            sendResultsToReceiver(0, msg)
            return
        }
        val geocoder = Geocoder(this, Locale.getDefault())
        var addresses: List<Address>? = null