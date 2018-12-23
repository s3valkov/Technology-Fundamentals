package com.company;

import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];
        int leftSum = 0;
        int rightSum = 0;
        int n = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            leftSum += arr[i];

            while (i + 1 != n) {
                rightSum += arr[n];

                if (leftSum == rightSum && i + 1 == n) {

                    break;
                } else if (n == i) {
                    break;
                } else {
                    n--;
                }

            }

            if (leftSum != rightSum && i + 1 == n) {
                rightSum = 0;
                n = arr.length - 1;
            } else if (i == arr.length - 1) {
                System.out.println("no");
            } else {
                n = i + 1;
                break;
            }
        }

        System.out.println(n);


    }

}


