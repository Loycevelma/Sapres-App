package com.example.spares_app.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    //Create an instance of Retrofit
    var retrofit = Retrofit.Builder()
        .baseUrl("http://13.244.243.129")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
    }
}