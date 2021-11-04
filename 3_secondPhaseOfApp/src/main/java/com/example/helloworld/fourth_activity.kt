package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.barteksc.pdfviewer.PDFView


class fourth_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)



         val pdfview : PDFView = findViewById(R.id.pdfview)

        pdfview.fromAsset( "MohmmadazharKhalifaResume.pdf")
            .enableSwipe(true)
            .load()
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent( this, second_activity::class.java)
            startActivity(intent)
        }

    }
}