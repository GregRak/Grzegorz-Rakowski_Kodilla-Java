package com.kodilla.spring.intro.shape;

public class Drawer {

//    public void doDrawing() {
//
//        Figure figure;
//
//        figure = new Circle();
//        figure.draw();
//
//        figure = new Triangle();
//        figure.draw();
//    }

//    public void doDrawing() {
//        Shape shape;
//
//        shape = new Circle();
//        shape.draw();
//
//        shape = new Triangle();
//        shape.draw();
//    }

    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}
