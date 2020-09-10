package ru.mirea.java;

public class Ball {

    private String color, size;
    private int price = -1;

    Ball(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getBallInfo() {
        System.out.println("Ball's color - " + color);
        System.out.println("Ball's size - " + size);
        System.out.println("Ball's price - " + price);
    }
}
