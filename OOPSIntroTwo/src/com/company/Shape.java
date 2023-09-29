package com.company;

public abstract class Shape {
    String color;

    public Shape() {
        this.color = "BLUE";
        System.out.println("inside Shape Constructor");
    }

    public abstract int area();
}

class Square extends Shape {
    int side;

    public Square() {
        super();
        System.out.println("inside square constructor");
        side = 4;
    }

    @Override
    public int area() {
        return side*side;
    }
}