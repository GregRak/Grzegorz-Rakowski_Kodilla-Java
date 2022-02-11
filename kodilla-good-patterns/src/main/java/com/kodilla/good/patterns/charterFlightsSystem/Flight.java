package com.kodilla.good.patterns.charterFlightsSystem;

import java.time.LocalDateTime;

public class Flight {

    private final String departureCity;
    private LocalDateTime departureTime;
    private final String arrivalCity;
    private LocalDateTime arrivalTima;

    public Flight(String departureCity, LocalDateTime departureTime, String arrivalCity, LocalDateTime arrivalTima) {
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalCity = arrivalCity;
        this.arrivalTima = arrivalTima;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public LocalDateTime getArrivalTima() {
        return arrivalTima;
    }
}