package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    private Statistics statistics;
    int usersNamesCount;
    int postsNumber;
    int commentsNumber;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public int getUsersNamesCount() {
        return usersNamesCount;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        //getting data from a class that implements the statistics interface
        List<String> theListOfUsers = statistics.usersNames();
        this.usersNamesCount = theListOfUsers.size();

        int posts = statistics.postsCount();
        this.postsNumber = posts;

        int comments = statistics.commentsCount();
        this.commentsNumber = comments;

        //calculation of averages
        if (theListOfUsers.size() > 0) {
            double newPosts = (double) posts;
            double avePostPerUser = newPosts / theListOfUsers.size();
            this.averageNumberOfPostsPerUser = avePostPerUser;
        }

        if (theListOfUsers.size() > 0) {
            double newComments = (double) comments;
            double aveCommentsPerUser = newComments / theListOfUsers.size();
            this.averageNumberOfCommentsPerUser = aveCommentsPerUser;
        }

        if (posts > 0) {
            double newComments = (double) comments;
            double aveCommentsPerPost = newComments / posts;
            this.averageNumberOfCommentsPerPost = aveCommentsPerPost;
        }
    }

    public void showStatistics() {
        System.out.println("Our forum has " + this.usersNamesCount + " users./n"
            + "The number of posts: " + this.postsNumber + "./n"
            + "The number od comments: " + this.commentsNumber + "./n"
            + "The average number of posts per user is: " + this.averageNumberOfPostsPerUser + "./n"
            + "The average number of comments per user is: " + this.averageNumberOfCommentsPerUser + "./n"
            + "The average number of comments per post is: " + this.averageNumberOfCommentsPerPost + "./n");
    }
}
