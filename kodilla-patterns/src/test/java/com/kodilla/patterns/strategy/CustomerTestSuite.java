package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Smith");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");
        //When
        String stevenStrategy = steven.predict();
        String johnStrategy = john.predict();
        String kodillaStrategy = kodilla.predict();
        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenStrategy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ", johnStrategy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaStrategy);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Smith");
        //When
        String stevenStrategy = steven.predict();
        System.out.println("The default Steven strategy is: " + stevenStrategy);
        steven.setBuyPredictor(new AggressivePredictor());
        stevenStrategy = steven.predict();
        System.out.println("The changed Steven strategy is: " + stevenStrategy);
        //Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenStrategy);
    }
}
