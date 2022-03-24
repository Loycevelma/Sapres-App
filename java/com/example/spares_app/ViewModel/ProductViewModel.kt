package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.ProductResponse
import com.example.spares_app.Repository.ProductRepository

class ProductViewModel {
    var registrationLiveData = MutableLiveData<ProductResponse>()
    var regError = MutableLiveData<String>()
    var productRepository= ProductRepository()
}