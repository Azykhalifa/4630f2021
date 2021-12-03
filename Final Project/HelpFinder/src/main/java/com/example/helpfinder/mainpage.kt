package com.example.helpfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val csprofile = findViewById<Button>(R.id.csprofile)
        csprofile.setOnClickListener {
            val intent = Intent( this, sellerprofile::class.java)
            startActivity(intent)
        }

        val sbar = findViewById<Button>(R.id.sfservices)
        sbar.setOnClickListener {
            val intent = Intent( this, searchbar::class.java)
            startActivity(intent)
        }
    }
}