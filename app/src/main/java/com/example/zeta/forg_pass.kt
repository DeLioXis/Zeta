package com.example.zeta

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class forg_pass : AppCompatActivity() {
    lateinit var newpass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forg_pass)


        newpass = findViewById(R.id.newpass)
        var text:TextView = findViewById(R.id.qwe)


        val button: Button = findViewById(R.id.save) as Button
        button.setOnClickListener {
            uwu().Password = newpass.text.toString()
            text.setText(uwu().Password)
        }



    }
}