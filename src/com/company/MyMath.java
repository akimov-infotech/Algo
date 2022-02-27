package com.company;

public class MyMath {

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;

        while (Math.abs(t - t / c) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }
}
