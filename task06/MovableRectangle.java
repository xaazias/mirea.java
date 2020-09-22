package ru.mirea.java.task06;

import ru.mirea.java.task05.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {

    private int x, y;

    public MovableRectangle(double width, double length, String color, boolean filled, int x, int y) {
        super(width, length, color, filled);
        this.x = x;
        this.y = y;
    }

    public MovableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.x = (int) Math.round(width / 2);
        this.y = (int) Math.round(length / 2);
    }

    public MovableRectangle(double width, double length) {
        super(width, length);
        this.x = (int) Math.round(width / 2);
        this.y = (int) Math.round(length / 2);
    }

    @Override
    public void moveFor(int rightX, int downY) {
        this.x += rightX;
        this.y += downY;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + super.getWidth() +
                ", length=" + super.getLength() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }
}
