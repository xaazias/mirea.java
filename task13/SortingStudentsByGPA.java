package ru.mirea.java.task13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public void quickSort(Student[] students, int l, int r) {

        if (students.length == 0) return;
        if (l >= r) return;

        int m = l + (r - l) / 2;
        Student k = students[m];
        int i = l, j = r;

        while (i <= j)
        {
            while (compare(students[i], k) > 0) i++;
            while (compare(students[j], k) < 0) j--;

            if (i <= j)
            {
                Collections.swap(Arrays.asList(students), i, j);
                i++;
                j--;
            }

            if (l < j) quickSort(students, l, j);
            if (r > i) quickSort(students, i, r);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) o1.getAvgScore() - (int) o2.getAvgScore();
    }
}
