package com.example.quizapp.utils

import com.example.quizapp.model.ScienceQuestions

object ScienceNature {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getScienceQuestions(): ArrayList<ScienceQuestions>{
        val scienceQuestionList = ArrayList<ScienceQuestions>()
        val que1 = ScienceQuestions(
            1," What is the main function of red blood cells?",
            " Carry oxygen", "Fight infection",
            "Regulate body temperature", "Produce hormones",1
        )
        scienceQuestionList.add(que1)
        val que2 = ScienceQuestions(
            2, "Which planet is known as the 'Red Planet'?",
            "Venus", "Earth",
            "Mars", "Jupiter", 3
        )
        scienceQuestionList.add(que2)

        val que3 = ScienceQuestions(
            3, "What is the hardest natural substance on Earth?",
            "Iron", "Diamond",
            "Gold", "Quartz", 2
        )
        scienceQuestionList.add(que3)

        val que4 = ScienceQuestions(
            4, "What is the chemical symbol for water?",
            "O", "H2O",
            "CO2", "O2", 2
        )
        scienceQuestionList.add(que4)

        val que5 = ScienceQuestions(
            5, "Who is known as the father of modern physics?",
            "Isaac Newton", "Albert Einstein",
            "Nikola Tesla", "Galileo Galilei", 2
        )
        scienceQuestionList.add(que5)

        val que6 = ScienceQuestions(
            6, "What is the largest organ in the human body?",
            "Brain", "Heart",
            "Liver", "Skin", 4
        )
        scienceQuestionList.add(que6)

        val que7 = ScienceQuestions(
            7, "What is the process by which plants make their own food using sunlight?",
            "Respiration", "Photosynthesis",
            "Digestion", "Germination", 2
        )
        scienceQuestionList.add(que7)

        val que8 = ScienceQuestions(
            8, "Which gas do plants absorb from the air for photosynthesis?",
            "Oxygen", "Nitrogen",
            "Carbon Dioxide", "Hydrogen", 3
        )
        scienceQuestionList.add(que8)

        val que9 = ScienceQuestions(
            9, "What is the powerhouse of the cell?",
            "Nucleus", "Mitochondria",
            "Ribosome", "Endoplasmic Reticulum", 2
        )
        scienceQuestionList.add(que9)

        val que10 = ScienceQuestions(
            10, "What is the chemical formula for methane?",
            "CH4", "C2H6",
            "CO2", "H2O", 1
        )
        scienceQuestionList.add(que10)

        val que11 = ScienceQuestions(
            11, "What is the study of plants called?",
            "Zoology", "Botany",
            "Geology", "Anthropology", 2
        )
        scienceQuestionList.add(que11)

        val que12 = ScienceQuestions(
            12, "What is the largest land animal on Earth?",
            "African Elephant", "Blue Whale",
            "Giraffe", "Rhinoceros", 1
        )
        scienceQuestionList.add(que12)

        val que13 = ScienceQuestions(
            13, "What is the main source of energy for the Earth?",
            "The Moon", "The Sun",
            "The Earth’s core", "Stars", 2
        )
        scienceQuestionList.add(que13)

        val que14 = ScienceQuestions(
            14, "What is the most common element in the Earth's atmosphere?",
            "Oxygen", "Hydrogen",
            "Nitrogen", "Carbon Dioxide", 3
        )
        scienceQuestionList.add(que14)

        val que15 = ScienceQuestions(
            15, "Which of the following is not a renewable source of energy?",
            "Solar", "Wind",
            "Geothermal", "Coal", 4
        )
        scienceQuestionList.add(que15)
        return scienceQuestionList
    }

}