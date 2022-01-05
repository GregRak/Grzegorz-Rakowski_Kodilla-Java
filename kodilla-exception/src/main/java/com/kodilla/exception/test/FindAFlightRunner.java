package com.kodilla.exception.test;

import java.util.Map;

public class FindAFlightRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Frankfurt", "Warsaw");
        Flight flight2 = new Flight("Frankfurt", "Sydney");
        Flight flight3 = new Flight("Sydney", "Rome");
        FindAFlight findAFlight = new FindAFlight();

        try {
            findAFlight.findFlight(flight3);
        } catch (RouteNotFoundException r) {
            System.out.println("No destination or departure Airport at the base");
        } finally {
            System.out.println("Thank you for using our program");
        }
    }
}
