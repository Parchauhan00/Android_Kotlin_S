package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
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

        val listView = findViewById<ListView>(R.id.listview);

        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complet the app Dev Project")
        taskList.add("Work on Resume")
        taskList.add("Work on Resume")
        taskList.add("Visit tample on Tuesday")
        taskList.add("Improve presence")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item :" +(view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()


        }

    }
}