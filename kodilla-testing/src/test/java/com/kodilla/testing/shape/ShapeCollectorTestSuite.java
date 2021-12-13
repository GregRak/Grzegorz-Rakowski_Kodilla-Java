package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("We start with test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for add and remove Shape")
    class addOrRemove {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
             //When
            collector.addFigure(new Circle("circle", 32.50));
            collector.addFigure(new Square("square", 25.00));
            collector.addFigure(new Triangle("triangle", 21.54));
            //Then
            Assertions.assertEquals(3, collector.getShapesList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape1 = new Circle("Circle", 30);
            collector.addFigure(shape1);
            //When
            boolean result = collector.removeFigure(shape1);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, collector.getShapesList().size());
        }
    }

    @Nested
    @DisplayName("Tests for show Shape")
    class showingShape {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape1 = new Circle("Circle", 30);
            collector.addFigure(shape1);
            //When
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(shape1, result);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape1 = new Circle("Circle", 30);
            Shape shape2 = new Square("Square", 25);
            Shape shape3 = new Triangle("Triangle", 20);
            collector.addFigure(shape1);
            collector.addFigure(shape2);
            collector.addFigure(shape3);
            //When
            String expected = "Circle, Square, Triangle";
            String result = collector.showFigures();
            //Then
            Assertions.assertEquals(expected, result);
        }

    }
}
