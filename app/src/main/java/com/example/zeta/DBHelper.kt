package com.example.zeta

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper



class DBHelper (context: Context): SQLiteOpenHelper (context, DATABASE_NAME, null, DATABASE_VERSION){
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
    override fun onCreate(db: SQLiteDatabase?) {
        /*val createTable = "CREATE TABLE" + TABLE_NAME + " (" + ID +	"INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            PASSWORD + 	"Varchar(50)," +
            SURNAME + "Varchar(50),"
            NAME + 	"Varchar(50),"
            LASTNAME + "Varchar(50))";
        p0?.execSQL(createTable)*/

        db?.execSQL("""
                CREATE TABLE $TABLE_NAME(
                $KEY_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $KEY_PASSWORD TEXT NOT NULL,
                $SURNAME TEXT NOT NULL,
                $NAME TEXT NOT NULL,
                $LASTNAME TEXT NOT NULL)""")

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun sign_out(ID: Int, Password: String) : Boolean {

        val db = this.readableDatabase
        val querry = "select * from $TABLE_NAME where $KEY_ID  = '$ID' and $KEY_PASSWORD = '$Password'"
        val check = db.rawQuery(querry, null)
        if(check.count <= 0) {
            check.close()
            return false
        }
        check.close()
        return true
        }
    }


