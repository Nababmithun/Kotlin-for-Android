package com.example.kotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //btn click with Textview Create
        val btnhello = findViewById<Button>(R.id.btn_hello)
        val tvhello =findViewById<TextView>(R.id.tv_hello)

        btnhello.setOnClickListener{
            tvhello.text="Hello from Kotlin. Enjoy simplicity!"
        }



        //btn click with Toast Show
        //System one ---------
        val messsage:String="Hi Toast"
        findViewById<Button>(R.id.btn_toast).setOnClickListener { Toast.makeText(this@MainActivity,messsage,Toast.LENGTH_SHORT).show() }

        //System Two------------
        findViewById<Button>(R.id.btn_toast).setOnClickListener { Toast.makeText(this@MainActivity,"Hi Toast",Toast.LENGTH_SHORT).show() }


    }
}