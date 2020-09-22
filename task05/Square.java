package ru.mirea.java.task05;

public class Square extends Rectangle {

    Square() { };

    Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return super.getWidth();
    }

    void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }
}
