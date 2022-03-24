package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.CategoriesResponse
import com.example.spares_app.Models.PaymentResponse
import com.example.spares_app.Repository.CategoryRepository
import com.example.spares_app.Repository.PaymentRepository

class PaymentViewModel {
    var registrationLiveData = MutableLiveData<PaymentResponse>()
    var regError = MutableLiveData<String>()
    var categoryRepository = PaymentRepository()
}