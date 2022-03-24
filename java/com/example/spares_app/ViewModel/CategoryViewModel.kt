package com.example.spares_app.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.spares_app.Models.CategoriesResponse
import com.example.spares_app.Repository.CategoryRepository

class CategoryViewModel {
    var registrationLiveData = MutableLiveData<CategoriesResponse>()
    var regError = MutableLiveData<String>()
    var categoryRepository = CategoryRepository()
}