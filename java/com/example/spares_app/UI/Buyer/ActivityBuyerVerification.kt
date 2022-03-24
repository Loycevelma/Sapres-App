package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityBuyerVerificationBinding

class ActivityBuyerVerification : AppCompatActivity() {
    lateinit var binding:ActivityBuyerVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBuyerVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnverify.setOnClickListener {
            val intent= Intent(baseContext, ActivityBuyerLogin::class.java)
            startActivity(intent)
        }

    }
}