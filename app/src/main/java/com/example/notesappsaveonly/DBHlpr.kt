package com.example.notesappsaveonly

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHlpr(context: Context?) : SQLiteOpenHelper(context, "notes.db", null, 1) {
    var sqLiteDatabase: SQLiteDatabase=writableDatabase

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.execSQL("create table  deatailsnote ( personnote text)")
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldver: Int, newver: Int) {}
        fun savedata(s1:String){
            val cv= ContentValues()
            cv.put("personnote",s1)
            sqLiteDatabase.insert("deatailsnote",null,cv)

        }


}