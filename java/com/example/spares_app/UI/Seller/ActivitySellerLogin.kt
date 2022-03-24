package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.spares_app.UI.Buyer.ActivityDeliveryMethod
import com.example.spares_app.databinding.ActivitySellerLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize

class ActivitySellerLogin : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    lateinit var firebaseUser: FirebaseUser
    private val mAuth: FirebaseAuth? = null
    lateinit var binding: ActivitySellerLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
       Firebase.initialize(this)
      auth = FirebaseAuth.getInstance()

//        binding.btnLoginSeller.setOnClickListener {
//            val intent = Intent(baseContext, ActivitySellerLocation::class.java)
//            startActivity(intent)
//        }
        binding.tvSellerResetPassword.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerResetPassword::class.java)
            startActivity(intent)
        }
        binding.tvRegisterSeller.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerSignUp::class.java)
            startActivity(intent)
        }
        binding.btnLoginSeller.setOnClickListener {
            val email = binding.etemail.text.toString()
            val password = binding.etpassword.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            // signin with firebase
            fun createUser(email:String,password:String){
                auth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Log.e("Task Message","Task is successful")


//                            startActivity(Intent(this, MainActivity::class.java))
//                            finish()
                        }
                        else{
                            Log.e("Task Message","Failed"+task.exception)
                        }


                    }
            }
        }
    }
    private fun sendEmailVerification() {
        firebaseUser.let {
            it.sendEmailVerification().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this,"Email has been Sent to "+firebaseUser.email,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val user: FirebaseUser? = auth.currentUser
        user?.let {
            val intent = Intent(baseContext, ActivitySellerLocation::class.java)
            startActivity(intent)
        }

        }
    }
