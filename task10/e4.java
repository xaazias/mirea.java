package ru.mirea.java.task10;

public class e4 {

    public static int zeroCombinations(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0) return 1;
        if (b == 0) return 1;
        return zeroCombinations(a,b - 1) + zeroCombinations(a - 1,b - 1);
    }

    public static void main(String[] args) {
        //
        int a = 1; // 0
        int b = 3; // 1

        System.out.println(zeroCombinations(a, b));
    }
}
