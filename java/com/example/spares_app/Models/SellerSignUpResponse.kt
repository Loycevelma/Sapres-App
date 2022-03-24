package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class SellerSignUpResponse(
    var name:String,
    var email:String,
    var message:String,
    @SerializedName("seller_id")
    var seller_id:String,
)
