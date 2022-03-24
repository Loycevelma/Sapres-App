package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.BuyerLoginRequest
import com.example.spares_app.Models.BuyerLoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class BuyerLoginRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun loginBuyer(LoginRequest: BuyerLoginRequest):
            Response<BuyerLoginResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.loginBuyer(LoginRequest)
            return@withContext resp
        }
}