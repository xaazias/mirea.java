package ru.mirea.java.task15;

public class Test {

    public static void main(String[] args) {

        IntegerCollection intCollection = new IntegerCollection();

        /* Добавление элементов */
        intCollection.push(666);
        intCollection.push(5);
        intCollection.push(15);
        intCollection.push(30);
        intCollection.push(10);

        /* Удаление элементов */
        intCollection.pop(0);

        /* Поиск элемента по значению */
        int elementIndex = intCollection.findByValue(5);

        /* Поиск элемента по индексу */
        int elementValue = intCollection.findByIndex(0);

        /* Поиск максимального элемента */
        int elementMax = intCollection.getMax();

        /* Поиск минимального элемента */
        int elementMin = intCollection.getMin();

        /* Поиск среднего арифметического */
        double elementAvg = intCollection.getAvg();

        /* Вывод элементов */
        System.out.println(intCollection.toString());

        System.out.println("\n - Искомый элемент по индексу: " + elementValue);
        System.out.println("\n - Искомый индекс по значению: " + elementIndex);
        System.out.println("\n - Макс. элемент: " + elementMax);
        System.out.println("\n - Мин. элемент: " + elementMin);
        System.out.println("\n - Сред. арифм. элемент: " + elementAvg);
    }
}
