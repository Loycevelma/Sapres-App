package com.example.spares_app.UI.Seller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spares_app.databinding.ActivityNotificationBinding

class ActivityNotification : AppCompatActivity() {
    lateinit var binding: ActivityNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}