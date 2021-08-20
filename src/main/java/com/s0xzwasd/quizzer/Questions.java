package com.s0xzwasd.quizzer;

import java.util.ArrayList;
import java.util.Scanner;

public class Questions {
    ArrayList<String> questionsList = new ArrayList<>();

    public ArrayList<String> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(String question) {
        questionsList.add(question);
    }

    public void addQuestion(Questions questions) {
        System.out.println("Please, specify a question in the field:");

        Scanner ins = new Scanner(System.in);
        String question = ins.next();

        questions.questionsList.add(question);
        System.out.println("Congrats! You've added a new question.");

        System.out.println("The list of the questions is following:" + questions.getQuestionsList());
    }
}
