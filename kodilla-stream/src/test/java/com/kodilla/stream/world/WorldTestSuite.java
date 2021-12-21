package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Kongo", new BigDecimal(300));
        Country country2 = new Country("Egypt", new BigDecimal(100));
        Country country3 = new Country("Poland", new BigDecimal(400));
        Country country4 = new Country("France", new BigDecimal(200));
        Country country5 = new Country("German", new BigDecimal(500));
        Country country6 = new Country("Great Britain", new BigDecimal(700));
        Country country7 = new Country("China", new BigDecimal(600));
        Country country8 = new Country("India", new BigDecimal(800));
        Country country9 = new Country("Pakistan", new BigDecimal(900));
        Country country10 = new Country("Canada", new BigDecimal(1000));
        Continent continent1 = new Continent("Africa", country1);
        Continent continent2 = new Continent("Europe", country3);
        Continent continent3 = new Continent("Asia", country7);
        Continent continent4 = new Continent("North America", country10);
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);
        continent4.addCountry(country10);
        World world = new World();
        world.addObject(continent1);
        world.addObject(continent2);
        world.addObject(continent3);
        world.addObject(continent4);
        //When
        BigDecimal calculationWithGetPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedValue = new BigDecimal(5500);
        //Then
        assertEquals(expectedValue, calculationWithGetPeopleQuantity);
    }
}
