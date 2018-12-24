package com.company;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String cmd = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculation(a, b, cmd));
    }

    static double calculation(double a, double b, String cmd) {
        double result = 0;

        switch (cmd) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        return result;
    }
}
