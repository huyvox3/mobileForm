package com.example.loginform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val tx = findViewById<TextView>(R.id.signUpTV)
        tx.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
        }
    }
}