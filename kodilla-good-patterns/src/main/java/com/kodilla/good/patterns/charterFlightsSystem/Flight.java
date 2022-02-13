package com.kodilla.good.patterns.charterFlightsSystem;

import java.time.LocalDateTime;

public class Flight {

    private final String departureCity;
    private LocalDateTime departureTime;
    private final String arrivalCity;
    private LocalDateTime arrivalTime;

    public Flight(String departureCity, LocalDateTime departureTime, String arrivalCity, LocalDateTime arrivalTima) {
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalCity = arrivalCity;
        this.arrivalTime = arrivalTima;
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

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", arrivalTime=" + arrivalTime +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        if (!arrivalCity.equals(flight.arrivalCity)) return false;
        return arrivalTime.equals(flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        return result;
    }
}