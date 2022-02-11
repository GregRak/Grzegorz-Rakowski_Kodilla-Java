package com.kodilla.good.patterns.charterFlightsSystem;

public class User {

    private final String username;
    private final String userEmail;
    private final int userId;
    private final int userPhoneNumber;

    public User(String username, String userEmail, int userId, int userPhoneNumber) {
        this.username = username;
        this.userEmail = userEmail;
        this.userId = userId;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
