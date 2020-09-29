package ru.mirea.java.task07.furnitureShop;

public class Test {
    public static void main(String[] args) {
        Furniture myBed = new Bed(9999, "Large");
        Furniture myChair = new Chair(1999, "Wood");
        Furniture mySofa = new Sofa(12999, "Red");

        FurnitureShop store = new FurnitureShop(myBed, myChair, mySofa);
        Person user = new Person();
        user.addToBasket(store.getItem(0));
        user.printBasket();
    }
}
