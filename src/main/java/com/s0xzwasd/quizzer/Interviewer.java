package com.s0xzwasd.quizzer;

import java.util.Scanner;

public class Interviewer extends User {
    public void introduction(User user) {
        System.out.println("Please, wait a bit...");

        Questions questions = new Questions();
        questions.setQuestionsList("Who is the best in the world?");

        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: list, add, remove (TBD), update (TBD)");

        Scanner ins = new Scanner(System.in);
        String command = ins.next();

        switch (command) {
            case "list":
                System.out.println(questions.getQuestionsList());
                break;
            case "add":
                questions.addQuestion(questions);
                break;
            default:
                System.out.println("Please, enter only available commands");
        }
    }
}
