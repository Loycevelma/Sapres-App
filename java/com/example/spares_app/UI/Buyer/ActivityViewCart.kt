package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityViewCartBinding

class ActivityViewCart : AppCompatActivity() {
    lateinit var binding:ActivityViewCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivImage1.setOnClickListener {
            val intent= Intent(baseContext, ActivityBuyerSignUp::class.java)
            startActivity(intent)
        }
        binding.ivImage2.setOnClickListener {
            val  intent= Intent(baseContext, ActivityBuyerSignUp::class.java)
            startActivity(intent)
        }
        binding.ivImage3.setOnClickListener {
            val  intent= Intent(baseContext, ActivityBuyerSignUp::class.java)
            startActivity(intent)
        }
    }
}