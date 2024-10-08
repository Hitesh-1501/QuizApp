package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart:Button = findViewById(R.id.btn_start)
        val etName:EditText = findViewById(R.id.et_name)
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

    }
}