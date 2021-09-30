package com.example.helloworld

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import android.view.View
import android.widget.Toast
//import android.R




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            Toast.makeText(this,"Thanks for clicking me", Toast.LENGTH_SHORT).show()
        }
    }

}

