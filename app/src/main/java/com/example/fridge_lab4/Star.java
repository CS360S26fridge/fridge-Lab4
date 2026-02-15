package com.example.fridge_lab4;

public class Star extends Shape {

    private final int points;

    public Star(int x, int y, String color, int points) {
        super(x, y, color);
        this.points = points;
    }

    @Override
    public double area() {
        // Just a dummy formula for area of star
        return points * 2.5;
    }

    public int getPoints() {
        return points;
    }
}
