package com.anand.androidkotlinmvpvolley.data

object EndPoints {

    //val url = "https://blooming-sierra-86800.herokuapp.com"
    //val url = "http://localhost:3000"
    val url = "http://10.0.2.2:3000"
    fun logIn():String= url.plus("/api/login")
}