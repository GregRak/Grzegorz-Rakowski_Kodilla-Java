package com.kodilla.good.patterns.charterFlightsSystem;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class FlightList {

    private Set<Flight> flightsSet;

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }

    public Set<Flight> addFlightToSet() {
        Set<Flight> currentSet = new HashSet<>();
        Flight flight1 = new Flight("Gdańsk", LocalDateTime.of(2022, 2, 15, 12, 00), "Wrocław", LocalDateTime.of(2022, 2, 15, 14, 00));
        Flight flight2 = new Flight("Gdańsk", LocalDateTime.of(2022, 2, 17, 14, 00), "Wrocław", LocalDateTime.of(2022, 2, 17, 16, 20));
        Flight flight3 = new Flight("Wrocław", LocalDateTime.of(2022, 2, 18, 10, 00), "Gdańsk", LocalDateTime.of(2022, 2, 18, 12, 20));
        Flight flight4 = new Flight("Gdańsk", LocalDateTime.of(2022, 2, 19, 10, 00), "Kraków", LocalDateTime.of(2022, 2, 19, 12, 40));
        Flight flight5 = new Flight("Kraków", LocalDateTime.of(2022, 2, 19, 14, 00), "Wrocław", LocalDateTime.of(2022, 2, 19, 15, 40));
        Flight flight6 = new Flight("Kraków", LocalDateTime.of(2022, 2, 19, 14, 00), "Warszawa", LocalDateTime.of(2022, 2, 19, 17, 40));
        Flight flight7 = new Flight("Kraków", LocalDateTime.of(2022, 2, 19, 18, 00), "Wrocław", LocalDateTime.of(2022, 2, 19, 20, 40));
        currentSet.add(flight1);
        currentSet.add(flight2);
        currentSet.add(flight3);
        currentSet.add(flight4);
        currentSet.add(flight5);
        currentSet.add(flight6);
        currentSet.add(flight7);
        this.flightsSet = currentSet;
        return currentSet;
    }
}
