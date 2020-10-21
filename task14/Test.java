package ru.mirea.java.task14;

import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int arraySize = 10000;

        int[] testArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            testArray[i] = new Random().nextInt(100);

        System.out.println(Arrays.toString(testArray));
        long quickSortStartTime = System.currentTimeMillis();
        QuickSort.quickSort(testArray, 0, testArray.length - 1);
        long quickSortTime = System.currentTimeMillis() - quickSortStartTime;
        System.out.println(Arrays.toString(testArray));
        System.out.println(" ~ " + quickSortTime + ".0 milliseconds");

        int[] testArray1 = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            testArray1[i] = new Random().nextInt(100);

        System.out.println("\n" + Arrays.toString(testArray1));
        long mergeSortTimeStart = System.currentTimeMillis();
        QuickSort.quickSort(testArray1, 0, testArray1.length - 1);
        long mergeSortTime = System.currentTimeMillis() - mergeSortTimeStart;
        System.out.println(Arrays.toString(testArray1));
        System.out.println(" ~ " + mergeSortTime + ".0 milliseconds");

        int searchForElement = 44;

        System.out.println("\nBinary Search Iteratively");
        long binarySearchTimeStart = System.currentTimeMillis();
        int binarySearchFoundIndex = BinarySearch.runBinarySearchIteratively(testArray, searchForElement, 0, testArray.length - 1);
        long binarySearchTime = System.currentTimeMillis() - binarySearchTimeStart;
        System.out.println(binarySearchFoundIndex);
        System.out.println(" ~ " + binarySearchTime + ".0 milliseconds");

        System.out.println("\nBinary Search Recursively");
        long binarySearchRecursivelyTimeStart = System.currentTimeMillis();
        int binarySearchRecursivelyFoundIndex = BinarySearch.runBinarySearchIteratively(testArray, searchForElement, 0, testArray.length - 1);
        long binarySearchRecursivelyTime = System.currentTimeMillis() - binarySearchRecursivelyTimeStart;
        System.out.println(binarySearchRecursivelyFoundIndex);
        System.out.println(" ~ " + binarySearchRecursivelyTime + ".0 milliseconds");

        System.out.println("\nLinear Search Iteratively");
        long linearSearchTimeStart = System.currentTimeMillis();
        int linearSearchFoundIndex = LinearSearch.runLinearSearchIteratively(testArray, searchForElement);
        long linearSearchTime = System.currentTimeMillis() - linearSearchTimeStart;
        System.out.println(linearSearchFoundIndex);
        System.out.println(" ~ " + linearSearchTime + ".0 milliseconds");

        System.out.println("\nLinear Search Recursively");
        long linearSearchRecursivelyTimeStart = System.currentTimeMillis();
        int linearSearchRecursivelyFoundIndex = LinearSearch.runLinearSearchRecursively(testArray, 0, testArray.length - 1, searchForElement);
        long linearSearchRecursivelyTime = System.currentTimeMillis() - linearSearchRecursivelyTimeStart;
        System.out.println(linearSearchRecursivelyFoundIndex);
        System.out.println(" ~ " + linearSearchRecursivelyTime + ".0 milliseconds");

        System.out.println("\n - Результат - ");
        System.out.println("Быстрая сортировка: Сложность O(n log n), Время сортировки 10000 элементов " + quickSortTime + ".0 миллисекунд");
        System.out.println("Сортировка слиянием: Сложность O(n log n), Время сортировки 10000 элементов " + mergeSortTime + ".0 миллисекунд");
        System.out.println("Бинарный поиск: Сложность O(log n), Время поиска элемента в 10000 массиве " + binarySearchTime
                + ".0 миллисекунд (" + binarySearchRecursivelyTime + ".0 миллисекунд рекурсивным методом)");
        System.out.println("Линейный поиск: Сложность O(n), Время поиска элемента в 10000 массиве " + linearSearchTime
                + ".0 миллисекунд (" + linearSearchRecursivelyTime + ".0 миллисекунд рекурсивным методом)");
    }
}
