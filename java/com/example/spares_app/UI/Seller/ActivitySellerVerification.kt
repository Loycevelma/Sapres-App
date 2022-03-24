package com.example.spares_app.UI.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.spares_app.databinding.ActivitySellerVerificationBinding
import com.google.firebase.auth.FirebaseAuth

class ActivitySellerVerification : AppCompatActivity() {
    lateinit var binding: ActivitySellerVerificationBinding

    //    private val CREDENTIAL_PICKER_REQUEST = 1
//    private val SMS_CONSENT_REQUEST = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSellerVerify.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerLogin::class.java)
            startActivity(intent)
        }
    }
}
//        sendEmailVerification()

//    fun sendEmailVerification() {
//        //get instance of firebase auth
//        val firebaseAuth = FirebaseAuth.getInstance()
//        //get current user
//        val firebaseUser = firebaseAuth.currentUser

//        //send email verification
//        firebaseUser!!.sendEmailVerification()
//            .addOnSuccessListener {
//                Toast.makeText(this@ActivitySellerLogin, "Instructions Sent...", Toast.LENGTH_SHORT).show()
//            }
//            .addOnFailureListener { e ->
//                Toast.makeText(this@ProfileActivity, "Failed to send due to " + e.message, Toast.LENGTH_SHORT).show()
//            }
//        if (firebaseUser.isEmailVerified()) {
//
//           Toast.makeText(this, "User is verified...", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "User isn't verified...", Toast.LENGTH_SHORT).show();
//        }
//    }

//}