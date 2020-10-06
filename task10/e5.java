package ru.mirea.java.task10;

public class e5 {

    public static String returnStringNum(int n) {
        if (n < 10) return Integer.toString(n);
        else return returnStringNum(n / 10) + " " + n % 10;
    }
    public static void main(String[] args) {
        System.out.println(returnStringNum(1337));
    }
}
