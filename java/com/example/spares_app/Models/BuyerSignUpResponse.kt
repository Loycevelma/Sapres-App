package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class BuyerSignUpResponse(
    @SerializedName("first_Name")var first_Name:String,
    @SerializedName("last_Name")var last_Name:String,
    var email:String,
    @SerializedName("phone_number")var phone_number:String,
    @SerializedName("buyer_id")var buyer_id:String,
)
