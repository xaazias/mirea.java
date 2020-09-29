package ru.mirea.java.task08.renderImage;

import javax.swing.*;
import java.io.File;

public class Image {

    public static void main(String[] args) {
        if (args.length > 0)
        {
            JFrame frame = new JFrame();
            JLabel label = new JLabel(new ImageIcon(args[0]));

            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
}
