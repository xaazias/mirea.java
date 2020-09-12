package ru.mirea.java;

import java.util.Arrays;
import java.util.Random;

public class Task01 {

    static void startLoop() {

        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;

        for (int j : intArray) sum += j;
        System.out.println("For Loop: " + sum);
        sum = 0;

        int x = 0;
        while (x < intArray.length)
        {
            sum += intArray[x];
            x++;
        }
        System.out.println("While Loop: " + sum);
        sum = 0;

        int c = 0;
        do {
            sum += intArray[c];
            c++;
        } while (c < intArray.length);
        System.out.println("Do/While Loop: " + sum);
    }

    static void getCommandArgs(String[] args) {
        for (String j : args)
            System.out.println(j);
    }

    static void harmonicSeries() {
        for (int i = 1; i <= 10; i++)
            System.out.print(String.format("%.2f", (double) 1 / i) + " ");
    }

    static void randomArray(int n, int max) {

        int[] rArray = new int[n];
        int min = 1, range = max - min + 1;

        for (int i = 0; i < n; i++)
            rArray[i] = (int) (Math.random() * range) + min;

        System.out.println();
        for (int i : rArray)
            System.out.print(i + " ");

        Arrays.sort(rArray);
        System.out.print("\n");

        for (int i : rArray)
            System.out.print(i + " ");
    }

    static void randomArrayClass(int n, int max) {

        Random random = new Random();
        int[] rArray = new int[n];

        for (int i = 0; i < n; i++)
            rArray[i] = random.nextInt(max);

        System.out.println();
        for (int i : rArray)
            System.out.print(i + " ");

        Arrays.sort(rArray);
        System.out.print("\n");

        for (int i : rArray)
            System.out.print(i + " ");
    }

    static void factorial(int n) {

        int result = n > 0 ? 1 : 0;

        for (int i = 1; i <= n; i++)
            result *= i;

        System.out.println();
        if (n >= 0) System.out.println(result);
        else System.out.println(-1);
    }

    public static void main(String[] args) {
        startLoop();
        getCommandArgs(args);
        harmonicSeries();
        randomArray(10, 10);
        randomArrayClass(10, 10);
        factorial(5);
    }
}
