package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("name_Of_seller")
    var name_Of_seller:String,
    @SerializedName("product_name")var product_name:String,
    @SerializedName("product_id")var product_id:String,
)

