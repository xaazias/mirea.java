package ru.mirea.java.task08.randomShapes;

import javax.swing.*;
import java.awt.*;

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

    public void paint(Graphics g)
    {
        for (int i = 0; i < amountOfShapes; i++) {
            RandomShape shape = new RandomShape();
            shape.addRandomShape(g, windowWidth, windowHeight);
        }
    }

    public static void main(String[] args) {
        new RandomShapesTest();
    }
}
