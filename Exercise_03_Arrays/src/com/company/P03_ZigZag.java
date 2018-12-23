package com.company;

import java.util.Scanner;

public class P03_ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());
        int[] first = new int[inputLines];
        int[] second = new int[inputLines];

        for (int i = 0; i < inputLines; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i] = Integer.parseInt(numbers[0]);
                second[i] = Integer.parseInt(numbers[1]);
            } else {
                first[i] = Integer.parseInt(numbers[1]);
                second[i] = Integer.parseInt(numbers[0]);
            }

        }

        for (int numbers : first) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int numbers : second) {
            System.out.print(numbers + " ");
        }
    }
}
