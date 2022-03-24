package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.CategoriesRequest
import com.example.spares_app.Models.CategoriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun categories(CategoriesRequest: CategoriesRequest):
            retrofit2.Response<CategoriesResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.categories(CategoriesRequest)
            return@withContext resp
        }
}