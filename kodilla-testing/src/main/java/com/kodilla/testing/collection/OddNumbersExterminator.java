package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> numbersList;

    public OddNumbersExterminator() {
        numbersList = new ArrayList<>();
    }

    public List<Integer> exterminate (List<Integer> numbers) {
        int temporaryValue = 0;
        List<Integer> oddNumbersList = new ArrayList<>();
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                evenNumbersList.add(temporaryValue);
            } else {
                oddNumbersList.add(temporaryValue);
            }
        }
        return evenNumbersList;
    }
}
