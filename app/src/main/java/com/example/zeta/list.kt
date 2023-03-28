package com.example.zeta

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)

        val temp_id = getIntent().getStringExtra("login")


        val button: ImageButton = findViewById(R.id.profbut)
        button.setOnClickListener {
            val intent = Intent(this@list, main::class.java)
            intent.putExtra("login",temp_id.toString())
            startActivity(intent)
        }
    }
}