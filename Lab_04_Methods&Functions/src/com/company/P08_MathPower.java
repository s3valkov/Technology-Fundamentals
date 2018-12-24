package com.company;

import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        double result = calculateExponent(number, pow);

        if (pow == 0) {
            System.out.println(1);
        } else {
            System.out.printf("%.0f", result);
        }

    }

    static double calculateExponent(double x, int power) {
        double result = 1;

        for (int i = 0; i < power; i++)
            result *= x;

        return result;
    }
}
