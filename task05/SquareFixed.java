package ru.mirea.java.task05;

public class SquareFixed extends Shape {

    private double side;

    SquareFixed() { }

    SquareFixed(double side) {
        this.side = side;
    }

    SquareFixed(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    double getSide() {
        return side;
    }

    void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (side + side) * 2;
    }

    @Override
    public String toString() {
        return "SquareFixed{" +
                "side=" + getSide() +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }
}
