package ru.mirea.java.task07.furnitureShop;

public class Chair extends Furniture {

    private String material;

    Chair(int price) {
        super(price);
    }

    Chair(int price, String material) {
        super(price);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
