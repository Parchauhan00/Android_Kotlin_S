package com.example.listview

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


        val listView = findViewById<ListView>(R.id.listVid)

        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complet the App Dev Project")
        taskList.add("Buy Bhindi from Market")
        taskList.add("work on Resume")
        taskList.add("Improve Internet presence")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

    }
}