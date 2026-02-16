package com.example.fridge_lab4;

public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(int x, int y, String color, double base, double height) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

