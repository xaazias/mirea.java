package ru.mirea.java.task19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readFromFile {

    public static void main(String[] args) {

        String fileName = "file.txt";

        try {
            File file = new File(fileName);

            if (file.exists()) {

                if (file.length() > 0) {

                    Scanner fileReader = new Scanner(file);

                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    fileReader.close();
                }
                else System.out.println("В данном файле нет информации для чтения!");
            }
            else System.out.println("Файл не найден!");
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения!");
            e.printStackTrace();
        }
    }
}
