package ru.mirea.java.task03.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle MyCircle = new Circle("Red", 10);
        MyCircle.calculateS();
        System.out.println(MyCircle.toString());
    }
}
