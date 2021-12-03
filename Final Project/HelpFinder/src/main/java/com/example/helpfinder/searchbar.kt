package com.example.helpfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class searchbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchbar)

        val demoprofile1 = findViewById<Button>(R.id.demoprofile)
        demoprofile1.setOnClickListener {
            val intent = Intent(this, sellerprofileview::class.java)
            startActivity(intent)
        }
    }

}