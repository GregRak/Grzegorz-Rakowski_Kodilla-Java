package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(e -> System.out.println(e));

        double average = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average().getAsDouble();
        System.out.println("średnia to: " + average);
        return average;
    }
}
