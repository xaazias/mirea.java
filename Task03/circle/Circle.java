package ru.mirea.java.task03.circle;

public class Circle {

    private int R;
    private double S;
    private String color;

    Circle(String color, int r) {
        this.color = color;
        this.R = r;
        this.S = r * r * 3.14;
    };

    public int getR() {
        return R;
    }

    public double getS() {
        return S;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setR(int r) {
        R = r;
    }

    public void calculateS() {
        S = R * R * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                ", S=" + S +
                ", color='" + color + '\'' +
                '}';
    }
}
