package com.kodilla.rps;

import java.util.List;

public class ScannerChecker {

    public static boolean checker(String word) {
        List<String> table = List.of("1","2","3","4","5","6","7","8","9");
        boolean check = table.stream()
                .anyMatch(n -> n.equals(word));
        return check;
    }

}
