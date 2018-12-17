package com.company;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (min <= max) {
            sum += min;

            if (min == max) {
                System.out.print(min);
            } else {
                System.out.print(min + " ");
            }
            min++;
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
