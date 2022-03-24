package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.UI.Seller.ActivitySellerSignUp
import com.example.spares_app.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSeller.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerSignUp::class.java)
            startActivity(intent)
        }
        binding.btnBuyer.setOnClickListener {
            val intent= Intent(baseContext, ActivityCategories::class.java)
            startActivity(intent)
        }

    }
}