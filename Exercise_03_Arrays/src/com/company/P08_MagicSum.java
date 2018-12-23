package com.company;

import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];
        int sum = Integer.parseInt(scanner.nextLine());
        int equalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j <= arr.length - 1; j++) {
                equalSum += arr[i] + arr[j];

                if (equalSum == sum && j != i && j > i) {
                    System.out.printf("%d %d\n", arr[i], arr[j]);
                    equalSum = 0;
                    break;
                } else {
                    equalSum = 0;
                }

            }

        }

    }
}
