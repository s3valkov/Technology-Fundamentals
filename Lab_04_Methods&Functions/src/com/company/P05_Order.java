package com.company;

import java.util.Scanner;

public class P05_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double result = calculateOrder(cmd, n);

        System.out.printf("%.2f", result);
    }

    static double calculateOrder(String x, int n) {
        double result = 0;

        switch (x) {
            case "water":
                result = n * 1;
                break;
            case "coffee":
                result = n * 1.5;
                break;
            case "coke":
                result = n * 1.4;
                break;
            case "snacks":
                result = n * 2;
                break;
        }

        return result;
    }
}
