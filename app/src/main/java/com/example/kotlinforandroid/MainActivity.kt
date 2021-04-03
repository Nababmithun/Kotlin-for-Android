package com.example.kotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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



        //if----else when---else-----------

        var listener:View.OnClickListener=View.OnClickListener { view ->


            if (view.id==R.id.btn_one) {
                findViewById<TextView>(R.id.tv_logic).text = "Click button 1" + (view as Button).text
            }else{
                findViewById<TextView>(R.id.tv_logic).text="Wrong btn click"
            }
        }


        var button1=findViewById<Button>(R.id.btn_one)
        var button2=findViewById<Button>(R.id.btn_two)
        var button3=findViewById<Button>(R.id.btn_three)
        var button4=findViewById<Button>(R.id.btn_four)


        button1.setOnClickListener { listener }
        button2.setOnClickListener { listener }
        button3.setOnClickListener { listener}
        button4.setOnClickListener { listener }


    }
}