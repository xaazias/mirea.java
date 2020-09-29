package ru.mirea.java.task07.furnitureShop;

public class Bed extends Furniture {

    private String size;

    Bed(int price) {
        super(price);
    }

    Bed(int price, String size) {
        super(price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "size='" + size + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
