package com.s0xzwasd.quizzer;

import java.util.ArrayList;

public class Student extends User {
    public void introduction(User user, ArrayList<Question> questions) {
        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: start, end, exit");

        Question.showQuestions(questions);
    }
}
