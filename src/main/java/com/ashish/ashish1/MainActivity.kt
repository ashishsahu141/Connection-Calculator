package com.ashish.ashish1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var enterfirstname:EditText
    lateinit var entersecondname:EditText
    lateinit var calculateConnection:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enterfirstname=findViewById(R.id.textView2)
        entersecondname=findViewById(R.id.textView3)
        calculateConnection=findViewById(R.id.calculate)
calculateConnection.setOnClickListener {
    val indent=Intent(this,MainActivity2::class.java)
    startActivity(indent as Intent?)
}

    }

    private fun Intent(mainActivity: MainActivity2, java: Class<MainActivity2>): Any {
        TODO("yet to implement")
    }
}

