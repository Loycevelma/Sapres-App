package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class ProductRequest(
    @SerializedName("name_of_theProduct")
    var name_of_theProduct:String,
    var description:String,
    var price:String,
)
