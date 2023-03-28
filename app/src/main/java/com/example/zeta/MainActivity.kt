package com.example.zeta

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle
import android.widget.RelativeLayout
import java.sql.DatabaseMetaData


class MainActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var handler: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = (DBHelper(this))


        //Логин пароль
        val pass = uwu().Password
        val idnumb = "88005553535"
        val textID = findViewById<EditText>(R.id.ID)
        val textPass = findViewById<EditText>(R.id.Pass)

        //Кнопки
        val button: Button = findViewById<Button>(R.id.SignBut)
        val button1: TextView = findViewById(R.id.forpass)





        //Забыл пароль
        button1.setOnClickListener {
            val intent = Intent(this, forg_pass::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val msg: String = textID.text.toString()
            val msi: String = textPass.text.toString()
            if(msg.trim().length>0 && msi.trim().length>0) {
                val intent = Intent(this, list::class.java)
                login = findViewById(R.id.ID)
                password = findViewById(R.id.Pass)
                val first = login.text.toString().toInt()
                val second = password.text.toString()

                if(handler.sign_out(first, second))
                    startActivity(intent)
                else{
                    Toast.makeText(applicationContext, "Check your ID or Password! ", Toast.LENGTH_SHORT).show()
                }
                }


////                if(login.text.toString() == idnumb && password.text.toString() == pass) {
////                    intent.putExtra("login", login.text.toString())
////                    startActivity(intent)
////                }
////                else{
////                    Toast.makeText(applicationContext, "Please enter some message! ", Toast.LENGTH_SHORT).show()
////                }
            else{
                Toast.makeText(applicationContext, "Please enter some message! ", Toast.LENGTH_SHORT).show()
            }

        }
    }

}