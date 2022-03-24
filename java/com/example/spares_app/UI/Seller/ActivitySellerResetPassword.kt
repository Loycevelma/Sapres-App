package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.spares_app.databinding.ActivitySellerResetPasswordBinding

class ActivitySellerResetPassword : AppCompatActivity() {
    lateinit var etSellerCode: EditText
    lateinit var etSellerNewPassword: EditText
    lateinit var etSellerConfirmPassword: EditText
    val MIN_PASSWORD_LENGTH = 6;
    lateinit var binding: ActivitySellerResetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSellerSubmitPassword.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerLocation::class.java)
            startActivity(intent)
        }
        viewInitializations()
    }
    fun viewInitializations() {
        val Code = binding.etSellerCode.text.toString()
        val NewPassword = binding.etSellerNewPassword.text.toString()
        val ConfirmPassword = binding.etSellerConfirmPassword.text.toString()


        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Checking if the input in form is valid
    fun validateInput(): Boolean {
        if (etSellerCode.text.toString().equals("")) {
            etSellerCode.setError("Please Enter Code")
            return false
        }

        if (etSellerNewPassword.text.toString().equals("")) {
            etSellerNewPassword.setError("Please Enter Password")
            return false
        }
        if (etSellerConfirmPassword.text.toString().equals("")) {
            etSellerConfirmPassword.setError("Please Confirm Password")
            return false
        }


        // checking minimum password Length
        if (etSellerNewPassword.text.length < MIN_PASSWORD_LENGTH) {
            etSellerNewPassword.setError("Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters")
            return false
        }

        // Checking if repeat password is same
        if (!etSellerNewPassword.text.toString().equals(etSellerConfirmPassword.text.toString())) {
            etSellerConfirmPassword.setError("Password does not match")
            return false
        }
        return true
    }


    // Hook Click Event

    fun performResetPassword(view: View) {
        if (validateInput()) {

            // Input is valid, here send data to your server

            val etCode = etSellerCode.text.toString()
            val password = etSellerNewPassword.text.toString()
            val repeatPassword = etSellerConfirmPassword.text.toString()

            Toast.makeText(this, "Password Reset Successfully", Toast.LENGTH_SHORT).show()

        }
    }
}