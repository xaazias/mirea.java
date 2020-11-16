package ru.mirea.java.task20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class replaceSpaces {

    public static void main(String[] args) {

        try {
            File file = new File("War&Peace.txt");
            Scanner fileReader = new Scanner(file);

            StringBuilder changedText = new StringBuilder();

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                line = line.replaceAll("\\s+","#");
                changedText.append("\n").append(line);
            }
            fileReader.close();

            FileWriter fileWriter = new FileWriter("War&PeaceEdited.txt");
            fileWriter.write(String.valueOf(changedText));
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения!");
            e.printStackTrace();
        }
    }
}
