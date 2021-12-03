package com.example.helpfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val submit1 = findViewById<Button>(R.id.acsubmit)
        submit1.setOnClickListener {
            val intent = Intent( this, mainpage::class.java)
            startActivity(intent)
        }
    }
}