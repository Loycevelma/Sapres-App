package com.example.spares_app.Models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Categories")
data class Category(
    @PrimaryKey @NonNull @SerializedName("category_id") var categoryId: String,
    @SerializedName("category_name") var categoryName: String,
    @SerializedName("category_imageUrl") var categoryImageUrl: String,
    var name:String,
    var imgUrl:String,
)

