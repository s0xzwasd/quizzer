package com.s0xzwasd.quizzer;

import java.util.ArrayList;
import java.util.Scanner;

public class Interviewer extends User {
    public void introduction(User user) {
        System.out.println("Please, wait a bit...");

        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: list, add, remove (TBD), exit");

        ArrayList<Question> questions = new ArrayList<>();

        String command = "";
        Scanner scanner = new Scanner(System.in);

        do {
            command = scanner.next();

            switch (command) {
                case "list":
                    // TODO: Refactor and move it to a different method.
                    if (!questions.isEmpty()) {
                        System.out.println("Questions and answers list:");

                        for (Question q : questions) {
                            System.out.println(q);
                        }
                    } else {
                        System.out.println("Currently the list of questions is empty.");
                    }

                    break;
                case "add":
                    // TODO: Refactor add move it to a different method.
                    System.out.println("Please, specify a question:");
                    Scanner scannerQ = new Scanner(System.in);
                    String scanQuestion = scannerQ.nextLine();

                    System.out.println("Question is specified. Please, specify a correct answer:");
                    // TODO: Investigate how to avoid Scanner spawning commands.
                    Scanner scannerA = new Scanner(System.in);
                    String correctAnswer = scannerA.nextLine();

                    System.out.println("Correct answer is specified. Please, specify other answers (type end to " +
                            "finish):");

                    ArrayList<String> answers = new ArrayList<>();

                    String answersCommand = "";

                    do {
                        Scanner scannerAC = new Scanner(System.in);
                        answersCommand = scannerAC.nextLine();

                        if (answersCommand.equals("end")) {
                            System.out.println("Back to the main menu. Available commands: list, add, remove, exit");
                        } else {
                            answers.add(answersCommand);
                            System.out.println("Answer is added successfully! Type end to close it.");
                        }
                    } while (!answersCommand.equals("end"));

                    Question question = new Question(scanQuestion, correctAnswer, answers);
                    questions.add(question);
                    System.out.println("Question successfully added.");
                    break;
                case "remove":
                    System.out.println("Remove a question");
                    break;
                case "exit":
                    System.out.println("Exit from the program..");
                    break;
                default:
                    System.out.println("Invalid command: " + command + ". Please, try again.");
                    break;
            }
        } while (!command.equals("exit"));
    }
}
