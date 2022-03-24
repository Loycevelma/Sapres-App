package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.ProductRequest
import com.example.spares_app.Models.ProductResponse
import com.example.spares_app.Models.SellerLoginRequest
import com.example.spares_app.Models.SellerLoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun product(ProductRequest: ProductRequest):
            Response<ProductResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.product(ProductRequest)
            return@withContext resp
        }
}