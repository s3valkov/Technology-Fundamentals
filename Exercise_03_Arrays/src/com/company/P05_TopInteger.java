package com.company;

import java.util.Scanner;

public class P05_TopInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int n = numbers.length - 1;

            while (i != n) {

                if (arr[i] > arr[n] && i + 1 < numbers.length) {
                    n--;
                } else {
                    break;
                }

                if (n == i) {
                    System.out.print(arr[i] + " ");
                }

            }
        }

        System.out.print(arr[numbers.length - 1]);
    }
}

