package com.implude.tutorial.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val go_back=findViewById<Button>(R.id.go_back)

        go_back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}