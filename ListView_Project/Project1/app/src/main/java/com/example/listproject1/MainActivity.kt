package com.example.listproject1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listid)

        val tasklist = arrayListOf<String>()
        tasklist.add("Monday")
        tasklist.add("Tuesday")
        tasklist.add("Wednesday")
        tasklist.add("Thursday")
        tasklist.add("Friday")
        tasklist.add("Saturday")
        tasklist.add("Sunday")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_2, tasklist)
        listview.adapter = adapter
    }
}