package com.example.spares_app.UI.Buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spares_app.Models.Products
import com.example.spares_app.RvCategoriesActivity
import com.example.spares_app.databinding.ActivityCategoriesBinding

class ActivityCategories : AppCompatActivity() {
    lateinit var binding: ActivityCategoriesBinding
    lateinit var rvproducts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val products = listOf(
            Products(

                "Automotive Body Parts",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJBWLkZNKqsruc--IyN52Xd2JGwjxdNfgodw&usqp=CAU"
            ),
            Products(
                "Automotive Electronics",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3ueYh6S75G3Pf8kuriE49wzN2Vn8PFQC54g&usqp=CAU"
            ),
            Products(
                "Automotive Suppliers",
                "https://www.simon-kucher.com/sites/default/files/2018-10/Automotivesupplier_5.jpg"
            ),


            Products(
                "Automotive Wheels",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5EfdWWtAcdqZJ-c1oCKcfpRQZK_mqAUz2qg&usqp=CAU"
            )
        )
        rvproducts=binding.rvproducts
        var productAdapter = RvCategoriesActivity(products, baseContext)
        rvproducts.adapter = productAdapter
        rvproducts.layoutManager = LinearLayoutManager(baseContext)
        if (rvproducts.isNotEmpty()) {
            rvproducts.layoutManager = LinearLayoutManager(baseContext)
            rvproducts.adapter = productAdapter
        } else {
            Toast.makeText(baseContext, "", Toast.LENGTH_LONG).show()
        }
    }
}