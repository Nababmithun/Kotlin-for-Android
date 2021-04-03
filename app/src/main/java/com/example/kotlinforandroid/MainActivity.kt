package com.example.kotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnhello = findViewById<Button>(R.id.btn_hello)
        val tvhello =findViewById<TextView>(R.id.tv_hello)


        btnhello.setOnClickListener{
            tvhello.text="Hello from Kotlin. Enjoy simplicity!"
        }


    }
}