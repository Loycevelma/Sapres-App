package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityCompleteOrdersBinding

class ActivityCompleteOrders : AppCompatActivity() {
    lateinit var binding: ActivityCompleteOrdersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCompleteOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val  intent= Intent(baseContext, ActivityUpdateProducts::class.java)
            startActivity(intent)
        }
    }
}