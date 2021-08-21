package com.s0xzwasd.quizzer;

import java.util.Scanner;

public class Interviewer extends User {
    public void introduction(User user) {
        System.out.println("Please, wait a bit...");

        System.out.println("Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: list, add, remove, exit");

        String command = "";
        Scanner scanner = new Scanner(System.in);

        do {
            command = scanner.next();

            switch (command) {
                case "list":
                    System.out.println("Questions and answers list");
                    break;
                case "add":
                    System.out.println("Add a new question");
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
