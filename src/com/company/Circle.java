package com.company;

public class Circle {

    public static double pi = Math.PI;

    public static double area(int r) {
        return pi * Math.sqrt(r);
    }

    public static double circumference(int r) {
        return pi * 2 * r;
    }
}
