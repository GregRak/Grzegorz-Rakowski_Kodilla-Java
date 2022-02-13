package com.kodilla.good.patterns.charterFlightsSystem;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    final FlightList flightList = new FlightList();

    public void findFlightsFromCity(String cityName) {
        Set<Flight> currentFlightList = flightList.addFlightToSet();
        currentFlightList.stream()
                .filter(flight -> flight.getDepartureCity().equals(cityName))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .forEach(System.out::println);
    }

    public void findFlightsToCity(String cityName) {
        Set<Flight> currentFlightSet = flightList.addFlightToSet();
        currentFlightSet.stream()
                .filter(flight -> flight.getArrivalCity().equals(cityName))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .forEach(System.out::println);
    }

    public void findFlightsFromTo(String departureCity, String arrivalCity, boolean withConnecting) {
        Set<Flight> currentFlightSet = flightList.addFlightToSet();
        if(withConnecting) {
            currentFlightSet.stream()
                    .filter(flight -> flight.getDepartureCity().equals(departureCity))
                    .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                    .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                    .forEach(System.out::println);

            System.out.println("Connecting flights:");
            Set<Flight> filterSet = currentFlightSet.stream()
                    .filter(flight -> flight.getArrivalCity().equals(arrivalCity) || flight.getDepartureCity().equals(departureCity))
                    .filter(flight -> !flight.getDepartureCity().equals(departureCity) || !flight.getArrivalCity().equals(arrivalCity))
                    .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                    .collect(Collectors.toSet());
            for(Flight currentFlight: filterSet) {
                LocalDateTime checkedArrivalTime = currentFlight.getArrivalTime();
                for (Flight checkedFlight: filterSet)
                if(checkedFlight.getDepartureTime().isAfter(checkedArrivalTime) && currentFlight.getArrivalCity().equals(checkedFlight.getDepartureCity()))
                    System.out.println(currentFlight + " " + checkedFlight);
            }
        } else {
            currentFlightSet.stream()
                    .filter(flight -> flight.getDepartureCity().equals(departureCity))
                    .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                    .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                    .forEach(System.out::println);
        }
    }
}
