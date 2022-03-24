package com.example.spares_app.API

import com.example.spares_app.Models.*
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    //    DEFINE HTTP OPERATIONS
    @POST("/buyer/login")
    suspend fun loginBuyer(@Body CustomerLoginRequest: BuyerLoginRequest):retrofit2.Response<BuyerLoginResponse>
    @POST("/buyer/signup")
    suspend fun signUpBuyer(@Body BuyerSignUpRequest: BuyerSignUpRequest):retrofit2.Response<BuyerSignUpResponse>
    @POST("/seller/signup")
    suspend fun SignUpSeller(@Body SellerSignupRequest: SellerSignUpRequest):retrofit2.Response<SellerSignUpResponse>
    @POST("/seller/login")
    suspend fun loginSeller(@Body SellerLoginRequest: SellerLoginRequest):retrofit2.Response<SellerLoginResponse>
    @POST("/product")
    suspend fun product(@Body productRequest: ProductRequest):retrofit2.Response<ProductResponse>
    @POST("/categories")
    suspend fun categories(@Body categoriesRequest: CategoriesRequest):retrofit2.Response<CategoriesResponse>
    @POST("/mpesaPayments//")
    suspend fun mpesaPayments(@Body paymentRequest: PaymentRequest):retrofit2.Response<PaymentResponse>

}