package com.example.moodbook

object BookDatabase {
    private val books = mapOf(
        "Happy" to Book("The Little Prince", "A philosophical tale that reminds us to see the world through the eyes of a child."),
        "Sad" to Book("Les Misérables", "A story of redemption, compassion, and the struggle for justice."),
        "Inspired" to Book("The Alchemist", "A journey of following your dreams and finding your purpose."),
        "Calm" to Book("The Wind-Up Bird Chronicle", "A meditative and mysterious story about identity and fate.")
    )

    fun getBookSuggestion(mood: String): Book {
        return books[mood] ?: Book("Unknown", "No book found for this mood.")
    }
}
