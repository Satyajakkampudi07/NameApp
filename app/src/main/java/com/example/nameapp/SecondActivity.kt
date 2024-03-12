package com.example.nameapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView:TextView = findViewById(R.id.fullName)
        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")

        textView.text = "My name is $firstName $lastName"

        }
    }
