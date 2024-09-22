package com.mufasa;



public class QuickSort {

    /*
     *
     * Sorts the array in-place in non-decreasing order.
     * @param a the array to be insertionSorted
     * */

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[r];

        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i = i + 1;
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        int swap = a[i + 1];
        a[i + 1] = a[r];
        a[r] = swap;
        return i + 1;
    }


}
