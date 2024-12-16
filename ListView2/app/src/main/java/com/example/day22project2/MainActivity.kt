package com.example.day22project2

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

  lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

      val name = arrayOf("Prashant","Ajay","Ravi","Anuj","Kavi")

        val lastMsg = arrayOf("Hey what is going on","good", "okay bro", "cool ha", "samjh gaya")

       val lastTime = arrayOf("6:25 AM", "8:25 AM","6:45 PM","10:25 AM","5:30 PM" )

       val phoneNumber = arrayOf("9720802067","9997003766","9761615797","9995008485","9720802080")

        val imgId = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5)


        userArrayList = ArrayList()

        for (eachIndex in name.indices) {
            val user = User(name[eachIndex], lastMsg[eachIndex], lastTime[eachIndex],phoneNumber[eachIndex],
                imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.mylistView)
        listView.isClickable = true
        listView.adapter = MYAdapter(this,userArrayList)



    }
}