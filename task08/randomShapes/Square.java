package ru.mirea.java.task08.randomShapes;

import java.awt.*;

public class Square extends Shape {

    Square(int x, int y, int side, String color) {
        super(x, y, side, side, color);
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(Color.decode(this.getColor()));
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
