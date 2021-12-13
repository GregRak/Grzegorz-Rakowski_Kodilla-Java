package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double field;

    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
