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
//        sortedRandomArray();
        //bouncingBall();

        double f058 = -25.27d;
        double f060 = 0.0;
        double res = ((f058 * f060) / 100.0);
        System.out.println(res);

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

    private static void bouncingBall() {
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true) {

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx;
            ry = ry + vy;

            // clear the background
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);

        }
    }
}













