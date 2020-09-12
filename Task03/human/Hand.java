package ru.mirea.java.task03.human;

public class Hand {

    private String length;

    Hand(String length) {
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length='" + length + '\'' +
                '}';
    }
}
