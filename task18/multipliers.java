package ru.mirea.java.task18;

import java.util.ArrayList;

public class multipliers {

    static final int maxPrime = 100001;

    static int[] primeNumbers = new int[maxPrime];

    static void sievePrimeNumbers() {

        primeNumbers[1] = 1;

        for (int i = 2; i < maxPrime; i++) primeNumbers[i] = i;

        for (int i = 4; i < maxPrime; i+=2) primeNumbers[i] = 2;

        for (int i = 3; i * i < maxPrime; i++) {
            if (primeNumbers[i] == i) {
                for (int j = i * i; j < maxPrime; j+=i)
                    if (primeNumbers[j] == j) primeNumbers[j] = i;
            }
        }
    }

    static ArrayList<Integer> getFactorization(int x) {

        ArrayList<Integer> r = new ArrayList<>();

        while (x != 1) {
            r.add(primeNumbers[x]);
            x = x / primeNumbers[x];
        }
        return r;
    }

    public static void main(String[] args)
    {
        sievePrimeNumbers();
        int x = 120;

        ArrayList <Integer> p = getFactorization(x);
        System.out.println("Простые множители числа " + x + " : " + p);
    }
}
