package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.spares_app.databinding.ActivitySellerSignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class ActivitySellerSignUp : AppCompatActivity() {
    lateinit var firebaseUser: FirebaseUser
    private lateinit var auth: FirebaseAuth
    lateinit var binding: ActivitySellerSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
        binding = ActivitySellerSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.tvSellerLogin.setOnClickListener {
//            val intent = Intent(this, ActivitySellerLogin::class.java)
//            startActivity(intent)
//        }
//        binding.btnSellerCreateAccount.setOnClickListener {
//            val intent = Intent(baseContext, ActivitySellerVerification::class.java)
//            startActivity(intent)
//        }
        binding.btnSellerCreateAccount.setOnClickListener {

            val firsName = binding.etSellerFirstName.text.toString()
            val lastName = binding.etSellerLastName.text.toString()
            val email = binding.etSellerEmail.text.toString()
            val password = binding.etSellerPassword.text.toString()
            val confirmPassword = binding.etSellerConfirmPassword.text.toString()

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
                        startActivity(Intent(this, ActivitySellerLogin::class.java))
                        finish()
                    }
                }
        }
        // click listener for layout
        binding.tvSellerLogin.setOnClickListener {
            val intent = Intent(this, ActivitySellerLogin::class.java)
            startActivity(intent)
        }

        binding.btnSellerCreateAccount.setOnClickListener {
            val intent= Intent(baseContext, ActivitySellerLogin::class.java)
            startActivity(intent)
        }


    }
    }
