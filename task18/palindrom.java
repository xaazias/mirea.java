package ru.mirea.java.task18;

public class palindrom {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("racecar");

        if (str.toString().equals(str.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
