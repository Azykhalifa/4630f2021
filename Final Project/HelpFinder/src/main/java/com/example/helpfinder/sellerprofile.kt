package com.example.helpfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sellerprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sellerprofile)

        val demoprofile2 = findViewById<Button>(R.id.sprofilesubmit)
        demoprofile2.setOnClickListener {
            val intent = Intent(this, sellerprofileview::class.java)
            startActivity(intent)
        }

    }
}