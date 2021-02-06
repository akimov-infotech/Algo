package com.company;

public class Example2 {

    public static void main1(String[] args) {
        var num = 100.5;

        System.out.println("This is num: " + num);

        num = num * 2;

        System.out.print("The value of num * 2 is ");
        System.out.println(num);

        //float value = 10.2E+1;

        System.out.println(nameOf(num));
    }

    private static String nameOf(Object o) {
        return o.getClass().getSimpleName();
    }
}