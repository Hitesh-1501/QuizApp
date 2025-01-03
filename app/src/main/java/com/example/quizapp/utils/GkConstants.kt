package com.example.quizapp.utils

import com.example.quizapp.model.GkQuestions
import com.example.quizapp.model.Question

object GkConstants {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getGkQuestions(): ArrayList<GkQuestions>{
        val gkQuestionList = ArrayList<GkQuestions>()
        val que1 =  GkQuestions(
            1,"What is the largest planet in our solar system?",
            "Earth","Mars","Jupiter","Saturn",3
        )
        gkQuestionList.add(que1)

        val que2 = GkQuestions(
            2,"Which element has the chemical symbol \'O\'?",
            "Gold","Oxygen","Osmium","Oxide",2
        )
        gkQuestionList.add(que2)

        val que3 = GkQuestions(
            3,"In which year did World War II end?",
            "1939","1941","1945", "1950",3
        )
        gkQuestionList.add(que3)

        val que4 = GkQuestions(
            4,"Which country is known as the \"Land of the Rising Sun\"?",
            "China","Thailand","Japan","South Korea",3
        )
        gkQuestionList.add(que4)

        val que5 = GkQuestions(
            5,"Which ocean is the largest by surface area?",
            "Atlantic Ocean","Indian Ocean", "Southern Ocean", "Pacific Ocean",
            4
        )
        gkQuestionList.add(que5)

        val que6 = GkQuestions(
            6,"Which country gifted the Statue of Liberty to the United States?",
            "United Kingdom","France", "Spain","Italy",
            2
        )
        gkQuestionList.add(que6)

        val que7 = GkQuestions(
            7,"Which is the longest mountain range in the world?",
            "Andes" ,"Himalayas", "Rockies","Alps",
            1

        )
        gkQuestionList.add(que7)

        val que8 = GkQuestions(
            8,"What is the largest desert in the world?",
            "Sahara", "Arabian Desert","Gobi Desert",
            "Antarctic Desert",4
        )
        gkQuestionList.add(que8)
        val que9 = GkQuestions(
            9,"Which organ in the human body is primarily responsible for filtering blood?",
            "Heart","Liver","Kidneys","Lungs",
            3
        )
        gkQuestionList.add(que9)

        val que10 = GkQuestions(
            10,"Who is the author of the Harry Potter series?",
            "J.R.R. Tolkien","J.K. Rowling", "C.S. Lewis",
            "Suzanne Collins",2
        )
        gkQuestionList.add(que10)

        return gkQuestionList
    }
}