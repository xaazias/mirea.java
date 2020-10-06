package ru.mirea.java.task08.randomShapes;

import java.awt.*;
import java.util.Random;

public class RandomShape {

    public String getRandomColor() {
        int rand = new Random().nextInt(0xffffff + 1);
        return String.format("#%06x", rand);
    }

    public void addRandomShape(Graphics g, int windowWidth, int windowHeight)
    {
            int x = new Random().nextInt(windowWidth);
            int y = new Random().nextInt(windowHeight);

            int w = new Random().nextInt(windowWidth / 10) + 1;
            int h = new Random().nextInt(windowHeight/ 10) + 1;

            String color = getRandomColor();

            int choice = new Random().nextInt(3) + 1;

            Shape shape = null;

            if (choice == 1) shape = new Circle(x, y, w, color);
            if (choice == 2) shape = new Rectangle(x, y, w, h, color);
            if (choice == 3) shape = new Square(x, y, w, color);

            shape.drawShape(g);
    }
}
