package com.example.moodbook

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UI Components
        val moodSpinner: Spinner = findViewById(R.id.moodSpinner)
        val suggestButton: Button = findViewById(R.id.suggestButton)
        val resultText: TextView = findViewById(R.id.resultText)

        // Mood options
        val moods = listOf("Happy", "Sad", "Calm", "Excited")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, moods)
        moodSpinner.adapter = adapter

        // When user clicks the button
        suggestButton.setOnClickListener {
            val selectedMood = moodSpinner.selectedItem.toString()
            val suggestion = getBookSuggestion(selectedMood)
            resultText.text = suggestion
        }
    }

    // Suggestion logic based on mood
    private fun getBookSuggestion(mood: String): String {
        return when (mood) {
            "Happy" -> "📖 *The Little Prince*\nA philosophical story about love, loneliness, and the meaning of life."
            "Sad" -> "📖 *Les Misérables*\nA touching story of poverty, justice, and redemption in 19th-century France."
            "Calm" -> "📖 *One Hundred Years of Solitude*\nA magical journey through generations of the Buendía family."
            "Excited" -> "📖 *Harry Potter and the Sorcerer’s Stone*\nAn adventure full of magic, friendship, and courage."
            else -> "No book found for this mood."
        }
    }
}
