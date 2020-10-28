package ru.mirea.java.task15;

import java.util.*;
import java.util.stream.IntStream;

public class IntegerCollection {

    private int[] collection = new int[] {};

    public void push(int item) {

        int[] buffer = new int[collection.length + 1];

        System.arraycopy(collection, 0, buffer, 0, collection.length);

        buffer[collection.length] = item;

        this.collection = buffer;
    }

    public void pop(int index) {

        if (collection == null || index < 0 || index >= collection.length)
            return;

        this.collection = IntStream.range(0, collection.length)
            .filter(i -> i != index)
            .map(i -> collection[i])
            .toArray();
    }

    public int findByValue(int value) {

        for (int i = 0; i < collection.length; i++)
            if (collection[i] == value) return i;

        return -1;
    }

    public int findByIndex(int index) {

        return this.collection[index];
    }

    public int getMax() {

        int max = collection[0];

        for (int i : collection) {
            if (i > max) max = i;
        }
        return max;
    }

    public int getMin() {

        int min = collection[0];

        for (int i : collection) {
            if (i < min) min = i;
        }
        return min;
    }

    public double getAvg() {
        
        double sum = 0;

        for (Integer integer : collection) {
            sum += integer;
        }
        return (double) Math.round(sum / collection.length * 100) / 100;
    }

    @Override
    public String toString() {
        return "IntegerCollection : " + Arrays.toString(collection);
    }
}
