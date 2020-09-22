package ru.mirea.java.task06;

public class MovableTest {

    public static void main(String[] args) {

        System.out.println(" - Круг");
        MovableCircle myMovableCircle = new MovableCircle(2, 1, 1);
        myMovableCircle.moveFor(10, 10);
        System.out.println(myMovableCircle.toString());

        System.out.println("\n - Точка");
        MovablePoint myMovablePoint = new MovablePoint(1, 1);
        myMovablePoint.moveFor(10, 10);
        System.out.println(myMovablePoint.toString());

        System.out.println("\n - Прямоугольник");
        MovableRectangle myMovableRectangle = new MovableRectangle(10, 10, "red", true, 5, 5);
        myMovableRectangle.moveFor(5, 5);
        System.out.println(myMovableRectangle.toString());
    }
}
