package com.example.notesappsaveonly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var ed:EditText
    lateinit var bt:Button
    lateinit var recyclerview: RecyclerView
    var s1=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview=findViewById(R.id.RV)
        ed=findViewById(R.id.editTextTextPersonName)
        bt=findViewById(R.id.button)
        bt.setOnClickListener {
        s1=ed.text.toString()

        var dbhr =DBHlpr(applicationContext)
        dbhr.savedata(s1)
            Toast.makeText(applicationContext, "data add", Toast.LENGTH_SHORT).show()




    }
}}