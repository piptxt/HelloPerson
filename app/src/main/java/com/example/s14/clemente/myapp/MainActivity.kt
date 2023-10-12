package com.example.s14.clemente.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputEt : EditText = findViewById(R.id.inputEt);
        var displayTv : TextView = findViewById(R.id.displayTv);
        var displayBtn : Button = findViewById(R.id.displayBtn);

        displayBtn.setOnClickListener{
                var hello = "Hello, " + inputEt.text.toString()
                displayTv.text = hello;
        }

    }
}