package com.kodilla.good.patterns.charterFlightsSystem;

public class CharterFlightsRunner {

    public static void main (String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
   //     flightSearcher.findFlightsFromCity("Gdańsk");
   //     flightSearcher.findFlightsToCity("Wrocław");
        flightSearcher.findFlightsFromTo("Gdańsk", "Wrocław", true);
    }
}
