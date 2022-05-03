package com.company;


import algorithms.Exercises1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

//java -classpath F:\Kotlin\QuickFind\out\production\QuickFind;F:\Kotlin\QuickFind\algs4.jar com.company.EntryPoint tinyAllowlist.txt < tinyText.txt
public class EntryPoint {
    public static void main(String[] args) {
	// write your code here
        // System.out.print("Hello Java World!!");

        //var qf = new QuickFindUF(10);

        //System.out.println("This is a simple Java program");

         Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");



        Exercises1.Ex1_1_1();

        //localFiles();

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
