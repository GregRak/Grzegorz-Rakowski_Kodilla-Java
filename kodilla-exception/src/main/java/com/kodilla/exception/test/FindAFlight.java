package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindAFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Frankfurt", true);
        flightMap.put("Warsaw", false);
        flightMap.put("London", true);

        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue() == true) {
                System.out.println("You can fly to " + flight.getArrivalAirport());
            } else if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue() != true) {
                System.out.println("You can't fly to " + flight.getArrivalAirport());
            } else if (!entry.getKey().equals(flight.getArrivalAirport()) || !entry.getKey().equals(flight.getDepartureAirport())) {
                throw new RouteNotFoundException("No airport at the base");
            }
        }
    }
}
