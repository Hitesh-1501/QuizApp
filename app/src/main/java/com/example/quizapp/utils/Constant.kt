package com.example.quizapp.utils

import com.example.quizapp.model.Question
import com.example.quizapp.R

object Constant {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which company does this logo represent?",
            R.drawable.microsoft,"Apple","Nike",
            "Samsung","Microsoft",
            4
        )
        questionsList.add(que1)

        val que2 = Question(
            1,"What is the name of this landmark?",
            R.drawable.indiagate,"Taj Mahal","Golden Temple",
            "India Gate","Red Fort",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            1, "What type of flower is this?",
            R.drawable.orchid,"Rose","Tulip",
            "Orchid","Sunflower",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4,  "Which car brand is this?",
            R.drawable.toyota,
            "Toyota", "Ford",
            "BMW", "Audi", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What dish is shown in this image?",
            R.drawable.pasta,
            "Sushi", "Tacos",
            "Dosa", "Pasta", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6,  "Which planet is shown in this image?",
            R.drawable.jupiter,
            "Mars", "Jupiter",
            "Saturn", "Venus", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What musical instrument is shown here?",
            R.drawable.violin,
            "Violin", "Cello",
            "Guitar", "Banjo", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What type of bird is this?",
            R.drawable.toucan,
            "Kiwi", "Peacock",
            "Quetzal", "Toucan", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10,  "Which animated movie features the character 'Simba'?",
            R.drawable.simba,
            "The Lion King", "Frozen",
            "Moana", "Aladdin", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}