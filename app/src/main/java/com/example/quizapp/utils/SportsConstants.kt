package com.example.quizapp.utils

import com.example.quizapp.model.HistoryModel
import com.example.quizapp.model.SportsQuestions

object SportsConstants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun sportsGetQuestions(): ArrayList<SportsQuestions> {
        val sportsQuestionList = ArrayList<SportsQuestions>()
        val que1 = SportsQuestions(
            1,"What is the national game of India?",
            "Cricket","Hockey","Kabaddi","Football",
            2
        )
        sportsQuestionList.add(que1)

        val que2 = SportsQuestions(
            2, "Which country has won the most FIFA World Cups?",
            "Germany", "Italy", "Brazil", "Argentina",
            3
        )
        sportsQuestionList.add(que2)

        val que3 = SportsQuestions(
            3, "Who is known as the 'Flying Sikh' of India?",
            "Sachin Tendulkar", "Milkha Singh", "P. T. Usha", "Abhinav Bindra",
            2
        )
        sportsQuestionList.add(que3)

        val que4 = SportsQuestions(
            4, "What is the length of a standard cricket pitch?",
            "20 meters", "22 meters", "18 meters", "24 meters",
            2
        )
        sportsQuestionList.add(que4)

        val que5 = SportsQuestions(
            5, "Which country hosted the first modern Olympic Games?",
            "France", "Greece", "Italy", "United Kingdom",
            2
        )
        sportsQuestionList.add(que5)

        val que6 = SportsQuestions(
            6, "Who was the first Indian to win an individual Olympic gold medal?",
            "Abhinav Bindra", "Leander Paes", "Neeraj Chopra", "Sushil Kumar",
            1
        )
        sportsQuestionList.add(que6)

        val que7 = SportsQuestions(
            7, "How many players are there in a soccer team on the field?",
            "9", "10", "11", "12",
            3
        )
        sportsQuestionList.add(que7)

        val que8 = SportsQuestions(
            8, "Which sport uses the term 'love' in scoring?",
            "Tennis", "Badminton", "Golf", "Basketball",
            1
        )
        sportsQuestionList.add(que8)

        val que9 = SportsQuestions(
            9, "Which country is known as the 'Home of Golf'?",
            "Ireland", "Scotland", "England", "United States",
            2
        )
        sportsQuestionList.add(que9)

        val que10 = SportsQuestions(
            10, "Who was the first batsman to score a double century in ODI cricket?",
            "Virender Sehwag", "Chris Gayle", "Sachin Tendulkar", "Rohit Sharma",
            3
        )
        sportsQuestionList.add(que10)

        return sportsQuestionList

    }
}