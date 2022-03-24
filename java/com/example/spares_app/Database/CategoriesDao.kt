package com.example.spares_app.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spares_app.Models.Category

@Dao
interface CategoriesDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertCategories(category: Category)

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertCategories(vararg categories: Category)

        @Query("SELECT * FROM categories")
        fun getCategories(): LiveData<List<Category>>
    }
