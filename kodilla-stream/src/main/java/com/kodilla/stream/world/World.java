package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continentAndCountryList = new ArrayList<>();

    public void addObject (Continent object) {
        continentAndCountryList.add(object);
    }

    public List<Continent> getContinentAndCountryList() {
        return continentAndCountryList;
    }

    public boolean remove (Continent object) {
        return continentAndCountryList.remove(object);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPeopleQuantity =
                continentAndCountryList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }

}
