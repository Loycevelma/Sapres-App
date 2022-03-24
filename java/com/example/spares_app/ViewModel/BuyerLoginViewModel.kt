package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.BuyerLoginResponse
import com.example.spares_app.Repository.BuyerLoginRepository

class BuyerLoginViewModel {
    var registrationLiveData = MutableLiveData<BuyerLoginResponse>()
    var regError = MutableLiveData<String>()
    var loginRepository = BuyerLoginRepository()
}