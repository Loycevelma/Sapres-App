package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class BuyerSignUpRequest(
    var first_Name :String,
    @SerializedName("last_Name") var last_Name:String,
    var email:String,
    var password:String,
    @SerializedName("phone_number") var phone_number:String,
)
