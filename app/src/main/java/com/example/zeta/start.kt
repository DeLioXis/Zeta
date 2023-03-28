package com.example.zeta

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import java.util.Timer

class start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)
        val intent = Intent(this, MainActivity::class.java)

        val logo: ImageView= findViewById(R.id.Icon)
        val title: TextView = findViewById(R.id.title)


        logo.animate().apply {
            duration = 500
            alpha(0f)


        }.withEndAction(){
            logo.animate().apply {
                alpha(1f)
                translationY(-150f)
            }
        }.start()
        title.animate().apply {
            duration = 500
            alpha(0f)

        }.withEndAction(){
            title.animate().apply {
                alpha(1f)
                translationY(-150f)
            }
        }.start()
        Handler().postDelayed({ startActivity(intent) }, 2000)

    }
}