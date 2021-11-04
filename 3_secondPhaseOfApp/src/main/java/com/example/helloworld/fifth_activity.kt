package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifth_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent = Intent(this, second_activity::class.java)
            startActivity(intent)
        }
    }
}