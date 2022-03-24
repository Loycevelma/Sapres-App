package com.example.spares_app.Database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.spares_app.Models.Category
import com.example.spares_app.Models.UserProduct

@Database(entities = [Category::class,UserProduct::class], version = 1)

abstract class SparesDatabase: RoomDatabase() {

    abstract fun getProductDao():ProductDao
    abstract fun getCategoriesDao(): CategoriesDao

    companion object{
        private var database: SparesDatabase? = null

        fun getDatabase(context: Context): SparesDatabase {
            if (database ==null){
                database = Room.databaseBuilder(context, SparesDatabase::class.java, "spares-db")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return database as SparesDatabase
        }
    }

}
