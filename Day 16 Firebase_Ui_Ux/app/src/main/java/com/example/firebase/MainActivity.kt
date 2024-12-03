package com.example.firebase

import android.content.Intent
import  android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var signubtn = findViewById<Button>(R.id.signup)
        val edtname = findViewById<EditText>(R.id.edname)
        val edtmail = findViewById<EditText>(R.id.edMail)
        val edtid = findViewById<EditText>(R.id.edid)
        val edtpassword = findViewById<EditText>(R.id.edpassword)


        signubtn.setOnClickListener {
            val name = edtname.text.toString()
            val mail = edtmail.text.toString()
            val uniqueid = edtid.text.toString()
            val password = edtpassword.text.toString()


            val user = User(name, mail, password, uniqueid)

            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(uniqueid).setValue(user).addOnSuccessListener {
                edtname.text.clear()
                Toast.makeText(this,"User Registerd",Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }
        }

        val signInText = findViewById<TextView>(R.id.signInbtnmain)
        signInText.setOnClickListener{
            val openSignInActivity = Intent(this,SignInActivity::class.java)
            startActivity(openSignInActivity)
        }


    }
}