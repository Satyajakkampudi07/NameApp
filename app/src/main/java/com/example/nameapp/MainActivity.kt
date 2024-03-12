package com.example.nameapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstName:EditText = findViewById(R.id.first_name)
        val lastName:EditText = findViewById(R.id.last_name)
        val btn: Button =findViewById(R.id.btn)

        btn.setOnClickListener {
            val firstNameText = firstName.text.toString()
            val lastNameText = lastName.text.toString()
            val nav = Intent(this,SecondActivity::class.java)
            nav.putExtra("first_name",firstNameText)
            nav.putExtra("last_name",lastNameText)
            startActivity(nav)
        }

        }

}
