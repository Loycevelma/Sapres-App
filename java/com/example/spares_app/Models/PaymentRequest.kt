package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class PaymentRequest(
    var amount:String,
    var phoneNumber:String,
    @SerializedName("pin_number")
    var pin_number:String,
    )

