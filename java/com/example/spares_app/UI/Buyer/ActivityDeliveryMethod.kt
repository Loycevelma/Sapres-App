package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityDeliveryMethodBinding

class ActivityDeliveryMethod : AppCompatActivity() {
    lateinit var binding: ActivityDeliveryMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDeliveryMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chDelivery.setOnClickListener {
            val  intent= Intent(baseContext, ActivityLocation::class.java)
            startActivity(intent)
        }
        binding.chPickup.setOnClickListener {
            val  intent= Intent(baseContext, ActivityPaymentMethod::class.java)
            startActivity(intent)
        }
    }
}