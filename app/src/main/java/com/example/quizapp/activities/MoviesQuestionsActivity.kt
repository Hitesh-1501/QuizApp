package com.example.quizapp.activities

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.quizapp.R
import com.example.quizapp.databinding.DialogCustomBackConfirmationBinding
import com.example.quizapp.model.MoviesQuestion
import com.example.quizapp.model.ScienceQuestions
import com.example.quizapp.utils.MoviesConstant
import com.example.quizapp.utils.NetworkUtil
import com.example.quizapp.utils.ScienceNature

class MoviesQuestionsActivity : AppCompatActivity(),View.OnClickListener {
    //Create global variables for the views in the layout
    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var buttonSubmit: Button? = null


    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<MoviesQuestion>? = null

    private var mCorrectAnswers:Int = 0
    // END


    private var mSelectedOptionPosition: Int = 0
    // END
    // get user name from Main Activity
    private var mUserName:String? = null
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_questions)
        // check internet connection
        if (!NetworkUtil.isConnectedToInternet(this)) {
            // Redirect to NoInternetActivity if no internet is available
            val intent = Intent(this,MoviesNoInternetActivity::class.java)
            startActivity(intent)
            finish()  // Finish the QuizQuestionActivity so the user can't go back to it
        } else {
            // If there's internet, proceed with normal setup for the quiz activity
            setContentView(R.layout.activity_movies_questions)
        }
        // Disable screenshots and screen recording for this activity
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )

        val toolbar: Toolbar? = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        toolbar?.setNavigationOnClickListener {
            customDialogForBackButton()
        }

        onBackPressedDispatcher.addCallback(this,object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                customDialogForBackButton()
            }
        })

        mUserName = intent.getStringExtra(MoviesConstant.USER_NAME)

        progressBar=findViewById(R.id.progresssBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        buttonSubmit = findViewById(R.id.btn_submit)
        mQuestionsList = MoviesConstant.moviesGetQuestions()
        // END
        // Shuffle questions for a new order each time the quiz starts
        mQuestionsList?.shuffle()

        setQuestion()

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)

        // TODO(STEP 1: Adding a click event for submit button.)
        buttonSubmit?.setOnClickListener (this)
    }
    private fun setQuestion() {

        val question: MoviesQuestion =
            mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.
        defaultOptionsView()
        enableOptions() // Enable options for a new question


        // TODO (STEP 6: Check here if the position of question is last then change the text of the button.)
        // START
        if (mCurrentPosition == mQuestionsList!!.size) {
            buttonSubmit?.text = "FINISH"
        } else{
            buttonSubmit?.text = "SUBMIT"
        }
        // END
        progressBar?.progress =
            mCurrentPosition // Setting the current progress in the progressbar using the position of question
        tvProgress?.text =
            "$mCurrentPosition/${progressBar?.max}" // Setting up the progress text

        // Now set the current question and the options in the UI
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }
    // TODO STEP 4
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_option_one -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)

                }

            }

            R.id.tv_option_two -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)

                }

            }

            R.id.tv_option_three -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)

                }

            }

            R.id.tv_option_four -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }

            // TODO Adding a click event for submit button. And change the questions and check the selected answers.)
            // START
            R.id.btn_submit ->{
                if(buttonSubmit?.text == "SUBMIT") {
                    // check if option is selected
                    if (mSelectedOptionPosition == 0) {
                        Toast.makeText(
                            this,
                            "Please select an answer before proceeding", Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        disableOptions()// Disable options once an answer is selected
                        val question =
                            mQuestionsList?.get(mCurrentPosition - 1) // Retrieves the current question

                        // This is to check if the selected  answer is wrong
                        if (question!!.correctAnswer != mSelectedOptionPosition) {
                            playSound(false)
                            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        } else {
                            playSound(true)
                            mCorrectAnswers++
                        }

                        // This is for correct answer
                        answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                        if (mCurrentPosition == mQuestionsList!!.size) {
                            buttonSubmit?.text = "FINISH"
                        } else {
                            buttonSubmit?.text = "GO TO NEXT QUESTION"
                        }

                        mSelectedOptionPosition = 0  //: Resets the selected option for the next question.
                    }
                }else{
                    // Handle "GO TO NEXT QUESTION" or "FINISH" actions
                    mCurrentPosition++
                    if (mCurrentPosition <= mQuestionsList!!.size) {
                        setQuestion() // Set the next question
                        enableOptions() // Re-enable options for the next question
                        buttonSubmit?.text = "SUBMIT" // Reset button text for next question
                    } else {
                        // End of quiz: move to ResultActivity
                        val intent = Intent(this, MoviesResultActivity::class.java)
                        intent.putExtra(MoviesConstant.USER_NAME, mUserName)
                        intent.putExtra(MoviesConstant.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(MoviesConstant.TOTAL_QUESTIONS, mQuestionsList?.size)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

    // Disable option clicks
    private fun disableOptions() {
        tvOptionOne?.isClickable = false
        tvOptionTwo?.isClickable = false
        tvOptionThree?.isClickable = false
        tvOptionFour?.isClickable = false
    }

    // Enable option clicks
    private fun enableOptions() {
        tvOptionOne?.isClickable = true
        tvOptionTwo?.isClickable = true
        tvOptionThree?.isClickable = true
        tvOptionFour?.isClickable = true
    }


    // TODO (STEP 5: Create a function for answer view.)
    // START
    /**
     * A function for answer view which is used to highlight the answer is wrong or right.
     */
    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this@MoviesQuestionsActivity,
                    drawableView
                )
            }
            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this@MoviesQuestionsActivity,
                    drawableView
                )
            }
            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this@MoviesQuestionsActivity,
                    drawableView
                )
            }
            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this@MoviesQuestionsActivity,
                    drawableView
                )
            }
        }
    }
    //TODO STEP 3
    /*
        The selectedOptionView function highlights the selected quiz option
        by applying a unique style to the chosen TextView
     */
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@MoviesQuestionsActivity,
            R.drawable.selected_option_border_bg
        )
    }

    //TODO STEP 2
    /*
        The defaultOptionsView function sets up a list of option TextViews
        and applies default styling to each one in a quiz activity
     */
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@MoviesQuestionsActivity,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun customDialogForBackButton(){
        val customDialog  = Dialog(this)
        val dialogBinding  = DialogCustomBackConfirmationBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        customDialog.setCanceledOnTouchOutside(false)
        dialogBinding.btnYes.setOnClickListener {
            val intent = Intent(this@MoviesQuestionsActivity,MoviesMainActivity::class.java)
            startActivity(intent)
            finish()
            customDialog.dismiss()
        }

        dialogBinding.btnNo.setOnClickListener {
            customDialog.dismiss()
        }
        customDialog.show()
    }

    private fun playSound(isCorrect: Boolean){
        val soundResId = if(isCorrect){
            R.raw.rightanswer
        }else{
            R.raw.wronganswer
        }
        mediaPlayer = MediaPlayer.create(this,soundResId)
        mediaPlayer?.start()

        mediaPlayer?.setOnCompletionListener {
            it.release()
            mediaPlayer = null
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        // Release MediaPlayer to avoid memory leaks
        mediaPlayer?.release()
        mediaPlayer = null
    }


}