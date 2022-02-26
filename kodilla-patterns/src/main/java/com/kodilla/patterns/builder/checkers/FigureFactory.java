package com.kodilla.patterns.builder.checkers;

public final class FigureFactory {

    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figure, String color) {
        if(figure.equals(PAWN)) {
            return new Pawn(color);
        } else if(figure.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}
