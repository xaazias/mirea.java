package ru.mirea.java.task05;

public class Circle extends Shape {

    private double radius;

    Circle() { }

    Circle (double radius) {
        this.radius = radius;
    }

    Circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) Math.round(3.14 * radius * radius * 100) / 100;
    }

    @Override
    public double getPerimeter() {
        return (double) Math.round(2 * 3.14 * radius * 100) / 100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }
}
