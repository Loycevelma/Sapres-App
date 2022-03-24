package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.spares_app.databinding.ActivityBuyerSignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class ActivityBuyerSignUp : AppCompatActivity() {
    lateinit var firebaseUser: FirebaseUser
    private lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityBuyerSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuyerSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth=FirebaseAuth.getInstance()
        binding.tvLogIn.setOnClickListener {
            val intent = Intent(this, ActivityBuyerLogin::class.java)
            startActivity(intent)
        }

//        binding.btnCreateAccount.setOnClickListener {
//            val intent = Intent(baseContext, ActivityBuyerVerification::class.java)
//            startActivity(intent)
//        }
        binding.btnCreateAccount.setOnClickListener {

            val firsName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPass.text.toString()

            if (firsName.isEmpty()) {
                Toast.makeText(this, "FirstName can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (lastName.isEmpty()) {
                Toast.makeText(this, "LastName can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                Toast.makeText(this, "Email can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }
            if (password.isEmpty()) {
                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }
            if (confirmPassword.isEmpty()) {
                Toast.makeText(this, "ConfirmPassword can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Password not the same", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, ActivityBuyerLogin::class.java))
                        finish()
                    }
                }
        }
        // click listener for layout
//        binding.tvLogIn.setOnClickListener {
//            val intent = Intent(this, ActivityBuyerLogin::class.java)
//            startActivity(intent)
//        }

//        binding.btnCreateAccount.setOnClickListener {
//            val intent= Intent(baseContext, ActivityBuyerLogin::class.java)
//            startActivity(intent)
//        }


    }
    }
