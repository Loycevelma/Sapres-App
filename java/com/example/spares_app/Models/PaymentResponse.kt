package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class PaymentResponse(
    var message:String,
    @SerializedName("buyer_id")var buyer_id:String,
)
