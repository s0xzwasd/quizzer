package com.s0xzwasd.quizzer;

import java.util.ArrayList;

public class User {
    private String username;
    private String nameOfRole;
    private byte role;

    ArrayList<Question> questions = new ArrayList<>();

    public byte getRole() {
        return role;
    }

    public void setRole(byte role) {
        this.role = role;
    }

    public String getNameOfRole() {
        return nameOfRole;
    }

    public void setNameOfRole(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
