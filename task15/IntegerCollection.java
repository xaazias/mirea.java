package ru.mirea.java.task15;

import java.util.*;

public class IntegerCollection {

    private final ArrayList<Integer> collection = new ArrayList<>();

    public void push(int item) {
        this.collection.add(item);
    }

    public void pop(int index) {
        this.collection.remove(index);
    }

    public int findByValue(int value) {
        return this.collection.indexOf(value);
    }

    public int findByIndex(int index) {
        return this.collection.get(index);
    }

    public int getMax() {
        return Collections.max(collection);
    }

    public int getMin() {
        return Collections.min(collection);
    }

    public double getAvg() {
        
        double sum = 0;

        for (Integer integer : collection) {
            sum += integer;
        }
        return (double) Math.round(sum / collection.size() * 100) / 100;
    }

    @Override
    public String toString() {
        return "IntegerCollection{"
                + collection +
                '}';
    }
}
