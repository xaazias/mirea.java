package ru.mirea.java.task07.furnitureShop;

public class Sofa extends Furniture {

    private String color;

    Sofa(int price) {
        super(price);
    }

    Sofa(int price, String color) {
        super(price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "color='" + color + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
