package com.benten.bmicalculatorcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editHeight:EditText = findViewById(R.id.etHeight)
        val edWeight:EditText = findViewById(R.id.etWeight)
        val button:Button = findViewById(R.id.testButton)
        val bmiTextView:TextView =  findViewById(R.id.tvYourBmi)
        val imageView:ImageView = findViewById(R.id.)

        button.setOnClickListener{    }


    }




}