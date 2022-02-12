package com.kodilla.spring.intro.shape;

//public class Circle extends Figure{
//
//    @Override
//    public void draw() {
//        System.out.println("This is a circle");
//    }
//}

public class Circle implements Shape{

    @Override
    public String draw() {
        System.out.println("This is a circle");
        return "This is a circle";
    }

    public String draw2() {
        return "This is a second implementation";
    }
}
