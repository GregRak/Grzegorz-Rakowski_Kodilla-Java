package com.kodilla.patterns.builder.checkers;

public class Figure {

    public static String BLACK = "BLACK";
    public static String WHITE = "WHITE";
    private final String color;

    public Figure(String color) {
        if (color.equals(BLACK) || color.equals(WHITE)) {
            this.color = color;
        } else {
            throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
        }
    }

    public String getColor() {
        return color;
    }
}
