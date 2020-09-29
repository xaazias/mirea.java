package ru.mirea.java.task07.furnitureShop;

public abstract class Furniture {

    private int price;

    Furniture(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}