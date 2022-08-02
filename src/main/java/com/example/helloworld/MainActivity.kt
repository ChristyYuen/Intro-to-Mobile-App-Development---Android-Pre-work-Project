package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //show layout file

        // Display customized to show "Hello from Christy"
        // User acn change color of name label

        //Steps:
        // 1. Create a button
        // get button id // 2. Know when user clicked button
        findViewById<Button>(R.id.button).setOnClickListener{
            // Handling button tap // 2.1. When clicked, change text color
            Log.i("Christy", "Tapped button")
            // Ref to text view then set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

    }
}