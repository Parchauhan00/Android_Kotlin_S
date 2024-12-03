package com.example.multicard_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
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

        var appDevbtn = findViewById<CardView>(R.id.appDev1)

        var supportbtn = findViewById<TextView>(R.id.support1)

        var webdevBtn = findViewById<CardView>(R.id.webDev1)

        var iosBtn = findViewById<CardView>(R.id.iosDev1)

         iosBtn.setOnClickListener{
             val intent = Intent(applicationContext,IOS_Activity::class.java)
             startActivity(intent)
             Toast.makeText(applicationContext,"IOS information",Toast.LENGTH_SHORT).show()
         }

        webdevBtn.setOnClickListener{
            var intent = Intent(applicationContext,Web_Dev_Activity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Web Dev Info",Toast.LENGTH_SHORT).show()
        }

        supportbtn.setOnClickListener{
            supportbtn.setBackgroundResource(R.color.yello)
            Toast.makeText(applicationContext,"Yellow mode is no",Toast.LENGTH_SHORT).show()
        }

        appDevbtn.setOnClickListener {
            var intent = Intent(applicationContext,APP_Dev_Activity::class.java)
            startActivity(intent)
        }

    }
}