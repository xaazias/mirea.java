package ru.mirea.java.task10;

public class e3 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("tenet");

        if (str.toString().equals(str.reverse().toString())) System.out.println("YES");
        else System.out.println("NO");
    }
}
