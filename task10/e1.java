package ru.mirea.java.task10;

public class e1 {
    public static void main(String[] args) {

        int k = 10;
        int n = 1;

        for (int i = 0; i <= k; i++) {

            if (n < i - 1) {
                n++;
                i--;
            }
            else n = 0;

            if (i == k) break;
            System.out.print(i + 1 + " ");
        }

    }
}
