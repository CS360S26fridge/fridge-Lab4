package com.example.fridge_lab4;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
