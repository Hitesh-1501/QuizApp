package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NoInternetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.no_internet_activity)
        // Retry button logic
        findViewById<Button>(R.id.retryButton).setOnClickListener {
            if (NetworkUtil.isConnectedToInternet(this)) {
                // Retry logic: Go back to the main activity
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Still no internet connection.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
