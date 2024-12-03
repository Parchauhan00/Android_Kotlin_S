package com.example.customisealertbox

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Create a Variable of type Dialog
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find the button in activity_main.xml
        val myButton = findViewById<Button>(R.id.buttonclick)
        // Initialize the dialog and set its content view
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)

        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.background_alertbox))
        // Creating variables for the custom_dialogue.xml design
        val buttonGood = dialog.findViewById<Button>(R.id.buttonGood)
        val buttonFeedback = dialog.findViewById<Button>(R.id.buttFeedback)

        // Set click listeners instead of key listeners
        buttonGood.setOnClickListener {
            dialog.dismiss() // Close the dialog when buttonGood is clicked
        }
        buttonFeedback.setOnClickListener {
            // Perform an action (e.g., show a Toast or start a new activity)
        }

        // Show the dialog when myButton is clicked
        myButton.setOnClickListener {
            dialog.show()
        }
    }
}
