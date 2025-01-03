package com.example.quizapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.quizapp.R
import com.example.quizapp.utils.NetworkUtil

class ScienceNatureNoInternetActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science_nature_no_internet)
        findViewById<Button>(R.id.retryButton).setOnClickListener {
            if (NetworkUtil.isConnectedToInternet(this)) {
                // Retry logic: Go back to the main activity
                val intent = Intent(this,ScienceNatureQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Still no internet connection.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}