package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String continentName;
    private final Country country;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public boolean removeCountry(Country country) {
        return countryList.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Country getCountry() {
        return country;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName != null ? continentName.equals(continent.continentName) : continent.continentName == null;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", country=" + country +
                ", countryList=" + countryList +
                '}';
    }
}
