package ru.mirea.java.task14;

public class LinearSearch {

    public static int runLinearSearchIteratively(int[] arr, int x)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++)
            if (arr[i] == x) return i;

        return -1;
    }

    public static int runLinearSearchRecursively(int[] arr, int l, int r, int x) {

        if (r < l)
            return -1;

        if (arr[l] == x)
            return l;

        if (arr[r] == x)
            return r;

        return runLinearSearchRecursively(arr, l + 1, r - 1, x);
    }
}