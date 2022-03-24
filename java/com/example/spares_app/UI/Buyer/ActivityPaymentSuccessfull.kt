package com.example.spares_app.UI.Buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityPaymentSuccessfullBinding

class ActivityPaymentSuccessfull : AppCompatActivity() {
    lateinit var binding:ActivityPaymentSuccessfullBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentSuccessfullBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}