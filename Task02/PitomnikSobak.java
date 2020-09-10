package ru.mirea.java;

import java.util.Arrays;

public class PitomnikSobak {

    private Dog[] list;

    PitomnikSobak(int n) {
        list = new Dog[n];
    }

    public void addDog(Dog dog) {
        for (int i = 0; i < list.length; i++)
            if (list[i] == null) {
                list[i] = dog;
                return;
            }
        list = Arrays.copyOf(list, list.length + 1);
        list[list.length - 1] = dog;
    }

    public Dog getDog(int x) {
        return list[x];
    }

    public static void main(String[] args) {

        Dog Black = new Dog("Jerry", 3);
        PitomnikSobak pitomnik = new PitomnikSobak(5);

        for (int i = 0; i < 10; i++)
            pitomnik.addDog(Black);

        for (int i = 0; i < 10; i++)
            System.out.println(pitomnik.getDog(i).getName());
    }
}