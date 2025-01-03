package com.example.quizapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.example.quizapp.utils.Constant
import com.example.quizapp.R
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lottieAnimationView: LottieAnimationView? = findViewById(R.id.lottieAnimationView)
        lottieAnimationView?.setFailureListener {
            Log.e("Lootle", "Failed to load animation")
        }


        lottieAnimationView?.setAnimation(R.raw.quiz)
        lottieAnimationView?.loop(true)
        lottieAnimationView?.playAnimation()


        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Snackbar.make(it, "Name cannot be empty",Snackbar.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constant.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }

        val ivBack : ImageView = findViewById(R.id.ivv_back)
        ivBack.setOnClickListener{
            val intent = Intent(this@MainActivity,QuizSelection::class.java)
            startActivity(intent)
            finish()
        }

    }
}
