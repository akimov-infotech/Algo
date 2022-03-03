package com.company;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;
import java.util.Arrays;

public class GraphDraw {

    public static void main(String[] args) {
       /* StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(.005);
        StdDraw.point(0.5, 0.5);*/

        //funcValues();
      // randomArray();
        sortedRandomArray();
    }

    private static void funcValues() {
        int N = 100;
        StdDraw.setXscale(-1, N + 1);
        StdDraw.setYscale(-100, N * N + N);

        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    private static void randomArray() {
        //StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(-0.02, 1);
        StdDraw.setYscale(-0.01, 1);

        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    private static void sortedRandomArray() {
        StdDraw.setXscale(-0.02, 1);
        StdDraw.setYscale(-0.01, 1);

        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}













