package com.company;

public class IfSample {
    public static void main2(String[] args) {
       var num = 3;
        if(num < 100) System.out.println("num is less than 100");

        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;
        if(x == y) System.out.println("x now is equal to y");

        x = x * 2;
        if(x > y) System.out.println("x now is greater than y");
    }
}
