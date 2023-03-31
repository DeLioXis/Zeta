package com.example.zeta

import android.app.Activity
import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle
import android.widget.RelativeLayout
import java.sql.DatabaseMetaData
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement


class MainActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var handler: DBHelper


    companion object {
        const val DATABASE_NAME = "zetadb"
        const val DATABASE_VERSION = 1

        const val TABLE_NAME = "users"

        const val KEY_ID = "Id"
        const val KEY_PASSWORD = "Password"

        const val SURNAME = "Surname"
        const val NAME = "Name"
        const val LASTNAME = "Lastname"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = (DBHelper(this))


        //Логин пароль
        val pass = "qwerty"
        val idnumb = "88005553535"

        login = findViewById(R.id.ID)
        password = findViewById(R.id.Pass)


        //Кнопки
        val button: Button = findViewById<Button>(R.id.SignBut)
        val button1: TextView = findViewById(R.id.forpass)


        //Забыл пароль
        button1.setOnClickListener {
            val intent = Intent(this, forg_pass::class.java)
            startActivity(intent)
        }



        //////////////////////////////////////////////////////////////////////
        //ПОДКЛЮЧЕНИЕ К БД

       /* val url = "jdbc:sqlite:zetadb.db"
        val conn = DriverManager.getConnection(url)
        val stmt: Statement = conn.createStatement()


        val querry = "select * from users where Id = 'first' and Password = 'second'"
        val rs : ResultSet = stmt.executeQuery(querry)*/



        ////////////////////////////////////////////////////////////////////



        button.setOnClickListener {



            val msg: String = login.text.toString()
            val msi: String = password.text.toString()
            if (msg.trim().length > 0 && msi.trim().length > 0) {
                val intent = Intent(this, list::class.java)

                val first = login.text.toString().toInt()
                val second = password.text.toString()

                if(first == 1 && second == uwu().Password){
                    intent.putExtra("password", pass)


                }

                //if (rs.next()) startActivity(intent)
                else {
                    Toast.makeText(
                        applicationContext,
                        "Check your ID or Password! ",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            else {
                Toast.makeText(
                    applicationContext,
                    "Please enter some message! ",
                    Toast.LENGTH_SHORT
                ).show()
            /*rs.close()
            stmt.close()
            conn.close()*/
        }
        }
    }




}