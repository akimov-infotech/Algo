package com.company;


import algorithms.Exercises1;

import java.util.regex.Pattern;

//java -classpath F:\Kotlin\QuickFind\out\production\QuickFind;F:\Kotlin\QuickFind\algs4.jar com.company.EntryPoint tinyAllowlist.txt < tinyText.txt
public class EntryPoint {
    public static void main(String[] args) {
        // write your code here
        // System.out.print("Hello Java World!!");

        //var qf = new QuickFindUF(10);

        //System.out.println("This is a simple Java program");

        Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

//        Exercises1.Ex1_1_1();
        //Exercises1.Ex1_1_3(null);
//        Exercises1.Ex1_1_5();
//        Exercises1.Ex1_1_6();
//        Exercises1.Fibonacci();
//Exercises1.Ex1_1_7_a();
//Exercises1.Ex1_1_7_b();
//Exercises1.Ex1_1_8();
//Exercises1.Ex1_1_8();

//Exercises1.Ex1_1_9_ToBinaryString();
        //BinarySearch.localFiles();
        //BinarySearch.RunSample();
        /* var fileName = args[0];
        BinarySearch.readFromFile(fileName);*/

       //Exercises1.Ex1_1_11_PrintTwoDimArray();
        Exercises1.Ex1_1_13_TwoDimArrayTranspose();
    }
}
