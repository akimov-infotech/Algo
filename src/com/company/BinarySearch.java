package com.company;

import java.util.Arrays;

public class BinarySearch {

    public static void RunSample() {

        int[] array = {1, 7, 8, 3, 9, 2};
        Arrays.sort(array);
        var result = rank(9, array);

        System.out.println(result);
    }

    static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi);
        else
            return mid;
    }
}
