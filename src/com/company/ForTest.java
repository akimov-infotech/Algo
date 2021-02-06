package com.company;

public class ForTest {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        
        int x;

        for (x = 0; x < 10; x++);

        for (x = 0; x < 10; x++) {
            System.out.println("This x is: "+ x);
        }
    }
}
