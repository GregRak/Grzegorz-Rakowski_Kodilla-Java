package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithPepperoniExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), price);
    }

    @Test
    public void testPizzaOrderWithPepperoniExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Dough, tomato sauce, cheese + pepperoni + extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseJalapenoMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), price);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseJalapenoMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Dough, tomato sauce, cheese + extra cheese + jalapenos + mushrooms", description);
    }
}
