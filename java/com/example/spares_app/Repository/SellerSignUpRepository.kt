package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.SellerSignUpRequest
import com.example.spares_app.Models.SellerSignUpResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SellerSignUpRepository {
    var apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun SignUpSeller(SellerSignUpRequest: SellerSignUpRequest):
            retrofit2.Response<SellerSignUpResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.SignUpSeller(SellerSignUpRequest)
            return@withContext resp
        }
}