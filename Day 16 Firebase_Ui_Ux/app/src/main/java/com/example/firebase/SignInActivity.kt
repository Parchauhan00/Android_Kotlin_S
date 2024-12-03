package com.example.firebase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignInActivity : AppCompatActivity() {
   private lateinit var databaseReference: DatabaseReference
   companion object {
       const val KEY1 = "com.example.firebase.SignInActivity.mail"
       const val KEY2 = "com.example.firebase.SignInActivity.name"
       const val KEY3 = "com.example.firebase.SignInActivity.id"
   }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)


        val signInButton = findViewById<Button>(R.id.signin)
        val username = findViewById<TextInputEditText>(R.id.usernameEditText)

        signInButton.setOnClickListener {
            // Take reference till nofe "Users"
            val uniqueid = username.text.toString()
            if (uniqueid.isNotEmpty()) {
                readData(uniqueid)
            } else{
                Toast.makeText(this,"Please enter user name",Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun readData(uniqueid: String) {
         databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(uniqueid).get().addOnSuccessListener {

          // if user exist or not
            if (it.exists()) {
                // welcome use in your app, with intent and also pass
                val email = it.child("email").value
                val name = it.child("name").value
                val useId = it.child("uniqueId").value

                val intentHome = Intent(this,HomeActivity::class.java)
                intentHome.putExtra(KEY1,email.toString())
                intentHome.putExtra(KEY2,name.toString())
                intentHome.putExtra(KEY3,useId.toString())

                startActivity(intentHome)
            } else {
                Toast.makeText(this,"User Does not exixt", Toast.LENGTH_SHORT).show()
            }

        }.addOnFailureListener{
            Toast.makeText(this,"",Toast.LENGTH_SHORT).show()
        }
    }
}