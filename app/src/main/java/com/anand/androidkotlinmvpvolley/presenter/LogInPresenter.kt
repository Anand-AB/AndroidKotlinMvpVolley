package com.anand.androidkotlinmvpvolley.presenter

import com.anand.androidkotlinmvpvolley.data.LogInRepository
import com.anand.androidkotlinmvpvolley.data.OperationCallback
import com.anand.androidkotlinmvpvolley.model.User
import com.anand.androidkotlinmvpvolley.view.LogInContract

class LogInPresenter(val view:LogInContract.View,val repository:LogInRepository):LogInContract.Presenter{

    init {
        view.presenter=this
    }

    override fun logIn() {
        if (view.validateForm()) {
            view.showLoadingView()
            repository.logIn(view.usernameField(), view.passwordField(), object : OperationCallback {
                override fun onError(obj: Any?) {
                    view.hideLoadingView()
                    obj?.let {
                        if(it is String){
                            view.showError(it)
                        }
                    }?:kotlin.run {
                        view.showError("Ocurrío un error")
                    }
                }

                override fun onSuccess(obj: Any?) {
                    view.hideLoadingView()
                    obj?.let {
                        if(it is User){
                            view.goToMainView(it)
                        }
                    }
                }
            })
        } else {

        }
    }
}