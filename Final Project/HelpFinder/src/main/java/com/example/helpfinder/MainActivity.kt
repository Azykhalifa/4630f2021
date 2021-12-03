package com.example.helpfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signup1 = findViewById<Button>(R.id.signup)
        signup1.setOnClickListener {
            val intent = Intent( this, signup::class.java)
            startActivity(intent)
        }
        val login1 = findViewById<Button>(R.id.login)
        login1.setOnClickListener {
            val intent = Intent( this, mainpage::class.java)
            startActivity(intent)
        }

    }
}