package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivitySellerWorkingHoursBinding

class ActivitySellerWorkingHours : AppCompatActivity() {
    lateinit var binding: ActivitySellerWorkingHoursBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySellerWorkingHoursBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val  intent= Intent(baseContext, ActivityPendingOrders::class.java)
            startActivity(intent)
        }
    }
}