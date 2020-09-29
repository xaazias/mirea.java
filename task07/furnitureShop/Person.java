package ru.mirea.java.task07.furnitureShop;

import java.util.ArrayList;

public class Person {

    private ArrayList<Furniture> basket = new ArrayList<Furniture>();

    public void addToBasket(Furniture item) {
        basket.add(item);
    }

    public void printBasket() {
        System.out.println("- Корзина:");
        for (Furniture i : basket) System.out.println(i.toString());
    }

}
