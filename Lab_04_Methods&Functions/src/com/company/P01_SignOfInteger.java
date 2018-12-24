package com.company;

import java.util.Scanner;

public class P01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        signOfInteger(number);
    }

    public static void signOfInteger(int x) {

        if (x > 0) {
            System.out.printf("The number %d is positive.", x);
        } else if (x < 0) {
            System.out.printf("The number %d is negative.", x);
        } else {
            System.out.printf("The number %d is zero.", x);
        }

    }
}
