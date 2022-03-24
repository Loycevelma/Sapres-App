package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class SellerSignUpRequest(
    var name:String,
    var email:String,
    var password:String,
    @SerializedName("phone_number")
    var phone_number:String,
)
