package com.company;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Iterator;

//java -classpath F:\Kotlin\QuickFind\out\production\QuickFind;F:\Kotlin\QuickFind\algs4.jar com.company.EntryPoint tinyAllowlist.txt < tinyText.txt
public class EntryPoint {
    public static void mainE(String[] args) {
	// write your code here
        //System.out.print("Hello Java World!!");

        //var qf = new QuickFindUF(10);

        System.out.println("This is a simple Java program");

        localFiles();
        //BinarySearch.RunSample();

       /* int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty())
        { // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (BinarySearch.rank(key, whitelist) < 0)
                StdOut.println(key);
        }*/
    }

    public static void localFiles(){
        int[] whitelist = new In("tinyAllowlist.txt").readAllInts();
        int[] keyslist = new In("tinyText.txt").readAllInts();
        Iterator<Integer> iterator = Arrays.stream(keyslist).iterator();

        Arrays.sort(whitelist);
        while (iterator.hasNext())
        { // Read key, print if not in whitelist.
            int key = iterator.next();
            if (BinarySearch.rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}
