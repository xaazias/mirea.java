package ru.mirea.java.task10;

public class e2 {

    private static int k = 3;
    private static int s = 27;
    private static int result = 0;

    public static void loopNumbers(int i) {

        int b = i + 1;
        int x = 0;

        while (b != 0) {
            x += b % 10;
            b = b / 10;
        }

        if (s == x) result++;
        if (i < (int) Math.pow(10, k) - 1) { i++; loopNumbers(i); }
        else System.out.println(result);
    }

    public static void main(String[] args) {
        loopNumbers(0);
    }
}
