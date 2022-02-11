package com.kodilla.good.patterns.charterFlightsSystem;

import java.time.LocalDateTime;

public class FlightRetriever {

    public Flight flightRetriever() {
        Flight flight1 = new Flight("Gdańsk", LocalDateTime.of(2022, 2, 15, 12, 00), "Wrocław", LocalDateTime.of(2022, 2, 15, 14, 00));
        return flight1;
    }
}
