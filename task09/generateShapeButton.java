package ru.mirea.java.task09;

import ru.mirea.java.task08.randomShapes.*;

import javax.swing.*;
import java.awt.*;

public class generateShapeButton extends JFrame {

    private final int windowWidth = 800;
    private final int windowHeight = 600;

    public generateShapeButton()
    {
        super("Generate Shape by Button");

        JButton b = new JButton("Add Random Shape");
        RandomShape shape = new RandomShape();

        setLayout(new FlowLayout());
        setSize(windowWidth, windowHeight);
        add(b);
        b.addActionListener(e -> shape.addRandomShape(getGraphics(), windowWidth, windowHeight));
        setVisible(true);
    }

    public static void main(String[] args) {
        new generateShapeButton();
    }

}
