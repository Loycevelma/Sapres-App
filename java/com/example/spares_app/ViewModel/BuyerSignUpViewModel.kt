package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.BuyerLoginResponse
import com.example.spares_app.Models.BuyerSignUpResponse
import com.example.spares_app.Repository.BuyerLoginRepository
import com.example.spares_app.Repository.BuyerSignUpRepository

class BuyerSignUpViewModel {
    var registrationLiveData = MutableLiveData<BuyerSignUpResponse>()
    var regError = MutableLiveData<String>()
    var loginRepository = BuyerSignUpRepository()
}