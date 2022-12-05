package com.anand.androidkotlinmvpvolley.data

interface OperationCallback {

    fun onSuccess(obj:Any?)
    fun onError(obj:Any?)
}