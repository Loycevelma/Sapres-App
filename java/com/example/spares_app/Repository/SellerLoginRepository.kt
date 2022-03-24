package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.SellerLoginRequest
import com.example.spares_app.Models.SellerLoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class SellerLoginRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun loginSeller(SellerLoginRequest: SellerLoginRequest):
            Response<SellerLoginResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.loginSeller(SellerLoginRequest)
            return@withContext resp
        }
}