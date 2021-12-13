package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapesList = new ArrayList<>();
    private Shape shape;

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shape != null) {
            shapesList.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int n) {
        return shapesList.get(n);
    }

    public String showFigures() {
        String result = "";
        String coma = ", ";
        for (Shape currentShape : shapesList) {
            String nameOfCurrentShape = currentShape.getShapeName();
            result += nameOfCurrentShape + coma;
        }
        String toPrint = result.substring(0, result.length()-2);
        return toPrint;
    }

}
