package com.example.alertdialogues

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alertdialogues.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.button1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are Your Sure?")
            builder1.setMessage("Do You want to close the App")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                // What Action Should Be perform when user clicked yes
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                  // What action should be Performed when Yes is Clicked ?

            })
            builder1.show()
        }

        binding.button2.setOnClickListener {

            val  options = arrayOf("Gulab Jamun","White Rassgula","Rass Malai")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is Your sweet ")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, which ->
                // What Action should be Performed when user clicks on any option
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                // What Action Should Be perform when user clicked yes
               // finish()
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be Performed when Yes is Clicked ?

            })

            builder2.show()

        }

        binding.button3.setOnClickListener {

            val  options = arrayOf("Gulab Jamun","White Rassgula","Rass Malai")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is Your sweet ")
           builder2.setMultiChoiceItems(options, null, DialogInterface.OnClickListener { dialogInterface, i ->
               Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
           })

            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                // What Action Should Be perform when user clicked yes
                // finish()
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be Performed when Yes is Clicked ?

            })

            builder2.show()

        }

    }
}