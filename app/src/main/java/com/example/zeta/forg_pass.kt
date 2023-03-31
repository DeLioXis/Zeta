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



        var text:TextView = findViewById(R.id.qwe)

        var ss = uwu().Password

        val button: Button = findViewById(R.id.save) as Button
        button.setOnClickListener {
            newpass = findViewById(R.id.newpass)
            val pass = newpass.text.toString()

            uwu().new(pass)
            ss = pass
            text.setText(ss)
        }



    }
}