package ru.mirea.java.task19;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeInputToFile {

    public static void main(String[] args) {

        String fileName = "file.txt";
        Scanner input = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String inputString = input.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(inputString);
            fileWriter.close();

            System.out.println("Введенный текст: «" + inputString + "» успешно записан в файл " + fileName);
        }
        catch (IOException e) {
            System.out.println("Ошибка записи!");
            e.printStackTrace();
        }
    }
}
