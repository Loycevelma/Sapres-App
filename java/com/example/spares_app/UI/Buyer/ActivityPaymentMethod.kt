package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityPaymentMethodBinding

class ActivityPaymentMethod : AppCompatActivity() {
    lateinit var binding: ActivityPaymentMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            val  intent= Intent(baseContext, ActivityPaymentSuccessfull::class.java)
            startActivity(intent)
        }
    }
}