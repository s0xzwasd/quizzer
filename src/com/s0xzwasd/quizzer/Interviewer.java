package com.s0xzwasd.quizzer;

import java.util.HashMap;
import java.util.Scanner;

public class Interviewer extends User {
    public void introduction(User user) {
        System.out.println("Please, wait a bit... Successfully logged as " + user.getNameOfRole().toLowerCase() + "!");
        System.out.println("Available commands: list, add, remove, update");

        Scanner ins = new Scanner(System.in);
        String command = ins.next();

        switch (command) {
            case "list":
                questionsList();
        }
    }

    private HashMap questionsList() {
        HashMap<String, String> questions = new HashMap();

        System.out.println(questions);

        return questions;
    }
}
