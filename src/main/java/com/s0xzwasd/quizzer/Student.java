package com.s0xzwasd.quizzer;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    public void studentScanner(User user, ArrayList<Question> questions) {
        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: start, list (ls), exit");

        String command;
        Scanner scanner = new Scanner(System.in);

        do {
            command = scanner.next();
            switch (command) {
                case "start" -> {
                    startQuiz(questions);
                }
                case "list", "ls" -> displayListOfQuestions(questions);
                default -> System.out.println("Command is not recognized. Please, try again.");
            }
        } while (!command.equals("exit"));
    }

    private void startQuiz(ArrayList<Question> questions) {
        Scanner answerScanner = new Scanner(System.in);

        if (questions.size() > 0) {
            int score = 0;

            System.out.println("Start quiz!");

            for (Question question : questions) {
                System.out.println("\t" + question.getQuestion());
                System.out.println("\t\tOptions: " + question.getAnswerList());

                // Skipped questions queue
                ArrayList<Question> skippedQuestions = new ArrayList<>();

                if (answerScanner.hasNextLine() && answerScanner.nextLine().equals(question.getCorrectAnswer())) {
                    score += 1;
                    System.out.println(question.getCorrectAnswer() + " is a correct answer. Congrats!");
                } else if (answerScanner.hasNextLine() && answerScanner.nextLine().equals("skip")) {
                    skippedQuestions.add(question);
                    System.out.println("The question is skipped. You can answer on it later.");
                } else {
                    System.out.println("The answer is not correct.");
                }

                for (Question skippedQuestion : skippedQuestions) {
                    System.out.println("\t" + skippedQuestion.getQuestion());
                    System.out.println("\t\tOptions: " + skippedQuestion.getAnswerList());

                    if (answerScanner.nextLine().equals(skippedQuestion.getCorrectAnswer())) {
                        score += 1;
                        System.out.println(skippedQuestion.getCorrectAnswer() + " is a correct answer. Congrats!");
                    } else {
                        System.out.println("The answer is not correct.");
                    }
                }
            }

            System.out.println("The quiz is ended. Your score is " + score + ".");
        } else {
            System.out.println("There are no questions to start the quiz.");
        }

        answerScanner.close();
    }

    private void displayListOfQuestions(ArrayList<Question> questions) {
        switch (questions.size()) {
            case 0 -> System.out.println("There are no questions in the list.");
            case 1 -> System.out.println("There is 1 question in the list.");
            default -> System.out.println("Currently there is " + questions.size() + " questions in the list.");
        }
    }
}