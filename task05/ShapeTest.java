package ru.mirea.java.task05;

public class ShapeTest {

    public static void main(String[] args) {

        System.out.println(" - Круг");
        Shape myCircle = new Circle(10);
        System.out.println("Площадь: " + myCircle.getArea());
        System.out.println("Периметр: " + myCircle.getPerimeter());
        System.out.println("toString: " + myCircle.toString());

        System.out.println("\n - Прямоугольник");
        Shape myRectangle = new Rectangle(10, 5, "blue", false);
        System.out.println("Площадь: " + myRectangle.getArea());
        System.out.println("Периметр: " + myRectangle.getPerimeter());
        System.out.println("toString: " + myRectangle.toString());

        System.out.println("\n - Квадрат (Rectangle)");
        Shape mySquare = new Square(10, "red", true);
        System.out.println("Площадь: " + mySquare.getArea());
        System.out.println("Периметр: " + mySquare.getPerimeter());
        System.out.println("toString: " + mySquare.toString());

        System.out.println("\n - Квадрат (Shape)");
        Shape mySquareFixed = new SquareFixed(5);
        System.out.println("Площадь: " + mySquareFixed.getArea());
        System.out.println("Периметр: " + mySquareFixed.getPerimeter());
        System.out.println("toString: " + mySquareFixed.toString());
    }
}
