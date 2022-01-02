package com.kodilla.exception.nullpointer;

public class User {

    private String name;
    private int numberOfPosts;
    private int numberOfComments;
    private String aboutUser;

    public User(String name, int numberOfPosts, int numberOfComments, String aboutUser) {
        this.name = name;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.aboutUser = aboutUser;
    }

    public String getName() {
        return name;
    }
}
