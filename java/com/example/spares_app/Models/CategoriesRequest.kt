package com.example.spares_app.Models

import com.google.gson.annotations.SerializedName

data class CategoriesRequest(
    @SerializedName("name_Of_seller")
    var name_Of_seller:String,
)
