package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        msg_edit_text=findViewById(.id.edit_text)
    }

    fun launch2ndActivity(view: View) {
        val text = "Hello"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text , duration)
        toast.show()

        intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}