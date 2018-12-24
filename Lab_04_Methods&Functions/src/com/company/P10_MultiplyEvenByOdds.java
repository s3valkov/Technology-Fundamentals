package com.company;

import java.util.Scanner;

public class P10_MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplyEvenByOdd(number));
    }

    static int multiplyEvenByOdd(int a) {
        int evenSum = 0;
        int oddSum = 0;

        while (a != 0) {
            int num = 0;
            num = a % 10;

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            a = a / 10;
        }

        return evenSum * oddSum;
    }
}
