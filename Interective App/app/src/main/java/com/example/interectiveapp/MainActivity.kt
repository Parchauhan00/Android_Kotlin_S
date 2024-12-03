package com.example.interectiveapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.buttonDark)
        val buttonRead = findViewById<Button>(R.id.buttonRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener{
            // Change to light mode
            layout.setBackgroundResource(R.color.yello)
           Toast.makeText(applicationContext,"yellow mode",Toast.LENGTH_SHORT).show()
        }
        
        buttonDark.setOnClickListener { 
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"Dark mode",Toast.LENGTH_SHORT).show()
        }


    }
}