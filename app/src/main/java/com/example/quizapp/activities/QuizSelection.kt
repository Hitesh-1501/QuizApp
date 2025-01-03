package com.example.quizapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityQuizSelectionBinding

class QuizSelection : AppCompatActivity() {
    var binding : ActivityQuizSelectionBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizSelectionBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.imageQuiz?.setOnClickListener{
            val intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding?.gk?.setOnClickListener{
            val intent = Intent(this,GeneralKnowledgeQuiz::class.java)
            startActivity(intent)
            finish()
        }
        binding?.llHistory?.setOnClickListener{
            val intent = Intent(this,HistoryMainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding?.llMovies?.setOnClickListener{
            val intent = Intent(this,MoviesMainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding?.llScience?.setOnClickListener{
            val intent = Intent(this,ScienceNatureMainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding?.llSports?.setOnClickListener{
            val intent = Intent(this,SportsMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}