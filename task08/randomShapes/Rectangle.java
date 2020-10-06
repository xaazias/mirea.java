package ru.mirea.java.task08.randomShapes;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height, color);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(Color.decode(this.getColor()));
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
