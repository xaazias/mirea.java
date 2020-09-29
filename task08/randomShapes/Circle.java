package ru.mirea.java.task08.randomShapes;

import java.awt.*;

public class Circle extends Shape {

    Circle(int x, int y, int radius, String color) {
        super(x, y, radius, radius, color);
    }

    @Override
    void drawShape(Graphics g) {
        g.setColor(Color.decode(this.getColor()));
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
