package com.example.implicit_intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var webButton = findViewById<CardView>(R.id.web)
        var camButton = findViewById<CardView>(R.id.camera)


        webButton.setOnClickListener{

            var intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Parchauhan00")
            startActivity(intent)
        }

//        camButton.setOnClickListener{
//
//          var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivity(intent)
//
//        }

        camButton.setOnClickListener {
            val phoneNumber = "tel:9720802067"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse(phoneNumber)
            }
            startActivity(intent)
        }


    }
}