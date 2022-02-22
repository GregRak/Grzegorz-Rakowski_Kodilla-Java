package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals("The rounded circle", circle.getName());
        assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        assertEquals(2 * Math.PI * 4.50, circle.getCircumference(), 0);
    }

    @Test
    void testFactorySquare() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals("The angular square", square.getName());
        assertEquals(Math.pow(7.0, 2.0), square.getArea(), 0);
        assertEquals(4 * 7.0, square.getCircumference(), 0);
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals("The long rectangle", rectangle.getName());
        assertEquals(2 * 15 + 2 * 2.50, rectangle.getCircumference(), 0);
        assertEquals(15 * 2.50, rectangle.getArea(), 0);
    }
}
