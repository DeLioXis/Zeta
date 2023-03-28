package com.example.zeta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main)


        var message = getIntent().getStringExtra("login")
        var text:TextView = findViewById(R.id.numbid)
        text.setText(message)

    }
}