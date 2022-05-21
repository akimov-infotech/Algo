package com.company;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Iterator;

public class BinarySearch {

    public static void RunSample() {

        int[] array = {1, 7, 8, 3, 9, 2};
        Arrays.sort(array);
        var result = rank(9, array);

        System.out.println(result);
    }

    public static void localFiles() {
        int[] whitelist = new In("tinyAllowlist.txt").readAllInts();
        int[] keyslist = new In("tinyText.txt").readAllInts();
        Iterator<Integer> iterator = Arrays.stream(keyslist).iterator();

        Arrays.sort(whitelist);
        while (iterator.hasNext()) { // Read key, print if not in whitelist.
            int key = iterator.next();
            if (BinarySearch.rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }

    public static void readFromFile(String fileName) {
        int[] whitelist = new In(fileName).readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (BinarySearch.rank(key, whitelist) < 0)
                StdOut.println(key);
        }
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
