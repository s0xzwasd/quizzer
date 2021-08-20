package com.s0xzwasd.quizzer;

import java.util.Scanner;

public class QuizzerApp {
    void run(String[] args) {
        greeting();

        User user = getUsername(); // TODO: Update method name. It is confusing.

        getUserRole(user);

        System.out.println("User settings: " + user.getUsername() + " " + user.getRole());
    }

    void greeting() {
        System.out.println("Welcome on board! I'm Quizzer and I'm here to help you learn things with a rapid speed ;)");
    }

    private User getUsername() {
        System.out.println("Please, enter your name to continue.");

        User user = new User();

        Scanner ins = new Scanner(System.in);

        user.setUsername(ins.next());

        System.out.println("Nice to meet you, " + user.getUsername() + ".");

        return user;
    }

    private User getUserRole(User user) {
        // TODO: Prettify string.
        System.out.println(user.getUsername() + " let's continue our journey. Work hard – play hard, they said. \n We" +
                " " +
                "have interviewers (who add questions and create tests) and students. What is your role? \n Please, " +
                "specify 0 for Student and 1 for Interviewer.");

        Scanner ins = new Scanner(System.in);
        user.setRole(ins.nextByte());

        byte role = user.getRole();
        String nameOfRole;

        // TODO: Update to ternary operator.
        if (role == 1) {
            nameOfRole = "Interviewer";
        } else {
            nameOfRole = "Student";
        }

        System.out.println("Great, I'm marking you as a " + nameOfRole + ".");

        return user;
    }
}
