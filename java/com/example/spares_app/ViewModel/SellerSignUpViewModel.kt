package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.BuyerLoginResponse
import com.example.spares_app.Models.SellerSignUpResponse
import com.example.spares_app.Repository.BuyerLoginRepository
import com.example.spares_app.Repository.SellerSignUpRepository

class SellerSignUpViewModel {
    var registrationLiveData = MutableLiveData<SellerSignUpResponse>()
    var regError = MutableLiveData<String>()
    var loginRepository = SellerSignUpRepository()
}