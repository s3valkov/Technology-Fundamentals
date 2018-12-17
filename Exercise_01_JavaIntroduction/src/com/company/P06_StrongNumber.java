package com.company;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        long fact;
        long sum = 0;
        int num = number;

        while (number != 0) {
            fact = 1;

            for (int i = 1; i <= number % 10; i++) {
                fact *= i;
            }

            sum += fact;
            number /= 10;

        }

        if (num == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}