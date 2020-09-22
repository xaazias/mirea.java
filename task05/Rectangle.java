package ru.mirea.java.task05;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() { }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double) Math.round(width * length * 100) / 100;
    }

    @Override
    public double getPerimeter() {
        return (double) Math.round((length + width) * 2 * 100) / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }
}
