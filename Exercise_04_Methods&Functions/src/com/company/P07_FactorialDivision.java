package com.company;

import java.util.Scanner;

public class P07_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", factorialDivision(a, b));
    }

    static double factorialDivision(int a, int b) {
        long sum1 = 1;
        long sum2 = 1;

        if (a != 0) {
            for (int i = 1; i <= a; i++) {
                sum1 *= i;
            }
        }

        if (b != 0) {

            for (int i = 1; i <= b; i++) {
                sum2 *= i;
            }

        }

        double result = (double) sum1 / (double) sum2;
        return result;
    }
}
