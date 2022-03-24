package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityUpdateProductsBinding

class ActivityUpdateProducts : AppCompatActivity() {
    lateinit var binding: ActivityUpdateProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUpdateProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit1.setOnClickListener {
            val  intent= Intent(baseContext, ActivityNotification:: class.java)
            startActivity(intent)
        }
    }
}