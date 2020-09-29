package ru.mirea.java.task08.randomShapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesTest extends JFrame {

    private final int windowWidth = 800;
    private final int windowHeight = 600;
    private final int amountOfShapes = 20;

    public RandomShapesTest()
    {
        super("Random Shapes Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(windowWidth, windowHeight);
        setVisible(true);
    }

    public String getRandomColor() {
        int rand = new Random().nextInt(0xffffff + 1);
        return String.format("#%06x", rand);
    }

    public void paint(Graphics g)
    {
        for (int i = 0; i < amountOfShapes; i++)
        {
            int x = new Random().nextInt(windowWidth);
            int y = new Random().nextInt(windowHeight);

            int w = new Random().nextInt(windowWidth / (amountOfShapes / 2)) + 1;
            int h = new Random().nextInt(windowHeight/ (amountOfShapes / 2)) + 1;

            String color = getRandomColor();

            int choice = new Random().nextInt(3) + 1;

            Shape shape = null;

            if (choice == 1) shape = new Circle(x, y, w, color);
            if (choice == 2) shape = new Rectangle(x, y, w, h, color);
            if (choice == 3) shape = new Square(x, y, w, color);

            shape.drawShape(g);
        }
    }

    public static void main(String[] args) {
        new RandomShapesTest();
    }
}
