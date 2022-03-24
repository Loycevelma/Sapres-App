package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.BuyerLoginResponse
import com.example.spares_app.Models.BuyerSignUpRequest
import com.example.spares_app.Models.BuyerSignUpResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class BuyerSignUpRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun signUpBuyer(SignUpRequest: BuyerSignUpRequest):
            Response<BuyerSignUpResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.signUpBuyer(SignUpRequest)
            return@withContext resp
        }
}