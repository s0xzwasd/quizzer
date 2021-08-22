package com.s0xzwasd.quizzer;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    public void introduction(User user, ArrayList<Question> questions) {
        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: start, list (ls), exit");

        String command = "";
        Scanner scanner = new Scanner(System.in);

        do {
            command = scanner.next();

            switch (command) {
                case "start":
                    // TODO: Move it to a different method.
                    int score = 0;

                    System.out.println("Start quiz!");

                    for (Question question : questions) {
                        System.out.println("\t" + question.getQuestion());
                        System.out.println("\t\tOptions: " + question.getAnswerList());

                        Scanner answerScanner = new Scanner(System.in);

                        if (answerScanner.nextLine().equals(question.getCorrectAnswer())) {
                            score += 1;

                            System.out.println(question.getCorrectAnswer() + " is a correct answer. Congrats!");
                        } else {
                            System.out.println("The answer is not correct.");
                        }
                    }

                    System.out.println("The quiz is ended. Your score is " + score + ".");
                case "list":
                case "ls":
                    // TODO: Add cases for 0 or 1 question.
                    System.out.println("Currently there is " + questions.size() + " questions in the list.");
            }
        } while (!command.equals("exit"));
    }
}
