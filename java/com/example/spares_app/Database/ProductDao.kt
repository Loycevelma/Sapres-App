package com.example.spares_app.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.spares_app.Models.UserProduct
@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProduct(product: UserProduct)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProduct(vararg products: UserProduct)

    @Query("SELECT * FROM products")
    fun getProduct(): LiveData<List<UserProduct>>

}