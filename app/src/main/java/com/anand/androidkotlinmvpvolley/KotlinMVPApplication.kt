package com.anand.androidkotlinmvpvolley

import android.app.Application
import android.util.Log
import com.anand.androidkotlinmvpvolley.data.Injection
import com.android.volley.VolleyLog

class KotlinMVPApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Injection.setUp(this)
        //volley
        VolleyLog.setTag("Volley")
        Log.isLoggable("Volley", Log.DEBUG)
    }
}