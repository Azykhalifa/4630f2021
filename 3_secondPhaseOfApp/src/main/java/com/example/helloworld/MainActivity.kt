package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            Toast.makeText(this,"Thanks for clicking me", Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
           val intent = Intent(this, second_activity::class.java)
            startActivity(intent)
        }
    }
}