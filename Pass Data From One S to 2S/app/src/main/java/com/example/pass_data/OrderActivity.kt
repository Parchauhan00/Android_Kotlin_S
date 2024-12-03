//package com.example.pass_data
//
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class OrderActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_order)
//
//   val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
//
//        orderView.text = orderOfCustomer.toString()
//
//    }
//}


package com.example.pass_data

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // Retrieve the data passed from MainActivity
        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)

        // Find the TextView by its ID
        val orderView = findViewById<TextView>(R.id.orderView)

        // Set the retrieved order to the TextView
        orderView.text = "Order Placed" + orderOfCustomer.toString()
    }
}
