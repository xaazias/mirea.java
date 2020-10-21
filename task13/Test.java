package ru.mirea.java.task13;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Student[] students =
        {
                new Student("Arthur", 71, new int[] { 3, 2, 3, 3, 3 }),
                new Student("John", 14, new int[] { 4, 5, 3, 2, 3 }),
                new Student("Sadie", 19, new int[] { 4, 4, 5, 5, 3 }),
                new Student("Dutch", 44, new int[] { 4, 5, 4, 2, 4 })
        };

        int[] ids = new int[students.length];
        for (int i = 0; i < students.length; i++) ids[i] = students[i].getId();

        MergeSort.mergeSort(ids, 0, ids.length - 1);
        System.out.println("IDs: " + Arrays.toString(ids));

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(students, 0, students.length - 1);

        for (Student student : students) System.out.println(student.toString());
    }
}
