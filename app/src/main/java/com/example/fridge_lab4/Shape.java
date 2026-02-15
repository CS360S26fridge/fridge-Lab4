package com.example.fridge_lab4;

public abstract class Shape {
    int x;
    int y;
    String color = "blue";

    // Constructor
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Abstract method for area
    public abstract double area();
}

