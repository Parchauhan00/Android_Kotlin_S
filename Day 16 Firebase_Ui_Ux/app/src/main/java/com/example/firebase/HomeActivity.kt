package com.example.firebase

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val mail = intent.getBundleExtra(SignInActivity.KEY1)
        val name = intent.getBundleExtra(SignInActivity.KEY2)
        val userId = intent.getBundleExtra(SignInActivity.KEY3)

        val welcomeText = findViewById<TextView>(R.id.welcomtextView)
        val mailText = findViewById<TextView>(R.id.mail1)
        val idText = findViewById<TextView>(R.id.id1)

        welcomeText.text = "Welcome $name"
        mailText.text = "Mail : $mail"
        idText.text = "UserId : $userId"



    }
}