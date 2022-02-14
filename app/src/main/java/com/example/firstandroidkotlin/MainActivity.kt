package com.example.firstandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //lateinit artinya late initialization
    //bertujuan untuk menunda/defer insialisasi/pemberian value pertama kali

    //var digunakan kalau variabelnya ingin fleksibel valuenya
    lateinit var teksHello:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        teksHello=findViewById(R.id.HelloWorld)

        teksHello.setText("hi, this is overridden text from the actual text")
    }
}