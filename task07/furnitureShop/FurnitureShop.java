package ru.mirea.java.task07.furnitureShop;

import java.util.ArrayList;
import java.util.Collections;

public class FurnitureShop {

    private ArrayList<Furniture> stock = new ArrayList<Furniture>();

    FurnitureShop(Furniture ... items) {
        Collections.addAll(stock, items);
    }

    public void addToStock(Furniture item) {
        stock.add(item);
    }

    public Furniture getItem(int index) {
        return stock.get(index);
    }

    public void printStock() {
        System.out.println("- Товары в наличии:");
        for (Furniture item : stock) System.out.println(item.toString());
    }
}
