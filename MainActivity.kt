package com.example.moodbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moodSpinner: Spinner = findViewById(R.id.moodSpinner)
        val bookText: TextView = findViewById(R.id.bookText)
        val suggestButton: Button = findViewById(R.id.suggestButton)

        val moods = listOf("Happy", "Sad", "Inspired", "Calm")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, moods)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        moodSpinner.adapter = adapter

        suggestButton.setOnClickListener {
            val mood = moodSpinner.selectedItem.toString()
            val book = BookDatabase.getBookSuggestion(mood)
            bookText.text = "${book.title}\n\n${book.summary}"
        }
    }
}
