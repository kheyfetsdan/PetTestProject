package com.example.pettestproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeText (view: View) {

        val showTextView = findViewById<TextView>(R.id.labelText)

        showTextView.text = "Change your *** pussy"
    }

    fun clear (view: View) {

        val showTextView = findViewById<TextView>(R.id.labelText)

        showTextView.text = ""
    }
}
