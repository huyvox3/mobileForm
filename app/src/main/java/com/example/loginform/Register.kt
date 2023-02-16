package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val tx = findViewById<TextView>(R.id.alreadyHaveAccountTV)
        tx.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
    }
}