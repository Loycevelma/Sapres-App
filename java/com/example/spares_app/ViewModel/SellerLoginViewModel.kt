package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.BuyerLoginResponse
import com.example.spares_app.Models.CategoriesResponse
import com.example.spares_app.Models.SellerLoginResponse
import com.example.spares_app.Repository.BuyerLoginRepository
import com.example.spares_app.Repository.CategoryRepository
import com.example.spares_app.Repository.SellerLoginRepository

class SellerLoginViewModel {
    var registrationLiveData = MutableLiveData<SellerLoginResponse>()
    var regError = MutableLiveData<String>()
    var loginRepository = SellerLoginRepository()
}