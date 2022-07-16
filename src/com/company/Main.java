package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int r = scanner.nextInt();

        System.out.println("Area: " + Circle.area(r));
        System.out.println("Circumference: " + Circle.circumference(r));

    }
}