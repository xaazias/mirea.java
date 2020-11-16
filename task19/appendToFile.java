package ru.mirea.java.task19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendToFile {

    public static void main(String[] args) {

        String fileName = "file.txt";
        String appendText = "Text Text Text Text Text";

        try {
            File file = new File(fileName);

            FileWriter fr = new FileWriter(file, true);
            fr.write("\n" + appendText);
            fr.close();

            System.out.println("Введенный текст: «" + appendText + "» успешно добавлен в конец файла " + fileName);
        }
        catch (IOException e) {
            System.out.println("Ошибка записи!");
            e.printStackTrace();
        }
    }
}
