package com.example.moodbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodSpinner = findViewById<Spinner>(R.id.moodSpinner)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        val moods = listOf("happy", "sad", "calm", "angry")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, moods)
        moodSpinner.adapter = adapter

    }
}
