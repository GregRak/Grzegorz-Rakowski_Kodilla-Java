package com.kodilla.good.patterns.challenges;

public class ChallengesRunner {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.titlePrinter(movieStore.getMovies()));

    }
}
