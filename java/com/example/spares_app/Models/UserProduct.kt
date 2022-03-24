package com.example.spares_app.Models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Products")
data class UserProduct(
    @PrimaryKey @NonNull @SerializedName("category_id") var categoryId: String,
    @SerializedName("product_name") var categoryName: String,
    @SerializedName("product_imageUrl") var productImageUrl: String,
    @SerializedName("product_product") var productPrice: String,
    @SerializedName("product_description") var productDescription: String,
    var ImageUrl:String,
    var ProductName:String,
    var Prices:String,
    var Description:String,
)
