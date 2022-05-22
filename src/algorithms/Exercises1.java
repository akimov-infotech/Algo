package algorithms;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.Array;

public class Exercises1 {

    public static void Questions() {
        var result = Math.abs(-2147483648);
        System.out.println(result);//-2147483648

        var s = Double.POSITIVE_INFINITY;
        var sd = Double.NEGATIVE_INFINITY;

       /* int x = StdIn.readInt();
        if(x < 3.1) System.out.println(x); // implicit type conversation */

        /*int p;
        System.out.println(p);// Variable 'p' might not have been initialized */

        int[] a = new int[1];
        int[] b = new int[1];
        float f = 3;

    }

    public static void Ex1_1_1() {
        var res = (0 + 15) / 2;
        System.out.println(res);

        var resDouble = 2.0e-6 * 100000000.1;
        System.out.println(resDouble);

        var resBool = true && false || true && true;
        System.out.println(resBool);
    }

    public static void Ex1_1_2() {
        var resDouble1 = (1 + 2.236) / 2;
        var resDouble2 = 1 + 2 + 3 + 4.0;
        var resBool = 4.1 >= 4;
        var resStr = 1 + 2 + "3";
    }

    public static void Ex1_1_3(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        var result = "не равны";
        if (a == b && b == c)
            result = "равны";

        System.out.println(result);
    }

    public static void Ex1_1_5() {
        double x = Math.random() + Math.random(), y = Math.random() + Math.random();

        if ((x > 0 && x < 1) && (y > 0 && y < 1)) {
            System.out.println(true);
        } else
            System.out.println(false);
    }

    public static void Ex1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void Fibonacci() {
        int fPrev = 0;
        int fCur = 1;
        int tempPrev = 0;

        for (int i = 0; i <= 15; i++) {
            System.out.println(fPrev);

            tempPrev = fPrev;
            fPrev = fCur;
            fCur = tempPrev + fPrev;
        }
    }

    public static void Ex1_1_7_a() {
        double t = 9.0;
        t = 2.93;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            System.out.println(t);
        }
        System.out.printf("%.5f\n", t);
    }

    public static void Ex1_1_7_b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum); // 499500

        int n = 999;
        int a = 1;
        int d = 1;

        int an = a + (n - 1) * d;//999
        int ariphmProgrSum = (n * (a + an) / 2); // 499500
        System.out.println(ariphmProgrSum);

        int ariphmProgrSum1 = n * (2 * a + (n - 1) * d) / 2; // 499500
        System.out.println(ariphmProgrSum1);
    }

    public static void Ex1_1_7_c() {
        int sum = 0;
        int N = 5;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < N; j++)
                sum++;
        StdOut.println(sum);
    }

    public static void Ex1_1_8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('b' + 4));
    }

    public static void Ex1_1_9_ToBinaryString() {
        String s = "";
        int N = 5;
        StringBuilder sb = new StringBuilder(s);
        for (int n = N; n > 0; n /= 2) {
            sb.insert(0, (n % 2));
        }
        System.out.println(sb);
        var res = String.format("Integer.ToBinaryString(%s): %s", N, Integer.toBinaryString(N));
        System.out.println(res);
    }

    public static void Ex1_1_11_PrintTwoDimArray() {
        int cols = 5;
        int rows = 5;
        var logicArray = new boolean[cols][rows];
//        PrintArray(logicArray);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                logicArray[i][j] = Math.random() >= .5;
        }
        //convert booleans to strings
        var strArray = new Character[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                strArray[i][j] = logicArray[i][j] ? '*' : ' ';
        }

        printArray(strArray);
/*
        logicArray[0] = new boolean[]{false, true, true, true, true, true};
        logicArray[1] = new boolean[]{true, true, true, true, true, true};
        logicArray[2] = new boolean[]{false, true, true, true, true, true};
        logicArray[3] = new boolean[]{false, true, true, true, true, true};
        logicArray[4] = new boolean[]{true, true, true, true, true, true};
        PrintArray(logicArray);*/
    }

    public static <T> void printArray(T[][] arr) {
        int cols;
        int rows = arr.length;
        if (arr[0] == null) return;
        cols = arr[0].length;

        var format = "%s\t";
        var colDist = "%s\t";
        if (arr instanceof Double[][]) {
            format = "%.2f\t";
            colDist = "%s\t\t";
        }

        // Numbers of columns
        System.out.print("\t");
        for (int j = 0; j < cols; j++) {
            System.out.printf(colDist, j);
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.printf("%s\t", i); // Row number
            for (int j = 0; j < cols; j++) {
                System.out.printf(format, arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void Ex1_1_13_TwoDimArrayTranspose() {
        int cols = 2;
        int rows = 5;
        var twoDimArray = new Double[rows][cols];
        initArray(twoDimArray);

        printArray(twoDimArray);
        int cols1 = rows;
        int rows1 = cols;
        var transposedArray = new Double[rows1][cols1];
        transposeArray(twoDimArray, transposedArray);

        printArray(transposedArray);
    }

    public static <T> void transposeArray(T[][] srcArr, T[][] resArr) {
        int cols;
        int rows = srcArr.length;
        if (srcArr[0] == null) return;
        cols = srcArr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                resArr[j][i] = srcArr[i][j];
        }
    }

    public static void initArray(Double[][] twoDimArray) {
        int cols;
        int rows = twoDimArray.length;
        if (twoDimArray[0] == null) return;
        cols = twoDimArray[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                twoDimArray[i][j] = Math.random();
        }
    }
}






















