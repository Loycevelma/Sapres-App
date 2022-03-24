package com.example.spares_app.Repository

import com.example.spares_app.API.ApiClient
import com.example.spares_app.API.ApiInterface
import com.example.spares_app.Models.PaymentRequest
import com.example.spares_app.Models.PaymentResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class PaymentRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun mpesaPayments(PaymentRequest: PaymentRequest):
            Response<PaymentResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.mpesaPayments(PaymentRequest)
            return@withContext resp
        }
}