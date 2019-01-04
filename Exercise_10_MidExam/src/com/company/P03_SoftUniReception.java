package com.company;

import java.util.Scanner;

public class P03_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployer = Integer.parseInt(scanner.nextLine());
        int secondEmployer = Integer.parseInt(scanner.nextLine());
        int thirdEmployer = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int efficiency = firstEmployer + secondEmployer + thirdEmployer;
        int result = 0;

        while (students > 0) {

            students -= efficiency;
            result++;

            if (result % 4 == 0) result++;

        }

        System.out.printf("Time needed: %dh.", (int) result);
    }
}
