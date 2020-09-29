package ru.mirea.java.task08.randomShapes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {

    private String color;
    private int x, y, width, height;

    public Shape(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    abstract void drawShape(Graphics g);

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
