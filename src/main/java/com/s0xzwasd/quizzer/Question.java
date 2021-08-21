package com.s0xzwasd.quizzer;

import java.util.ArrayList;

public class Question {
    private String question;
    private String correctAnswer;
    private ArrayList<String> answerList = new ArrayList<>();

    Question(String question, String correctAnswer, ArrayList<String> answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;

        for (int i = 0; i < answers.size(); i++) {
            answerList.add(answers.get(i));
        }
    }

    public String getQuestion() {
        return this.question;
    }

    @Override
    public String toString() {
        return question + "\n Correct answer is " + correctAnswer + ".\n Other answers are: " + answerList.toString();
    }

    static void showQuestions(ArrayList<Question> questions) {
        if (!questions.isEmpty()) {
            System.out.println("Questions and answers list:");
            for (int i = 0; i < questions.size(); i++) {
                System.out.println("Question #" + i + ": \n" + questions.get(i));
            }
        } else {
            System.out.println("Currently the list of questions is empty.");
        }
    }
}
