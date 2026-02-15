package com.example.fridge_lab4;

public abstract class Shape {
    int x;
    int y;

    // Constructor
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method for area (example)
    public abstract double area();
}

