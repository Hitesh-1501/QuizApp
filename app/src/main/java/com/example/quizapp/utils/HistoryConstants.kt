package com.example.quizapp.utils

import com.example.quizapp.model.HistoryModel

object HistoryConstants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun historyGetQuestions(): ArrayList<HistoryModel> {
        val historyQuestionList = ArrayList<HistoryModel>()

        val que1 = HistoryModel(
            1, "Who is known as the \"Father of the Nation\" in India?",
            "Jawaharlal Nehru", "Mahatma Gandhi",
            "Subhas Chandra Bose", "Sardar Vallabhbhai Patel", 2
        )
        historyQuestionList.add(que1)
        val que2 = HistoryModel(
            2, "When did India gain independence from British rule?",
            "August 15, 1945", "August 15, 1947",
            "January 26, 1947", "January 26, 1950", 2
        )
        historyQuestionList.add(que2)

        val que3 = HistoryModel(
            3, "Who was the first Mughal Emperor of India?",
            "Akbar", "Babur",
            "Humayun", "Shah Jahan", 2
        )
        historyQuestionList.add(que3)

        val que4 = HistoryModel(
            4,
            "The Battle of Plassey (1757) marked the beginning of British dominance in India. Who led the British forces in this battle?",
            "Lord Cornwallis",
            "Robert Clive",
            "Warren Hastings",
            "James Wolfe",
            2
        )
        historyQuestionList.add(que4)

        val que5 = HistoryModel(
            5, "Which Indian ruler was known as the \"Tiger of Mysore\"?",
            "Tipu Sultan", "Haider Ali",
            "Shivaji Maharaj", "Rani Lakshmibai", 1
        )
        historyQuestionList.add(que5)

        val que6 = HistoryModel(
            6,
            "In which year did the Revolt of 1857, also known as the First War of Independence, take place?",
            "1847",
            "1857",
            "1867",
            "1877",
            2
        )
        historyQuestionList.add(que6)

        val que7 = HistoryModel(
            7, "Who was the first Indian Governor-General of independent India?",
            "Rajendra Prasad", "C. Rajagopalachari",
            "Jawaharlal Nehru", "Sardar Patel", 2
        )
        historyQuestionList.add(que7)

        val que8 = HistoryModel(
            8, "The Indus Valley Civilization is known for which unique feature?",
            "Fortified cities", "Well-planned drainage systems",
            "Advanced military technology", "Widespread use of iron", 2
        )
        historyQuestionList.add(que8)

        val que9 = HistoryModel(
            9, "Who established the Maurya Empire in India?",
            "Ashoka", "Chandragupta Maurya",
            "Bindusara", "Harsha", 2
        )
        historyQuestionList.add(que9)

        val que10 = HistoryModel(
            10, "During whose reign was the Taj Mahal built?",
            "Akbar", "Jahangir",
            "Shah Jahan", "Aurangzeb", 3
        )
        historyQuestionList.add(que10)

        return historyQuestionList
    }
}