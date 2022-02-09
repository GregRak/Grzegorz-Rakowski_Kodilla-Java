package com.kodilla.good.patterns.Food2Door;

public class User {

    private final String userName;
    private final String userEmail;
    private final int userPhoneNumber;

    public User(String userName, String userEmail, int userPhoneNumber) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
