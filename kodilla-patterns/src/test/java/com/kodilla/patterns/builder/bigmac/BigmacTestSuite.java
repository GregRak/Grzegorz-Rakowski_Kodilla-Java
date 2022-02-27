package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac1 = new Bigmac.BigmacBuilder()
                .bunWithSezam(true)
                .burgers(3)
                .sauce(Sauces.BARBECUE)
                .ingredients(Ingredients.LETTUCE)
                .ingredients(Ingredients.CHEESE)
                .ingredients(Ingredients.CUCUMBER)
                .ingredients(Ingredients.CHILLI_PEPPERS)
                .sauce(Sauces.STANDARD)
                .ingredients(Ingredients.MUSHROOMS)
                .build();
        System.out.println(bigmac1);
        //When
        int howManyIngredients = bigmac1.getIngredientsList().size();
        int howManyBurgers = bigmac1.getBurgers();
        int howManySauces = bigmac1.getSauces().size();
        //Then
        assertEquals(5, howManyIngredients);
        assertEquals(3, howManyBurgers);
        assertEquals(2, howManySauces);
        assertTrue(bigmac1.isBunWithSezam());
    }
}
