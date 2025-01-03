package com.example.quizapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.example.quizapp.R
import com.example.quizapp.utils.MoviesConstant
import com.example.quizapp.utils.ScienceNature

class MoviesResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_result)
        val lottieAnimationView : LottieAnimationView? = findViewById(R.id.lottieAnimation)
        lottieAnimationView?.setFailureListener{
            Log.e("Lootle","Failed to load animation")
        }


        lottieAnimationView?.setAnimation(R.raw.trophy)
        lottieAnimationView?.loop(true)
        lottieAnimationView?.playAnimation()


        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(MoviesConstant.USER_NAME)

        val totalQuestions = intent.getIntExtra(MoviesConstant.TOTAL_QUESTIONS,0)
        val correctQuestions  = intent.getIntExtra(MoviesConstant.CORRECT_ANSWERS,0)

        tvScore.text = "Your Score is $correctQuestions out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MoviesMainActivity::class.java))
            finish()
        }
    }
}