package com.example.pass_data

import android.content.Intent

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // creating key like static in java
    companion object {
        const val KEY = "com.example.pass_data.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var submitButton = findViewById<Button>(R.id.submtbtn)
        var ord1 = findViewById<EditText>(R.id.ord1)
        var ord2 = findViewById<EditText>(R.id.ord2)
        var ord3 = findViewById<EditText>(R.id.ord3)
        var ord4 = findViewById<EditText>(R.id.ord4)
        
        submitButton.setOnClickListener {

            val orderList = ord1.text.toString() + " " + ord2.text.toString() + "" +
                    ord3.text.toString() + " " +ord4.text.toString()

            intent = Intent(this,OrderActivity::class.java)
            intent.putExtra(KEY,orderList)
            startActivity(intent)
            Toast.makeText(this,"Order placed",Toast.LENGTH_SHORT).show()

    }
//            submitButton.setOnClickListener {
//                val ord1 = ord1.text.toString()
//                val ord2 = ord2.text.toString()
//                val ord3 = ord3.text.toString()
//                val ord4 = ord4.text.toString()
//
//                intent.putExtras("order1", ord1)
//
//                intent.putExtra(KEY, ord2)
//                intent.putExtra(KEY, ord3)
//                intent.putExtra(KEY, ord4)
//
//                startActivity(intent)
//
//            }
        }



    }
