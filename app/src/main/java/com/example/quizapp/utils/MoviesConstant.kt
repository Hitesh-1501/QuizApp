package com.example.quizapp.utils

import com.example.quizapp.model.MoviesQuestion

object MoviesConstant {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun moviesGetQuestions(): ArrayList<MoviesQuestion> {
        val moviesQuestionList = ArrayList<MoviesQuestion>()

        val que1 = MoviesQuestion(
            1, "Which Bollywood movie is based on the life of cricketer Mahendra Singh Dhoni?",
            "Bhaag Milkha Bhaag", "Dangal", "M.S. Dhoni: The Untold Story", "Chak De! India",
            3
        )
        moviesQuestionList.add(que1)

        val que2 = MoviesQuestion(
            2, "Who directed the movie 'Dilwale Dulhania Le Jayenge'?",
            "Aditya Chopra", "Karan Johar", "Yash Chopra", "Sanjay Leela Bhansali",
            1
        )
        moviesQuestionList.add(que2)

        val que3 = MoviesQuestion(
            3, "Which Bollywood movie features the song 'Jai Ho' that won an Oscar?",
            "Lagaan", "Mother India", "Slumdog Millionaire", "Devdas",
            3
        )
        moviesQuestionList.add(que3)

        val que4 = MoviesQuestion(
            4, "Who played the role of Sultan in the movie 'Sultan'?",
            "Shah Rukh Khan", "Aamir Khan", "Salman Khan", "Akshay Kumar",
            3
        )
        moviesQuestionList.add(que4)

        val que5 = MoviesQuestion(
            5, "Which Bollywood movie is known for the iconic dialogue, 'Mogambo Khush Hua'?",
            "Deewar", "Sholay", "Mr. India", "Don",
            3
        )
        moviesQuestionList.add(que5)

        val que6 = MoviesQuestion(
            6, "Which Hollywood actor is known for playing Iron Man in the MCU?",
            "Chris Evans", "Robert Downey Jr.", "Mark Ruffalo", "Chris Hemsworth",
            2
        )
        moviesQuestionList.add(que6)

        val que7 = MoviesQuestion(
            7, "Which movie is famous for the quote, 'I'll be back'?",
            "The Terminator", "Die Hard", "Predator", "RoboCop",
            1
        )
        moviesQuestionList.add(que7)

        val que8 = MoviesQuestion(
            8, "Who directed the blockbuster movie 'Avatar'?",
            "Christopher Nolan", "Steven Spielberg", "James Cameron", "Ridley Scott",
            3
        )
        moviesQuestionList.add(que8)

        val que9 = MoviesQuestion(
            9, "Which movie features the character Jack Sparrow?",
            "The Perfect Storm", "Pirates of the Caribbean", "Cast Away", "Treasure Island",
            2
        )
        moviesQuestionList.add(que9)

        val que10 = MoviesQuestion(
            10, "What is the highest-grossing Hollywood movie of all time as of 2024?",
            "Titanic", "Avengers: Endgame", "Avatar", "The Lion King",
            3
        )
        moviesQuestionList.add(que10)

        val que11 = MoviesQuestion(
            11, "Who directed the 'Baahubali' series?",
            "Trivikram Srinivas", "S. S. Rajamouli", "Sukumar", "Puri Jagannadh",
            2
        )
        moviesQuestionList.add(que11)

        val que12 = MoviesQuestion(
            12, "Which Tollywood movie won an Oscar for Best Original Song in 2023?",
            "Pushpa: The Rise", "RRR", "Ala Vaikunthapurramuloo", "Baahubali 2: The Conclusion",
            2
        )
        moviesQuestionList.add(que12)

        val que13 = MoviesQuestion(
            13, "Which Tollywood actor is known as the 'Rebel Star'?",
            "Chiranjeevi", "Mahesh Babu", "Prabhas", "Allu Arjun",
            3
        )
        moviesQuestionList.add(que13)

        val que14 = MoviesQuestion(
            14,
            "What is the title of Allu Arjun’s famous movie known for the dialogue 'Thaggede Le'?",
            "Pushpa: The Rise",
            "Sarrainodu",
            "Ala Vaikunthapurramuloo",
            "DJ",
            1
        )
        moviesQuestionList.add(que14)

        val que15 = MoviesQuestion(
            15, "Which Tollywood movie is based on the historical character Komaram Bheem?",
            "Magadheera", "RRR", "Syeraa Narasimha Reddy", "Rangasthalam",
            2
        )
        moviesQuestionList.add(que15)

        return moviesQuestionList

    }
}