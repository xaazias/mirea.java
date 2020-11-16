package ru.mirea.java.task18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.max;

public class maxSequence {

    public static int enterSequence() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n == 0)
            return 0;
        else
            return Integer.max(n, enterSequence());
    }
    public static void main(String[] args) {
        System.out.println(enterSequence()); // вызов рекурсивной функции
    }
}
