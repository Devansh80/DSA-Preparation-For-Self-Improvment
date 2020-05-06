package com.jwetherell.algorithms.sorts;


public class InsertionSort<T extends Comparable<T>> {

    private InsertionSort() { }

    public static <T extends Comparable<T>> T[] sort(T[] unsorted) {
        int length = unsorted.length;
        for (int i = 1; i < length; i++) {
            sort(i, unsorted);
        }
        return unsorted;
    }

    private static <T extends Comparable<T>> void sort(int i, T[] unsorted) {
        for (int j = i; j > 0; j--) {
            T jthElement = unsorted[j];
            T jMinusOneElement = unsorted[j - 1];
            if (jthElement.compareTo(jMinusOneElement) < 0) {
                unsorted[j - 1] = jthElement;
                unsorted[j] = jMinusOneElement;
            } else {
                break;
            }
        }
    }
}
