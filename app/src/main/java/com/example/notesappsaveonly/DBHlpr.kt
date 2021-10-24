package com.example.notesappsaveonly

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.recyclerview.widget.RecyclerView

class DBHlpr(context: Context?) : SQLiteOpenHelper(context, "notes.db", null, 1) {
    val sqLiteDatabase: SQLiteDatabase=writableDatabase


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
    @SuppressLint("Range")
    fun retrive (): ArrayList<String> {
        val c: Cursor = sqLiteDatabase.query(
            "deatailsnote",
            null,
            null,
            null,
            null,
            null,null
        )
        val list = arrayListOf<String>()
         if(c.moveToFirst()) {
        do {
            list.add(c.getString(c.getColumnIndex("personnote")))
        }while (c.moveToNext())



    }

        return list




    }


}